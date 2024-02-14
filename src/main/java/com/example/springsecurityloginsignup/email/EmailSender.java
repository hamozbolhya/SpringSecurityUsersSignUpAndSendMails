package com.example.springsecurityloginsignup.email;

public interface EmailSender {
    void send(String to, String email);
}
