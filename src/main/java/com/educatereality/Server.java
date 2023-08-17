package com.educatereality;

import io.undertow.Undertow;
import io.undertow.util.Headers;

public class Server {
    private static Undertow build() {
        return Undertow
                .builder()
                // Set up the listener - you can change the port/host here
                // 0.0.0.0 means "listen on ALL available addresses"
                .addHttpListener(8080, "0.0.0.0")

                .setHandler(exchange -> {
                    // Sets the return Content-Type to text/html
                    exchange.getResponseHeaders()
                            .put(Headers.CONTENT_TYPE, "text/html");

                    // Returns a hard-coded HTML document
                    exchange.getResponseSender()
                            .send("<html>" +
                                    "<body>" +
                                    "<h1>Hello, world!</h1>" +
                                    "</body>" +
                                    "</html>");
                }).build();
    }

    public void start() {
        // Boot the web server
        build().start();
    }
}
