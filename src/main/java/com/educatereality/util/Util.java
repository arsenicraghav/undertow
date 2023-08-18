package com.educatereality.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.undertow.util.HttpString;

public class Util {

    private static final ObjectMapper objectMapper = new ObjectMapper();

    public static String jsonify(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
        }
        return HttpString.EMPTY.toString();
    }

}
