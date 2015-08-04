package br.com.isantos.framework.web.annotation

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Retention
import java.lang.annotation.RetentionPolicy
import java.lang.annotation.Target

/**
 * Created by felipe on 27/06/15.
 */

@Documented
@Target([ElementType.TYPE, ElementType.METHOD])
@Retention(RetentionPolicy.RUNTIME)
@interface Path {

    /**
     * Case seja null será usado o nome do método
     * @return
     */
    String[] value() default [null];

    /**
     * Caso seja null será usado todos os métodos
     */
    Method method() default null;

    enum Method {
        GET, POST, DELETE, PUT;
    }

}

