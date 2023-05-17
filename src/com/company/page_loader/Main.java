package com.company.page_loader;

import com.company.page_loader.exceptions.InvalidUrlException;
import com.company.page_loader.exceptions.PageNotFoundException;
import com.company.page_loader.page.CachedPageLoader;
import com.company.page_loader.page.PageLoader;
import com.company.page_loader.util.ConsoleColors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CachedPageLoader pageLoader = new CachedPageLoader();
        PageNavigator navigator = new PageNavigator();

        pageLoader.registerObserver(navigator);

        String inputCommand;
        do {
            System.out.print("ENTER <URL> OR <back> OR <forward> OR <stop> : ");
            inputCommand = sc.nextLine();

            if (inputCommand.equals("stop")) {
                break;
            } else if (inputCommand.equals("back")) {
                loadPage(pageLoader, goBack(navigator));
            } else if (inputCommand.equals("forward")) {
                loadPage(pageLoader, goForward(navigator));
            } else {
                loadPage(pageLoader, inputCommand);
            }


        } while (true);


    }

    private static String goBack(PageNavigator navigator) {
        String back = navigator.back();
        if (back == null) {
            System.out.println(ConsoleColors.RED + "NO PAGES TO GO BACK" + ConsoleColors.RESET);
            return null;
        }
        return back;
    }

    private static String goForward(PageNavigator navigator) {
        String forward = navigator.forward();
        if (forward == null) {
            System.out.println(ConsoleColors.RED + "NO PAGES TO GO FORWARD" + ConsoleColors.RESET);
        }
        return forward;
    }

    private static void loadPage(PageLoader pageLoader, String inputCommand) {
        try {
            String pageContent = pageLoader.loadPage(inputCommand);
            System.out.println("PAGE CONTENT: " + ConsoleColors.GREEN + pageContent + ConsoleColors.RESET);

        } catch (InvalidUrlException | PageNotFoundException e) {
            System.out.println(ConsoleColors.RED + e.getMessage() + ConsoleColors.RESET);
        }
    }


}
