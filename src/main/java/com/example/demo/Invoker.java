package com.example.demo;

public class Invoker {
    private Command command;

    Invoker(Command command) {
        this.command = command;
    }

    void excuteCommand() {
        this.command.excute();
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
