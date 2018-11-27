package DifferentClasses.Exercises

abstract class DeadLift(name:String = "Toes to bar",
               difficulty:Int = 2,
               requirement:String = "Barra, tortas de barra, piernas.",
        //qué parte del cuerpo ejercita
               type: String = "Gluteo",
               description: String = "Consiste en lebantar la barra del suelo en posicion de squat hasta que sus piernas esten completamente extendidas.",
quantity: String = "5 series de 6 con el 80 porciento de su peso maximo.")
    :DeadLift(name, difficulty, requirement, type, description, quantity) {
}