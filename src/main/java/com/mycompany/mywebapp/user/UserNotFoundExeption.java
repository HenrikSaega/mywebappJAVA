package com.mycompany.mywebapp.user;

public class UserNotFoundExeption extends Throwable {
    public UserNotFoundExeption(String message) {
        super(message);
    }
}
