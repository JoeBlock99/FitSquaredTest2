package DifferentClasses.Exercises

abstract class KneeRise (name:String = "Toes to bar",
                difficulty:Int = 2,
                requirement:String = "Tubo de donde colgarse con las manos, tambien piernas.",
        //qué parte del cuerpo ejercita
                type: String = "Abdomen",
                description: String = "Colgado de una barra, subir las rodillas a una altura que pase las del ombilgo.")
    :KneeRise(name, difficulty, requirement, type, description){
}