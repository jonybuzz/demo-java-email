package com.example.email;


public class Application {

    public static void main(String... args) {
        EmailSender emailSender = new EmailSender();

        emailSender.send("jbuzzetti.jp@gmail.com", "jony.buzz@hotmail.com", "Pruebita", "hola como te va, mundo!\nSlds");
    }

}
