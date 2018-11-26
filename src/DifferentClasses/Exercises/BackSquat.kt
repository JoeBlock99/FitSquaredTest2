package DifferentClasses.Exercises

abstract class BackSquat(name:String = "BackSquat",
                difficulty:Int = 2,
                requirement:String = "Barra, tortas para barra, rack y piernas.",
        //qué parte del cuerpo ejercita
                type: String = "Pierna",
                description: String = "Consiste en hace una squat, con la barra sostenida por los musculos de la espalda.")
    :BackSquat(name, difficulty, requirement, type, description) {
}