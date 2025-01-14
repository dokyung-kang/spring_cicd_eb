package com.example.spring.apiPayload.exception.handler;

import com.example.spring.apiPayload.code.BaseErrorCode;
import com.example.spring.apiPayload.exception.GeneralException;

public class HealthHandler extends GeneralException {

    public HealthHandler(BaseErrorCode errorCode) {
        super(errorCode);
    }
}