package org.example;

public class CarConstructorInjection {
    private Engine engine;

    // Constructor Injection
    public CarConstructorInjection(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        CarConstructorInjection car = new CarConstructorInjection(engine);
        car.start();
    }
}