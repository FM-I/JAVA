package com.education.ztu;

public class Car {
    private String brand;
    private  Engine engine;

    public  Car(){
        brand = "No name";
        engine = new Engine();
    }

    public Car(String brand){
        this.brand = brand;
        engine = new Engine();
    }

    public void start(){
        engine.startEngine();
    }

    public void stop(){
        engine.stopEngine();
    }

    public boolean enginesIsRunning(){
        return  engine.engineWorks;
    }

    public class Engine {
        private boolean engineWorks;

        public Engine(){
            engineWorks = false;
        }

        public void startEngine(){
            engineWorks = true;
        }

        public  void stopEngine(){
            engineWorks = false;
        }
    }

}
