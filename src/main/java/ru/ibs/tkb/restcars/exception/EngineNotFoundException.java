package ru.ibs.tkb.restcars.exception;

public class EngineNotFoundException extends RuntimeException {
    public EngineNotFoundException() {
    }

    public EngineNotFoundException(String message) {
        super(message);
    }

    public EngineNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public EngineNotFoundException(Throwable cause) {
        super(cause);
    }

    public EngineNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
