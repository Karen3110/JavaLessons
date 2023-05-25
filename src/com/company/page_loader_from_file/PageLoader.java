package com.company.page_loader_from_file;

import com.company.page_loader.exceptions.PageNotFoundException;

public interface PageLoader {

    String loadPage(String url);

    boolean store(String url, String httpContent);
}
