package com.grails

class UrlMappings {

    static mappings = {

        "/home/$action"(controller:"home")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
