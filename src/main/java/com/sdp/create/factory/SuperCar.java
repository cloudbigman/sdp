package com.sdp.create.factory;

public class SuperCar implements ICar {
    public void start() {
        System.out.println("SuperCar start");
    }

    public void stop() {
        System.out.println("SuperCar stop");
    }

    public void speed() {
        System.out.println("SuperCar speed");
    }
}
