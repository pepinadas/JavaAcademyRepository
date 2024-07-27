package org.example;

public class CarFieldInjection {
    // Field Injection
    private Engine engine;

    public CarFieldInjection(Engine engine) {
        this.engine = engine; // Simulación de la inyección de campo
    }

    public void start() {
        engine.start();
    }

    public static void main(String[] args) {
        Engine engine = new DieselEngine();
        CarFieldInjection car = new CarFieldInjection(engine); // Inyección manual
        car.start();
    }
}