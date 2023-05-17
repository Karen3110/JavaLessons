package com.company.page_loader.page;

import com.company.page_loader.PageLoadedObserver;
import com.company.page_loader.exceptions.InvalidUrlException;
import com.company.page_loader.exceptions.PageNotFoundException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CachedPageLoader implements PageLoader {
    PageLoader pageLoader = new MyPageLoader();
    Map<String, String> cache = new HashMap<>();

    private final List<PageLoadedObserver> observers = new ArrayList<>();

    @Override
    public String loadPage(String url) throws InvalidUrlException, PageNotFoundException {
        String result;
        if (cache.containsKey(url)) {
            result = cache.get(url);
        } else {
            String content = pageLoader.loadPage(url);
            cache.put(url, "<Cache>: " + content);
            result = content;
        }
        for (PageLoadedObserver observer : observers) {
            observer.onPageLoaded(url);
        }

        return result;
    }

    public void registerObserver(PageLoadedObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(PageLoadedObserver observer) {
        observers.remove(observer);
    }
}
