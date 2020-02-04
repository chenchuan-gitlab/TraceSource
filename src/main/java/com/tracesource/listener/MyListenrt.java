package com.tracesource.listener;

import com.tracesource.monitor.Init;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListenrt implements ServletContextListener{
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Init.start();
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
