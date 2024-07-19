package com.example.designpatterns;

// Interface Strategy
interface Strategy {
    int execute(int a, int b);
}

// Implementação da Strategy: Adição
class AdditionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a + b;
    }
}

// Implementação da Strategy: Subtração
class SubtractionStrategy implements Strategy {
    @Override
    public int execute(int a, int b) {
        return a - b;
    }
}

// Contexto que usa a Strategy
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}
