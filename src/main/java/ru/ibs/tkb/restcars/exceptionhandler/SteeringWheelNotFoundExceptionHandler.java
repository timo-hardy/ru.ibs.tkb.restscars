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
public class SteeringWheelNotFoundExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(CarNotFoundException.class)
    protected ResponseEntity<SteeringWheelTextException> handleThereIsNoSuchEngineException() {
        return new ResponseEntity<>(
                new SteeringWheelTextException("There is no such steering wheel"),
                HttpStatus.NOT_FOUND);
    }

    @Data
    @AllArgsConstructor
    private static class SteeringWheelTextException {
        private String message;
    }
}
