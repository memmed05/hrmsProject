package com.example.hrms.core.utilities.results;

public class ErrorResult extends Result {

    public ErrorResult() {
        super(true);
    }

    public ErrorResult(String message) {
        super(false, message);
    }
}
