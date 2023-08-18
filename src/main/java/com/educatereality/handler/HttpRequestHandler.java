package com.educatereality.handler;

import com.educatereality.util.Constants;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class HttpRequestHandler implements HttpHandler {

    private final HttpHandler next;

    public HttpRequestHandler(HttpHandler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {

        exchange.getResponseHeaders().put(Headers.CONTENT_TYPE, Constants.APPLICATION_JSON);

        if (exchange.isInIoThread()) {
            exchange.dispatch(this);
            return;
        }
        next.handleRequest(exchange);
    }

}
