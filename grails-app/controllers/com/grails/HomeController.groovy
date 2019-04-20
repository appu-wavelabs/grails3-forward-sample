package com.grails

import grails.core.GrailsControllerClass
import grails.web.servlet.mvc.GrailsParameterMap
import org.grails.commons.GrailsCodecClass
import org.grails.core.DefaultGrailsControllerClass

class HomeController {


    static defaultAction = 'index'

    def doForward(Integer max) {
        println("test home doForward")
        forward(controller: 'some', action: 'index')
    }

    def index () {
        println("test home index")
        render view: 'index'
    }

}
