package com.company.page_loader_from_file;

import java.io.*;
import java.util.Arrays;

public class FileUtil {
    private static final String BASE_DIR = "files";

    public static boolean fileExists(String url) {
        File dir = new File(BASE_DIR);
        if (dir.exists() && dir.isDirectory()) {
            String[] fileList = dir.list();
            if (fileList != null) {
                return Arrays.asList(fileList).contains(url);
            }
        }
        return false;
    }

    public static String readFromFile(String url) {
        StringBuilder result = new StringBuilder();
        FileReader fileReader;
        try {
            fileReader = new FileReader(BASE_DIR + File.separator + url);
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
            return null;
        }
        BufferedReader reader = new BufferedReader(fileReader);
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                result.append("\n").append(line);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            reader.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return null;
        }
        return result.toString();
    }
}
