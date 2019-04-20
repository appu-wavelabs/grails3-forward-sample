package com.grails


class SomeController {

    static defaultAction = 'index'

    def index(SomeTestCommand cmd) {
        println("test some index ${cmd.max}")
        render view: 'index'
    }

}

class SomeTestCommand {
    Integer max
    Integer offset
}
