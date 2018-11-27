package DifferentClasses.Exercises

abstract class Pullup (name:String = "Pull up",
    difficulty:Int = 3,
    requirement:String = "Area de donde colgarse con manos",
    //qué parte del cuerpo ejercita
    type: String = "Brazo",
    description: String = "Consiste en jalar hacia arriba tu cuerpo mientras sigas colgado.",
quantity: String = "4 series de 8.")
    :Pullup(name, difficulty, requirement, type, description, quantity){
}

