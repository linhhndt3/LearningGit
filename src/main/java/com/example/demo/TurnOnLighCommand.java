package com.example.demo;

public class TurnOnLighCommand implements Command {

    private Light light;

    public TurnOnLighCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        this.light.turnOn();
    }
}
