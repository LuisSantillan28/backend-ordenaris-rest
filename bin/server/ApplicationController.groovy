package server

import grails.core.GrailsApplication
import grails.plugins.*

class ApplicationController implements PluginManagerAware {

    GrailsApplication grailsApplication
    GrailsPluginManager pluginManager

    def index() {
        [grailsApplication: grailsApplication, pluginManager: pluginManager]
    }

    // def delete() {
    //     [grailsApplication: grailsApplication, pluginManager: pluginManager]
    // }


    //    def p = new Person(matricula: 12345, nombre: "Luis", direccion "Xochimilco 15B", birthday '2001-08-28')
    //    p.save()    

}
