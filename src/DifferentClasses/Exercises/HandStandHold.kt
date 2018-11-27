package DifferentClasses.Exercises

abstract class HandStandHold(name:String = "Hand Stand Hold",
                    difficulty:Int = 3,
                    requirement:String = "Brazos.",
        //qué parte del cuerpo ejercita
                    type: String = "Brazo",
                    description: String = "Consiste en mantener la pocision vertical de una paradilla por un tiempo predeterminado en segundos.")
    :HandStandHold(name, difficulty, requirement, type, description) {
}