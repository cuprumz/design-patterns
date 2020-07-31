package io.github.cuprumz.factory;

public class SimpleBeanFactory implements BeanFactory {
    @Override
    public Object getBean(String beanName) {
        return new Object();
    }

    public static void main(String[] args) {
        SimpleBeanFactory factory = new SimpleBeanFactory();

        Object bean = factory.getBean("beanName");
        System.out.println("Bean Object: " + bean);
    }
}
