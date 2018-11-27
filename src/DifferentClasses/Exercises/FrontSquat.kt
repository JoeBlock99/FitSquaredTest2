package DifferentClasses.Exercises

abstract class FrontSquat(name:String = "Front Squat",
                 difficulty:Int = 2,
                 requirement:String = "Barra, tortas para barra, rack y piernas",
        //qué parte del cuerpo ejercita
                 type: String = "Pierna",
                 description: String = "Consiste en hacer una squat con peso, sosteniendo la barra con los hombros frente al cuello.",
quantity: String = "5 series de 8 con el 60 porciento de su peso maximo.")
    :FrontSquat(name, difficulty, requirement, type, description, quantity) {
}