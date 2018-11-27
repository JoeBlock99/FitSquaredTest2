package DifferentClasses.Exercises

abstract class ToesToBar(name:String = "Toes to bar",
                difficulty:Int = 3,
                requirement:String = "Tubo de donde colgarse con las manos, tambien piernas.",
        //qué parte del cuerpo ejercita
                type: String = "Abdomen",
                description: String = "Colgado de una barra, tocar con los dos pies al mismo tiempo a la barra.",
                         quantity: String = "6 series de 8.")
    :ToesToBar(name, difficulty, requirement, type, description, quantity) {
}