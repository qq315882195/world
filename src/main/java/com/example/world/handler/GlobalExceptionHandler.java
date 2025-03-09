package com.example.world.handler;

import com.example.world.enums.OrderErrorEnum;
import com.example.world.exception.BusinessException;
import com.example.world.response.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;


@RestControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(value = BusinessException.class)
    public final Result handleBusinessExceptions(BusinessException businessException, WebRequest request) {
        return Result.error( businessException.getMessage(),businessException.getCode());
    }

    @ExceptionHandler(value = Exception.class)
    public final Result handleException(Exception exception, WebRequest request) {
        return Result.error(OrderErrorEnum.OPERATION_ERROR.getDesc(), OrderErrorEnum.OPERATION_ERROR.getCode());
    }
}
