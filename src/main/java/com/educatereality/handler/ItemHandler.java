package com.educatereality.handler;

import com.educatereality.dto.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.Headers;
import io.undertow.util.StatusCodes;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ItemHandler {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static void delete(HttpServerExchange httpServerExchange) throws JsonProcessingException {

        httpServerExchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html");
        httpServerExchange.getResponseSender().send(

                objectMapper
                        .writeValueAsString(Response.<List<Object>>builder()
                                .timestamp(new Timestamp(System.currentTimeMillis()))
                                .status(StatusCodes.OK)
                                .message(StatusCodes.getReason(StatusCodes.OK))
                                .data(new ArrayList<>())
                                .build()));
    }

    public static void post(HttpServerExchange httpServerExchange) throws JsonProcessingException {
        httpServerExchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html");
        httpServerExchange.getResponseSender().send(

                objectMapper
                        .writeValueAsString(Response.<List<Object>>builder()
                                .timestamp(new Timestamp(System.currentTimeMillis()))
                                .status(StatusCodes.OK)
                                .message(StatusCodes.getReason(StatusCodes.OK))
                                .data(new ArrayList<>())
                                .build()));
    }

    public static void getById(HttpServerExchange httpServerExchange) throws JsonProcessingException {
        httpServerExchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html");
        httpServerExchange.getResponseSender().send(

                objectMapper
                        .writeValueAsString(Response.<List<Object>>builder()
                                .timestamp(new Timestamp(System.currentTimeMillis()))
                                .status(StatusCodes.OK)
                                .message(StatusCodes.getReason(StatusCodes.OK))
                                .data(new ArrayList<>())
                                .build()));
    }

    public static void get(HttpServerExchange httpServerExchange) throws JsonProcessingException {
        httpServerExchange.getResponseHeaders().put(Headers.CONTENT_TYPE, "text/html");
        httpServerExchange.getResponseSender().send(

                objectMapper
                        .writeValueAsString(Response.<List<Object>>builder()
                                .timestamp(new Timestamp(System.currentTimeMillis()))
                                .status(StatusCodes.OK)
                                .message(StatusCodes.getReason(StatusCodes.OK))
                                .data(new ArrayList<>())
                                .build()));
    }
}
