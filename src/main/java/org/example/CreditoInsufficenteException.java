package org.example;

public class CreditoInsufficenteException extends RuntimeException {
    public CreditoInsufficenteException(String message) {
        super(message);
    }
}
