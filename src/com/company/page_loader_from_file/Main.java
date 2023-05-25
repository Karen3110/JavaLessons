package com.company.page_loader_from_file;

public class Main {

//    public static void main(String[] args) {
//        PageLoader pageLoader = new FilePageLoader();
//
//        try {
//            System.out.println(pageLoader.loadPage("main.txt"));
//        } catch (PageNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//
//        try {
//            System.out.println(pageLoader.loadPage("login.txt"));
//        } catch (PageNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println(pageLoader.loadPage("logout.txt"));
//        } catch (PageNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//        try {
//            System.out.println(pageLoader.loadPage("other.txt"));
//        } catch (PageNotFoundException e) {
//            System.out.println(e.getMessage());
//        }
//
//    }

    public static void main(String[] args) {
        CachedHttpPageLoader pageLoader = new CachedHttpPageLoader();

        String s = pageLoader.loadPage("https://www.google.com");
        System.out.println(s);

         s = pageLoader.loadPage("https://www.google.com");
        System.out.println(s);

         s = pageLoader.loadPage("https://www.google.com");
        System.out.println(s);


    }
}
