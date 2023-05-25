package com.company.page_loader_from_file.util;

import java.util.Arrays;
import java.util.List;

public class HttpStatusCodes {
    public static final String NOT_FOUND = "ERROR:404.\nPAGE NOT FOUND.";
    public static final String BAD_REQUEST = "ERROR:400.\nBAD REQUEST.";
    public static final String NO_CONTENT = "ERROR:204.\nNO CONTENT.";

    public static final List<String> CODES = Arrays.asList(NOT_FOUND, NO_CONTENT, BAD_REQUEST);

}
