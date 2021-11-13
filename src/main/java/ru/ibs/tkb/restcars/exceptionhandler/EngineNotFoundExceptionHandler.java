package ru.ibs.tkb.restcars.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.ibs.tkb.restcars.exception.EngineNotFoundException;

@ControllerAdvice
public class EngineNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(EngineNotFoundException.class)
    protected ResponseEntity<EngineTextException> handleThereIsNoSuchEngineException() {
        return new ResponseEntity<>(
                new EngineTextException("There is no such engine"),
                HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class EngineTextException {
        private String message;
    }
}
