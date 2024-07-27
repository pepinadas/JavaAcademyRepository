package org.example;

public class CarSetterInjection {
    private Engine engine;

    // Setter Injection
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        CarSetterInjection car = new CarSetterInjection();
        car.setEngine(engine);
        car.start();
    }
}