package com.example.designpatterns;

public class Main {
    public static void main(String[] args) {
        // Testando Singleton
        Singleton singleton = Singleton.getInstance();
        singleton.showMessage();

        // Testando Strategy
        Context context = new Context();

        // Adição
        context.setStrategy(new AdditionStrategy());
        System.out.println("Addition: " + context.executeStrategy(5, 3));

        // Subtração
        context.setStrategy(new SubtractionStrategy());
        System.out.println("Subtraction: " + context.executeStrategy(5, 3));

        // Testando Facade
        Facade facade = new Facade();
        facade.doOperation();
    }
}

