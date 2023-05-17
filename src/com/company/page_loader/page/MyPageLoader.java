package com.company.page_loader.page;

import com.company.page_loader.exceptions.InvalidUrlException;
import com.company.page_loader.exceptions.PageNotFoundException;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MyPageLoader implements PageLoader {
    private final List<Page> pages = Arrays.asList(
            new Page("http://main", "This is main content"),
            new Page("http://login", "This is login content"),
            new Page("http://logut", "This is logout content"),
            new Page("http://profile", "This is profile content"),
            new Page("http://media", "This is media content"),
            new Page("http://data", "This is data content")
    );

    private static boolean isInvalidUrl(String url) {
        return url == null || !url.startsWith("http://");
    }

    @Override
    public String loadPage(String url) throws InvalidUrlException, PageNotFoundException {
        if (isInvalidUrl(url)) {
            throw new InvalidUrlException("URL must start with  <http://>");
        }
        Optional<Page> page = pages.stream().filter(item -> item.getUrl().equals(url)).findFirst();
        if (page.isEmpty()) {
            throw new PageNotFoundException("Page with provided URL:" + url + " not found!  HTTP_ERROR_404.");
        }

        return page.get().getContent();
    }

    private static class Page {
        private final String url;

        private final String content;

        public Page(String url, String content) {
            this.url = url;
            this.content = content;
        }

        public String getUrl() {
            return url;
        }

        public String getContent() {
            return content;
        }

    }


}
