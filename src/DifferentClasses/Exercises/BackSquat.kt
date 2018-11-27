package DifferentClasses.Exercises

abstract class BackSquat(name:String = "BackSquat",
                difficulty:Int = 2,
                requirement:String = "Barra, tortas para barra, rack y piernas.",
        //qué parte del cuerpo ejercita
                type: String = "Pierna",
                description: String = "Consiste en hace una squat, con la barra sostenida por los musculos de la espalda.",
                quantity: String = "4 series de 8 backsquat con el 60 porciento de su peso maximo.")

    :BackSquat(name, difficulty, requirement, type, description, quantity) {
}