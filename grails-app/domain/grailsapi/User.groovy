package grailsapi

import grails.rest.Resource

@Resource(uri = "/users", formats = ["json", "xml"])
class User {

    String name
    String password
    String email

    static hasMany = [status: Status]

    static constraints = {
        name(nullable: true)
        password(nullable: false)
        email(nullable: false)
    }
}
