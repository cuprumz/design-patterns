package io.github.cuprumz.abstractfactory;

public class NOPLogger implements Logger {

    public static final NOPLogger NOP_LOGGER = new NOPLogger();

    @Override
    public String getName() {
        return "NOP";
    }
}
