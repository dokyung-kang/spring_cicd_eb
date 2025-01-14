package com.example.spring.converter;

import com.example.spring.web.dto.HealthResponse;

public class HealthConverter {

    public static HealthResponse.HealthTestDTO toHealthTestDTO(){
        return HealthResponse.HealthTestDTO.builder()
                .testString("This is Health Test!")
                .build();
    }
}