package br.com.isantos.framework.web

import java.lang.reflect.Method

/**
 * Created by felipe on 27/06/15.
 */
class Action {

    public static enum RequestMethod {
        PUT, DELETE, GET, POST;
    }

    String path;
    RequestMethod requestMethod;
    Method method;


}
