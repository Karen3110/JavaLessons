package com.company.page_loader;

import java.util.Stack;

public class PageNavigator implements PageLoadedObserver {
    private final Stack<String> backStack = new Stack<>();
    private final Stack<String> forwardStack = new Stack<>();
    private String currentPageUrl;

    @Override
    public void onPageLoaded(String url) {
        if (!url.equals(currentPageUrl)) {
            forwardStack.clear();
            backStack.push(url);
        }
        System.out.println("Navigator acknowledged for url: " + url);
    }

    public String back() {
        String pageToForward = backStack.pop();
        forwardStack.push(pageToForward);
        if (backStack.isEmpty()) {
            return null;
        }

        currentPageUrl = backStack.peek();
        return currentPageUrl;
    }

    public String forward() {
        if (forwardStack.isEmpty()) {
            return null;
        }
        currentPageUrl = forwardStack.pop();
        backStack.push(currentPageUrl);

        return currentPageUrl;
    }

}
