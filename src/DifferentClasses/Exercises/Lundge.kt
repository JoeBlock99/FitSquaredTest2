package DifferentClasses.Exercises

abstract class Lundge (name:String = "Lundge",
              difficulty:Int = 1,
              requirement:String = "Piernas",
        //qué parte del cuerpo ejercita
              type: String = "Pierna",
              description: String = "Consiste en avanzar incandose con una pierna,la pierna que va adelante deberia de formar un angulo de 90 grados sin pasar de la punta del pie sin ayudarse con los brazos. ")
    :Lundge(name, difficulty, requirement, type, description) {
}