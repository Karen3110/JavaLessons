package com.company.page_loader_from_file.util;

import com.company.page_loader.exceptions.PageNotFoundException;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClientUtil {
    HttpClient httpClient = HttpClient.newHttpClient();
    HttpResponse response;

    public String doGet(String url) {
        HttpRequest request;
        try {
            request = HttpRequest.newBuilder()
                    .uri(new URI(url))
                    .headers("Content-Type", "text/plain;charset=UTF-8")
                    .GET()
                    .build();
            response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        } catch (URISyntaxException | IOException | InterruptedException e) {
            return HttpStatusCodes.NOT_FOUND;
        }
        return (String) response.body();
    }
}
