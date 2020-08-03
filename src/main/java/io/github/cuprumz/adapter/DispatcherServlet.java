package io.github.cuprumz.adapter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DispatcherServlet {
    private static final Logger logger = LoggerFactory.getLogger(DispatcherServlet.class);

    public void dispatch(HandlerAdapter adapter) {
        logger.info("dispatch, " + adapter);
    }
}
