package com.koreait.global.advices;

import com.koreait.global.exceptions.BadRequestException;
import com.koreait.global.rests.JSONError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(basePackages = "org.koreait")
public class CommonRestControllerAdvice {
    @ExceptionHandler(Exception.class)
    public ResponseEntity<JSONError<Object>> errorHandler(Exception e){
        HttpStatus status = HttpStatus.BAD_REQUEST;
        Object message = e.getMessage();

        if(e instanceof BadRequestException badRequestException){
            message = badRequestException.getMessage();
        }

        JSONError<Object> error = new JSONError<>(status, message);

        return ResponseEntity.status(status).body(error);
    }
}
