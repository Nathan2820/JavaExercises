package com.qa.day7;

public class GreaterThanException extends Exception{
    
    public GreaterThanException(String errorMessage){
        super(errorMessage);
    }
    public GreaterThanException(String errorMessage, Throwable error){
        super(errorMessage, error);
    }
}
