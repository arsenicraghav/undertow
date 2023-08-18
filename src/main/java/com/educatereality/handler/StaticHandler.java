package com.educatereality.handler;

import com.educatereality.util.Constants;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;

public class StaticHandler implements HttpHandler {
    @Override
    public void handleRequest(HttpServerExchange httpServerExchange) throws Exception {
        httpServerExchange.getResponseHeaders().put(Headers.CONTENT_TYPE, Constants.TEXT_HTML);
        httpServerExchange.getResponseSender().send(Constants.WELCOME);
    }
}
