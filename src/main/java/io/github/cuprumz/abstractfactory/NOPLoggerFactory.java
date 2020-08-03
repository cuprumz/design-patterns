package io.github.cuprumz.abstractfactory;

public class NOPLoggerFactory implements ILoggerFactory {

    public NOPLoggerFactory() {
        // nothing to do
    }

    @Override
    public Logger getLogger(String name) {
        return NOPLogger.NOP_LOGGER;
    }
}
