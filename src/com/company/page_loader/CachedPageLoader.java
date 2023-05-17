package com.company.page_loader;

import com.company.page_loader.exceptions.InvalidUrlException;
import com.company.page_loader.exceptions.PageNotFoundException;

import java.util.HashMap;
import java.util.Map;

public class CachedPageLoader implements PageLoader {
    PageLoader pageLoader = new MyPageLoader();
    Map<String, String> cache = new HashMap<>();

    @Override
    public String loadPage(String url) throws InvalidUrlException, PageNotFoundException {

        if (cache.containsKey(url)) {
            return cache.get(url);
        } else {
            String content = pageLoader.loadPage(url);
            cache.put(url, "<Cache>: " + content);
            return content;
        }

    }
}
