package com.educatereality.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.undertow.server.HttpHandler;
import io.undertow.server.HttpServerExchange;

public class JsonSerializationHandler implements HttpHandler {

    private final ObjectMapper objectMapper;

    private final HttpHandler next;

    public JsonSerializationHandler(HttpHandler next) {
        this.objectMapper = new ObjectMapper();
        this.next = next;
    }

    @Override
    public void handleRequest(HttpServerExchange exchange) throws Exception {
        if (exchange.isInIoThread()) {
            exchange.dispatch(this);
            return;
        }
        next.handleRequest(exchange);
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }
}
