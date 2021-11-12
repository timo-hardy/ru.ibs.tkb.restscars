package ru.ibs.tkb.restcars.exceptionhandler;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import ru.ibs.tkb.restcars.exception.CarNotFoundException;

@ControllerAdvice
public class CarNotFoundExceptionHandler {
    @ExceptionHandler(CarNotFoundException.class)
    public String handleCarNotFound(
            Model model, CarNotFoundException e
    ) {
        model.addAttribute("message", e.getMessage());
        return "bbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbb";
    }
}
