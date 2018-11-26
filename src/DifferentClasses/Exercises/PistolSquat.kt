package DifferentClasses.Exercises

abstract class PistolSquat (name:String = "Pistol Squat",
    difficulty:Int = 3,
    requirement:String = "Piernas",
    //qué parte del cuerpo ejercita
    type: String = "Pierna",
    description: String = "Consiste en hacer una sentadilla con una sola pierna, y la otra lo mas estirada posible al frente.")
    :Situp(name, difficulty, requirement, type, description){
    }
