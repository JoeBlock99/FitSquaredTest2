package DifferentClasses.Exercises

abstract class sitUpsTalegas(name:String = "SitUpsTalegas",
                    difficulty:Int = 5,
                    requirement:String = "Piernas",
                    //qué parte del cuerpo ejercita
                    type: Int = 4,
                    description: String = "Algo aquí interesante")
    :Situp(name, difficulty, requirement, type, description){
}