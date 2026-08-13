package com.bank.exception;

public class AccountFoundException extends RuntimeException {
    public AccountFoundException(String message) {
        super(message);
    }
}
