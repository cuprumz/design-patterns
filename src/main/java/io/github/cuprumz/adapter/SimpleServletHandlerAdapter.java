package io.github.cuprumz.adapter;

import javax.servlet.Servlet;

public class SimpleServletHandlerAdapter implements HandlerAdapter {
    @Override
    public boolean supports(Object handler) {
        return (handler instanceof Servlet);
    }
}
