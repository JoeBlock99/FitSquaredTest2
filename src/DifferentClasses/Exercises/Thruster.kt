package DifferentClasses.Exercises

abstract class Thruster (name:String = "Thruster",
                difficulty:Int = 3,
                requirement:String = "Barra, tortas de barra, rack y piernas.",
        //qué parte del cuerpo ejercita
                type: String = "Todo",
                description: String = "Consiste en hacer una squat y un shoulder press a la vez.",
                         quantity: String = "5 series de 8 con 40 a 60 porciento de su peso maximo.")
    :Thruster(name, difficulty, requirement, type, description, quantity) {
}