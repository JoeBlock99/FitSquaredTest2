package DifferentClasses.Exercises

abstract class Thruster (name:String = "Thruster",
                difficulty:Int = 3,
                requirement:String = "Barra, tortas de barra, rack y piernas.",
        //qué parte del cuerpo ejercita
                type: String = "Todo",
                description: String = "Consiste en hacer una squat y un shoulder press a la vez.")
    :Thruster(name, difficulty, requirement, type, description) {
}