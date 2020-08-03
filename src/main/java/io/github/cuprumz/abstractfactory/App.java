package io.github.cuprumz.abstractfactory;

public class App {
    public static void main(String[] args) {
        ILoggerFactory factory = new NOPLoggerFactory();
        Logger logger = factory.getLogger("name");
        System.out.print(logger);
    }
}

/**
 * 抽象工厂设计模式
 *
 * A factory of factories;
 *
 * ILoggerFactory factory = new NOPLoggerFactory();子类决定concrete具体工厂类型
 */
