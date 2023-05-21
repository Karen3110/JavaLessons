package com.company.page_loader_from_file;

import com.company.page_loader.exceptions.PageNotFoundException;

public interface PageLoader {

    String loadPage(String url) throws PageNotFoundException;
}
