package DifferentClasses.Exercises

abstract class HandStandHold(name:String = "Hand Stand Hold",
                    difficulty:Int = 3,
                    requirement:String = "Brazos.",
        //qué parte del cuerpo ejercita
                    type: String = "Brazo",
                    description: String = "Consiste en mantener la pocision vertical de una paradilla por un tiempo predeterminado en segundos.",
quantity: String = " 4 series de 30 a 45 segs.")
    :HandStandHold(name, difficulty, requirement, type, description, quantity) {
}