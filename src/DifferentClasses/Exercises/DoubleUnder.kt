package DifferentClasses.Exercises

abstract class DoubleUnder(name:String = "Double Under",
                  difficulty:Int = 3,
                  requirement:String = "Cuerda para saltar, piernas y manos.",
        //qué parte del cuerpo ejercita
                  type: String = "Cardio",
                  description: String = "Saltar la cuerda, haciendo que esta de dos revoluciones antes de que su salto termine.",
quantity: String = "100 doubleunders.")
    :DoubleUnder(name, difficulty, requirement, type, description, quantity) {
}