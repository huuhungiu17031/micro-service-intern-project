package com.microservice.store.handler;

import com.microservice.store.exception.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ProblemDetail;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalHandler {

    @ExceptionHandler(Exception.class)
    ProblemDetail handleException(Exception exc) {
        return generateProblemDetail(exc.getLocalizedMessage(), HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(NotFoundException.class)
    ProblemDetail handleNotFound(Exception exc) {
        return generateProblemDetail(exc.getLocalizedMessage(), HttpStatus.NOT_FOUND);
    }

    private ProblemDetail generateProblemDetail(String errorMessage, HttpStatus status) {
        ProblemDetail problemDetail = ProblemDetail.forStatusAndDetail(
                status,
                errorMessage);
        problemDetail.setProperty("Timestamp", System.currentTimeMillis());
        return problemDetail;
    }
}
