package com.example.hrms.core.utilities.results;

public class ErrorDataResult<T> extends DataResult<T> {

    public ErrorDataResult(String message, T data) {
        super(false, message, data);
    }

    public ErrorDataResult(String message) {
        super(false, message);
    }

    public ErrorDataResult() {
        super(false, (T) null);

    }
}
