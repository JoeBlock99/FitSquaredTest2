package DifferentClasses.Exercises

class WarmUp1 (name:String = "Warm up",
               difficulty:Int = 2,
               requirement:String = "Brazos y piernas",
        //qué parte del cuerpo ejercita
               type: String = "Semi-cardio",
               description: String = "Colgado de una barra, tocar con los dos pies al mismo tiempo a la barra.")
    :ToesToBar(name, difficulty, requirement, type, description){
}