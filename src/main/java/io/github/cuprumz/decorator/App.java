package io.github.cuprumz.decorator;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        FilterInputStream fis = new FilterInputStream(new InputStream());
        fis.read();
    }
}

/**
 * 继承的一种替代方案，动态添加功能
 *
 * 人 和 拿棍子的人
 */