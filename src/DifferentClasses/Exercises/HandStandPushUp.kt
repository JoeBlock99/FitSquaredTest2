package DifferentClasses.Exercises

abstract class HandStandPushUp(name:String = "Hand Stand Push Up",
                      difficulty:Int = 6,
                      requirement:String = "Objeto que proteja la cabeza(opcional) y brazos.",
        //qué parte del cuerpo ejercita
                      type: String = "Brazo",
                      description: String = "Consiste en bajar verticalmente flexionando los codos en pocision de paradilla.",
quantity: String = "5 series de 4 a 6.")
    :HandStandPushUp(name, difficulty, requirement, type, description, quantity){
}