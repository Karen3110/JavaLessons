package com.company.page_loader.page;

import com.company.page_loader.exceptions.InvalidUrlException;
import com.company.page_loader.exceptions.PageNotFoundException;

public interface PageLoader {

    String loadPage(String url) throws InvalidUrlException, PageNotFoundException;
}
