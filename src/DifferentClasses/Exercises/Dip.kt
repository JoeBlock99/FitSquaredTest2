package DifferentClasses.Exercises

abstract class Dip(name:String = "Dips",
          difficulty:Int =4,
          requirement:String = "Areas donde apoyarse y manos.",
        //qué parte del cuerpo ejercita
          type: String = "Pecho",
          description: String = "Apoyado de dos superficies sin que los pies toquen el piso, empujar con los brazos hacia arriba.",
quantity: String = "5 series de 8.")
    :Dip(name, difficulty, requirement, type, description, quantity) {
}