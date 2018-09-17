package expense.sheet.system

import grails.plugin.springsecurity.annotation.Secured

@Secured(['ADMIN_ROLE'])
class MainController {

    def index() {
        def username = "ess"
        [user: username]
    }
}
