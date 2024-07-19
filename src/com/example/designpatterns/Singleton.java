package com.example.designpatterns;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Construtor privado para evitar múltiplas instâncias
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Singleton instance says hello!");
    }
}
