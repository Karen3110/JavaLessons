package com.company.page_loader_from_file;

import com.company.page_loader_from_file.util.HttpClientUtil;

public class HttpPageLoader implements PageLoader {

    HttpClientUtil httpClient = new HttpClientUtil();

    @Override
    public String loadPage(String url) {
        String s = httpClient.doGet(url);
        return s;
    }

    @Override
    public boolean store(String url, String httpContent) {
        return false;
    }


}
