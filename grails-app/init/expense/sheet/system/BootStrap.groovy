package expense.sheet.system

import expense.sheet.system.Role
import expense.sheet.system.User
import expense.sheet.system.UserRole

class BootStrap {

    def init = { servletContext ->
        def userRole = Role.findOrSaveWhere(authority: 'ADMIN_ROLE')
        def user = User.findOrSaveWhere(username: 'bulelani', password: 'bulelani', firstName: 'Bulelani', lastName: 'Mjali')

        if(!user.authorities.contains(userRole)){
            UserRole.create(user,userRole,true)
        }
    }
    def destroy = {
    }
}
