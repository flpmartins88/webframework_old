package br.com.isantos.framework.web

import org.slf4j.Logger
import org.slf4j.LoggerFactory

import javax.servlet.ServletContextEvent
import javax.servlet.ServletContextListener
import javax.servlet.annotation.WebListener

/**
 * Created by felipe on 27/06/15.
 */
@WebListener
public class Startup implements ServletContextListener {

    private Logger log = LoggerFactory.getLogger(Startup.class);

    @Override
    void contextInitialized(ServletContextEvent sce) {

        // call ClasspathResource
        new  ClasspathResource().scan();

    }

    @Override
    void contextDestroyed(ServletContextEvent sce) {

    }
}
