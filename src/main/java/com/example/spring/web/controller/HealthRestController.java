package com.example.spring.web.controller;

import com.example.spring.apiPayload.ApiResponse;
import com.example.spring.converter.HealthConverter;
import com.example.spring.web.dto.HealthResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HealthRestController {


    @GetMapping("/health")
    public ApiResponse<HealthResponse.HealthTestDTO> testAPI(){

        return ApiResponse.onSuccess(HealthConverter.toHealthTestDTO());
    }

}