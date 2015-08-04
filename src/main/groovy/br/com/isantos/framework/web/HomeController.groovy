package br.com.isantos.framework.web

import br.com.isantos.framework.web.annotation.Controller
import br.com.isantos.framework.web.annotation.Path
import br.com.isantos.framework.web.annotation.Path.Method

/**
 * Created by felipe on 27/06/15.
 */
@Controller
class HomeController {

    @Path(value = ["/", "index.html"], method = Method.GET)
    def index() {

    }

    @Path
    def anotherOne() {

    }

}
