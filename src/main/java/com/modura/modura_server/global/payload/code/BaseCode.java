package com.modura.modura_server.global.payload.code;

import org.springframework.http.HttpStatus;

public interface BaseCode {
    HttpStatus getHttpStatus();
    String getCode();
    String getMessage();
}