package io.github.cuprumz.singleton;

public class App {
    public static void main(String[] args) {
        One o1 = One.INSTANCE;
        One o2 = One.INSTANCE;
        assert (o1 == o2);
    }
}
