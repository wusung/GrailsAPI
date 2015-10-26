package grailsapi

import grails.rest.Resource

@Resource(uri = "/statuses", formats = ["json", "xml"])
class Status {

    static belongsTo = [user: User]

    static constraints = {
        message(nullable: true)
    }

    String message
}
