package DifferentClasses

import DifferentClasses.Exercises.Exercise

class MasterMind(
        val selectedUser: User
//Nivel de condicion fisica = de 4 a 6 es normal, que consite en esfuerzos de 1 a 3 de dificultad.
        // de nivel 7 en adelante puede hacer ejercicios de 2 a 5, pero nunca vamos a poner un ejercicio de grado de dificultad 5 de una...
        // de nivel 2 a 3 dificultad 1 y 2
        // nivel 1, solo dificultad 1
//4..6
) {
    fun createdNewRoutine(levelOfExcersice: Int, weight: Int,height: Int, materials: String,sex: String, daysPerWeek: Int , priority: String):PersRoutine{
        val createdRoutine = PersRoutine()
        for (leverOfExercise in selectedUser()){
            if (levelOfExcersice == 1){
                difficulty.Exercise = 1
            }
            if (levelOfExcersice in 2..3){
                difficulty.Exercise = 1..2
            }
            if (levelOfExcersice in 4..6){
                difficulty.Exercise = 1..3
            }
            if (levelOfExcersice in 7..8){
                difficulty.Exercise = 1..4
            }
            if (levelOfExcersice in 9..10){
                difficulty.Exercise = 2..6
            }
        }
        for (materials in selectedUser()){
            if materials
        }


        return createdRoutine
    }
}