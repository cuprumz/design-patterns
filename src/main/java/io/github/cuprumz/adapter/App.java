package io.github.cuprumz.adapter;

public class App {
    public static void main(String[] args) {
        DispatcherServlet dispatcherServlet = new DispatcherServlet();
        dispatcherServlet.dispatch(new SimpleServletHandlerAdapter());
    }
}
