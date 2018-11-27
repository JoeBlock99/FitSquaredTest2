package DifferentClasses.Exercises

abstract class PistolSquat (name:String = "Pistol Squat",
    difficulty:Int = 4,
    requirement:String = "Piernas",
    //qué parte del cuerpo ejercita
    type: String = "Pierna",
    description: String = "Consiste en hacer una sentadilla con una sola pierna, y la otra lo mas estirada posible al frente.",
quantity: String = "5 series de 4 a 10.")
    :PistolSquat(name, difficulty, requirement, type, description, quantity){
    }
