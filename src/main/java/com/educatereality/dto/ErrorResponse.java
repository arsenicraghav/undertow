package com.educatereality.dto;

import com.educatereality.util.Util;

import java.sql.Timestamp;

public class ErrorResponse {
    private Timestamp timestamp;
    private Integer status;
    private String error;

    public ErrorResponse(Timestamp timestamp, Integer status, String error) {
        this.timestamp = timestamp;
        this.status = status;
        this.error = error;
    }

    public static ErrorResponseBuilder builder() {
        return new ErrorResponseBuilder();
    }

    public Timestamp getTimestamp() {
        return this.timestamp;
    }

    public Integer getStatus() {
        return this.status;
    }

    public String getError() {
        return this.error;
    }

    @Override
    public String toString() {
        return Util.jsonify(this);
    }

    public static class ErrorResponseBuilder {
        private Timestamp timestamp;
        private Integer status;
        private String error;

        ErrorResponseBuilder() {
        }

        public ErrorResponseBuilder timestamp(Timestamp timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public ErrorResponseBuilder status(Integer status) {
            this.status = status;
            return this;
        }

        public ErrorResponseBuilder error(String error) {
            this.error = error;
            return this;
        }

        public ErrorResponse build() {
            return new ErrorResponse(this.timestamp, this.status, this.error);
        }

    }
}
