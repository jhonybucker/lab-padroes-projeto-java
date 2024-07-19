package com.example.designpatterns;

// Sistema Complexo A
class SubsystemA {
    public void operationA() {
        System.out.println("Operation A");
    }
}

// Sistema Complexo B
class SubsystemB {
    public void operationB() {
        System.out.println("Operation B");
    }
}

// Sistema Complexo C
class SubsystemC {
    public void operationC() {
        System.out.println("Operation C");
    }
}

// Facade
public class Facade {
    private SubsystemA subsystemA;
    private SubsystemB subsystemB;
    private SubsystemC subsystemC;

    public Facade() {
        subsystemA = new SubsystemA();
        subsystemB = new SubsystemB();
        subsystemC = new SubsystemC();
    }

    public void doOperation() {
        subsystemA.operationA();
        subsystemB.operationB();
        subsystemC.operationC();
    }
}
