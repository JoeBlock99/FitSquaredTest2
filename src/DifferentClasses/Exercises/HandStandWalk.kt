package DifferentClasses.Exercises

abstract class HandStandWalk (name:String = "Hand Stand Walk",
                     difficulty:Int = 5,
                     requirement:String = "Objeto que proteja la cabeza(opcional) y brazos.",
        //qué parte del cuerpo ejercita
                     type: String = "Brazo",
                     description: String = "Consiste en avanzar de paradilla, usando las manos.",
quantity: String = "Recorra 40 metros, puede ser por intervalos.")
    :HandStandWalk(name, difficulty, requirement, type, description, quantity){
}