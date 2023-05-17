package com.company.page_loader;

import com.company.page_loader.exceptions.InvalidUrlException;
import com.company.page_loader.exceptions.PageNotFoundException;
import com.company.page_loader.util.ConsoleColors;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyPageLoader pageLoader = new MyPageLoader();

        String inputCommand;
        String pageContent;

        do {
            System.out.print("ENTER URL: ");
            inputCommand = sc.nextLine();
            if (inputCommand.equals("stop")) {
                break;
            }
            try {
                pageContent = pageLoader.loadPage(inputCommand);
                System.out.println("PAGE CONTENT: " + ConsoleColors.GREEN + pageContent + ConsoleColors.RESET);

            } catch (InvalidUrlException | PageNotFoundException e) {
                System.out.println(ConsoleColors.RED + e.getMessage() + ConsoleColors.RESET);
            }


        } while (true);
    }
}
