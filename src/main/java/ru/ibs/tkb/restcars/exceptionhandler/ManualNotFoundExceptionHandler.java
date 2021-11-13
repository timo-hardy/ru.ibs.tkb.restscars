package ru.ibs.tkb.restcars.exceptionhandler;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
import ru.ibs.tkb.restcars.exception.EngineNotFoundException;
import ru.ibs.tkb.restcars.exception.ManualNotFoundException;

@ControllerAdvice
public class ManualNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(ManualNotFoundException.class)
    protected ResponseEntity<ManualTextException> handleThereIsNoSuchManualException() {
        return new ResponseEntity<>(
                new ManualTextException("There is no such manual"),
                HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class ManualTextException {
        private String message;
    }
}
