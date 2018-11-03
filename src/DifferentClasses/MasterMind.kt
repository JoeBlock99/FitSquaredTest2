package DifferentClasses

class MasterMind(
        val selectedUser: User
) {
    fun createdNewRoutine():PersRoutine{
        val createdRoutine = PersRoutine()
        return createdRoutine
    }
}