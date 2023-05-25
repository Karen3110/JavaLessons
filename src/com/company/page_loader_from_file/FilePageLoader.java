package com.company.page_loader_from_file;

import com.company.page_loader_from_file.util.FileUtil;
import com.company.page_loader_from_file.util.HttpStatusCodes;

public class FilePageLoader implements PageLoader {

    private static final String FILE_TYPE = ".txt";

    @Override
    public String loadPage(String url) {
        if (url.startsWith("https://")) {
            url = url.replace("https://", "").concat(FILE_TYPE);
        }
        if (!FileUtil.fileExists(url)) {
            return HttpStatusCodes.NOT_FOUND;
        }

        String s = FileUtil.readFromFile(url);
        return s == null ? HttpStatusCodes.NO_CONTENT : s;

    }

    @Override
    public boolean store(String url, String httpContent) {
        boolean b = FileUtil.saveOrUpdate(url + FILE_TYPE, httpContent);
        return b;
    }


}
