package com.educatereality.dto;

import com.educatereality.util.Util;

import java.sql.Timestamp;

public class Response<T> {
    private Timestamp timestamp;
    private Integer status;
    private String message;
    private T data;

    public Response(Timestamp timestamp, Integer status, String message, T data) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public static <T> ResponseBuilder<T> builder() {
        return new ResponseBuilder<T>();
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getMessage() {
        return this.message;
    }

    public T getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return Util.jsonify(this);
    }

    public static class ResponseBuilder<T> {
        private Timestamp timestamp;
        private Integer status;
        private String message;
        private T data;

        ResponseBuilder() {
        }

        public ResponseBuilder<T> timestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ResponseBuilder<T> status(Integer status) {
            this.status = status;
            return this;
        }

        public ResponseBuilder<T> message(String message) {
            this.message = message;
            return this;
        }

        public ResponseBuilder<T> data(T data) {
            this.data = data;
            return this;
        }

        public Response<T> build() {
            return new Response<T>(this.timestamp, this.status, this.message, this.data);
        }
    }
}
