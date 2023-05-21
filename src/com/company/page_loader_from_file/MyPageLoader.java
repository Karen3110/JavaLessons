package com.company.page_loader_from_file;

import com.company.page_loader.exceptions.PageNotFoundException;

public class MyPageLoader implements PageLoader {


    @Override
    public String loadPage(String url) throws PageNotFoundException {
        if (!FileUtil.fileExists(url)) {
            throw new PageNotFoundException("Page with rpvided name:" + url + " not found");
        }

        String s = FileUtil.readFromFile(url);
        return s == null ? "EMPTY_PAGE" : s;

    }


}
