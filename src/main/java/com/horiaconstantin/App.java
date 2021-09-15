package com.horiaconstantin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger LOG = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        App app = new App();

        app.wrapper(true);
    }

    public boolean wrapper(boolean throwException) {
        try {
            return logging(throwException);
        } catch (Exception ex){
            LOG.error("Logging exception before throwing it again.", ex);
            throw ex;
        }
    }

    public boolean logging(boolean throwException) {
        LOG.trace("Hello World!");

        String name = "world";
        LOG.debug("Hi, {}", name);
        LOG.debug("Hi, {}", name);
        LOG.debug("Hi, {}", name);
        LOG.info("Welcome to the HelloWorld example of Logback.");
        LOG.warn("Dummy warning message.");
        LOG.error("Dummy error message.");

        if (throwException) {
            throw new RuntimeException("Exceptional exception");
        }

        return true;
    }
}
