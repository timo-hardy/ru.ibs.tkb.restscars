package ru.ibs.tkb.restcars.exception;

public class GearsNotFoundException extends RuntimeException {
    public GearsNotFoundException() {
    }

    public GearsNotFoundException(String message) {
        super(message);
    }

    public GearsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public GearsNotFoundException(Throwable cause) {
        super(cause);
    }

    public GearsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
