package com.company.page_loader_from_file;

import com.company.page_loader_from_file.util.HttpStatusCodes;

import java.util.HashMap;
import java.util.Map;

public class CachedHttpPageLoader {
    private PageLoader filePageLoader = new FilePageLoader();
    private HttpPageLoader httpPageLoader = new HttpPageLoader();

    private Map<String, String> cache = new HashMap<>();

    private static boolean contentExists(String content) {
        return content != null && !HttpStatusCodes.CODES.contains(content);
    }

    public String loadPage(String url) {
        if (cache.containsKey(url)) {
            return "<cache> " + cache.get(url);
        }
        String contentFromFile = filePageLoader.loadPage(url);
        if (contentExists(contentFromFile)) {
            cache.put(url, "<file> " + contentFromFile);
            return contentFromFile;
        }
        String contentFromHttp = httpPageLoader.loadPage(url);
        if (contentExists(contentFromHttp)) {
            boolean stored = filePageLoader.store(url, contentFromHttp);
            if (stored) {
                cache.put(url, "<http> " + contentFromHttp);
                return contentFromHttp;
            }
            return HttpStatusCodes.BAD_REQUEST;
        }


        return HttpStatusCodes.BAD_REQUEST;
    }

}
