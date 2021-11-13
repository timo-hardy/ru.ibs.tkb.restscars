package ru.ibs.tkb.restcars.exception;

public class PistonsNotFoundException extends RuntimeException {
    public PistonsNotFoundException() {
    }

    public PistonsNotFoundException(String message) {
        super(message);
    }

    public PistonsNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public PistonsNotFoundException(Throwable cause) {
        super(cause);
    }

    public PistonsNotFoundException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
