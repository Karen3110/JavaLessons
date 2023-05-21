package com.company.page_loader_from_file;

import com.company.page_loader.exceptions.PageNotFoundException;

public class Main {

    public static void main(String[] args) {
        PageLoader pageLoader = new MyPageLoader();

        try {
            System.out.println(pageLoader.loadPage("main.txt"));
        } catch (PageNotFoundException e) {
            System.out.println(e.getMessage());
        }


        try {
            System.out.println(pageLoader.loadPage("login.txt"));
        } catch (PageNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pageLoader.loadPage("logout.txt"));
        } catch (PageNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(pageLoader.loadPage("other.txt"));
        } catch (PageNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
