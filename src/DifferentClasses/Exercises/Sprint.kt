package DifferentClasses.Exercises

abstract class Sprint (name:String = "Correr.",
              difficulty:Int = 1,
              requirement:String = "Lugar donde correr y Piernas.",
        //qué parte del cuerpo ejercita
              type: String = "Pierna",
              description: String = "Consiste en correr a toda capacidad una distancia de 100 o 50 metros.",
quantity: String = " 6 veces la distancia escogida, 50 o 100 metros. ")
    :Sprint(name, difficulty, requirement, type, description, quantity){
}