package DifferentClasses.Exercises

class ChairUpNDown(name:String = "Chair up and down",
                   difficulty:Int = 1,
                   requirement:String = "Una silla y Piernas",
        //qué parte del cuerpo ejercita
                   type: String = "Pierna",
                   description: String = "Consiste en sentarse en una silla de una altura que deje un angulo de 90 grados en el momento en que sus rodillas se flexionan, haciendolo multiples veces.")
    :Squat(name, difficulty, requirement, type, description)  {
}