package ru.ibs.tkb.restcars.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;

@ControllerAdvice
public class CarNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    protected ResponseEntity<TextException> handleThereIsNoSuchCarException() {
        return new ResponseEntity<>(
                new TextException("There is no such car"),
                HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class TextException {
        private String message;
    }
}
