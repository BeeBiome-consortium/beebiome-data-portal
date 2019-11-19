package org.beebiome.dataportal.core.exception;

public class BeebiomeException extends RuntimeException {

    private static final long serialVersionUID = -8535671136132917537L;

    public BeebiomeException(Exception e) {
        super(e);
    }

    public BeebiomeException(String string) {
        super(string);
    }

    public BeebiomeException(String message, Exception e) {
        super(message, e);
    }
}
