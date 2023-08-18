package com.educatereality.integration;

import com.educatereality.undertow.Server;
import com.educatereality.util.Constants;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse.BodyHandlers;

import static org.junit.Assert.assertTrue;

public class ServerIT {

    private final String SERVER_URI = "http://localhost:8080";
    private Server server;

    @Before
    public void setUp() throws Exception {
        server = new Server();
        server.start();
    }

    @After
    public void tearDown() throws Exception {
        if (server != null) {
            server.stop();
        }
    }

    @Test
    public void serverStartedTest() throws IOException, InterruptedException {
        var request = HttpRequest
                .newBuilder(URI.create(SERVER_URI))
                .build();

        var response = HttpClient
                .newHttpClient()
                .send(request, BodyHandlers.ofString());

        assertTrue(response.body() != null);

        assertTrue(Constants.WELCOME.equals(response.body()));
    }
}
