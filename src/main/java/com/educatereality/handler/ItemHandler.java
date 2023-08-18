package com.educatereality.handler;

import com.educatereality.dto.Response;
import io.undertow.server.HttpServerExchange;
import io.undertow.util.StatusCodes;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class ItemHandler {
    public void delete(HttpServerExchange httpServerExchange) {

        httpServerExchange.getResponseSender().send(

                Response.<List<Object>>builder()
                        .timestamp(new Timestamp(System.currentTimeMillis()))
                        .status(StatusCodes.OK)
                        .message(StatusCodes.getReason(StatusCodes.OK))
                        .data(new ArrayList<>())
                        .build().toString());

    }

    public void post(HttpServerExchange httpServerExchange) {
        httpServerExchange.getResponseSender().send(

                Response.<List<Object>>builder()
                        .timestamp(new Timestamp(System.currentTimeMillis()))
                        .status(StatusCodes.OK)
                        .message(StatusCodes.getReason(StatusCodes.OK))
                        .data(new ArrayList<>())
                        .build().toString());
    }

    public void getById(HttpServerExchange httpServerExchange) {
        httpServerExchange.getResponseSender().send(

                Response.<List<Object>>builder()
                        .timestamp(new Timestamp(System.currentTimeMillis()))
                        .status(StatusCodes.OK)
                        .message(StatusCodes.getReason(StatusCodes.OK))
                        .data(new ArrayList<>())
                        .build().toString());
    }

    public void get(HttpServerExchange httpServerExchange) {
        httpServerExchange.getResponseSender().send(

                Response.<List<Object>>builder()
                        .timestamp(new Timestamp(System.currentTimeMillis()))
                        .status(StatusCodes.OK)
                        .message(StatusCodes.getReason(StatusCodes.OK))
                        .data(new ArrayList<>())
                        .build().toString());
    }
}
