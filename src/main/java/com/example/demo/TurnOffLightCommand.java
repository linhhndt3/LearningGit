package com.example.demo;

public class TurnOffLightCommand implements Command{

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = light;
    }

    @Override
    public void excute() {
        this.light.turnOff();
    }
}
