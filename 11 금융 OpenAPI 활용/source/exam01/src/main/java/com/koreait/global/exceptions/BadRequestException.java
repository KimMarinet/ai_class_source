package com.koreait.global.exceptions;

import org.springframework.validation.Errors;

import java.util.List;

public class BadRequestException extends RuntimeException{
    public List<String> message;

    public BadRequestException(Errors errors){
        List<String> errorMessages = errors.getFieldErrors().stream().map(e -> e.getDefaultMessage()).toList();
        this.message = errorMessages;
    }
}
