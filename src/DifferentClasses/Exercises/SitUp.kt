package DifferentClasses.Exercises

abstract class SitUp (name:String = "Sit up",
                  difficulty:Int = 1,
                  requirement:String = "Piernas",
        //qué parte del cuerpo ejercita
                  type: String = "Abdomen",
                  description: String = "Acostado en el piso, lebanta tu torso manteniendo tu espalda recta, sin hacer uso de los brazos.",
quantity: String = "4 series de 15 a 30 abdominales.")
    :SitUp(name, difficulty, requirement, type, description, quantity){
}