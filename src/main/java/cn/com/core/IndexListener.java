package cn.com.core;

import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import static org.springframework.web.context.ContextLoader.getCurrentWebApplicationContext;

public class IndexListener extends ContextLoaderListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.print("服务开始加载中----------------");
       // super.contextInitialized(servletContextEvent);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.err.print("服务----------------");
        super.contextDestroyed(servletContextEvent);
    }
}
