package ru.ibs.tkb.restcars.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;

@ControllerAdvice
public class PistonsNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    protected ResponseEntity<PistonsTextException> handleThereIsNoSuchPostonsException() {
        return new ResponseEntity<>(
                new PistonsTextException("There is no such pistons"),
                HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class PistonsTextException {
        private String message;
    }
}
