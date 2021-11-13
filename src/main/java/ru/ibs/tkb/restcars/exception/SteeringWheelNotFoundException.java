package ru.ibs.tkb.restcars.exception;

public class SteeringWheelNotFoundException extends RuntimeException {
    public SteeringWheelNotFoundException() {
    }

    public SteeringWheelNotFoundException(String message) {
        super(message);
    }

    public SteeringWheelNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SteeringWheelNotFoundException(Throwable cause) {
        super(cause);
    }

    public SteeringWheelNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
