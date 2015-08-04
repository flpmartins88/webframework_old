package br.com.isantos.framework.web

import br.com.isantos.framework.web.annotation.Controller
import br.com.isantos.framework.web.annotation.Path
import org.reflections.Reflections
import org.reflections.scanners.MethodAnnotationsScanner
import org.reflections.scanners.Scanner
import org.reflections.util.ClasspathHelper
import org.reflections.util.ConfigurationBuilder
import org.reflections.util.FilterBuilder
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * Created by felipe on 27/06/15.
 */
public class ClasspathResource {

    private Logger log = LoggerFactory.getLogger(ClasspathResource.class);

    def methods = [];

    public void scan() {
        Reflections reflections = new Reflections("br.com.isantos", new MethodAnnotationsScanner());

        def action = new Action();
        def path;

        reflections.getMethodsAnnotatedWith(Path.class).each { method ->

            if (!method.getDeclaringClass().isAnnotationPresent(Controller.class)) {
                log.warn("Class {} of method {} isn't annotated with @Controller", method.getDeclaringClass().getName(), method.getName());
                return;
            }

            log.info("Found method {} in class {}", method.getName(), method.getDeclaringClass().getSimpleName())

        }


    }


}
