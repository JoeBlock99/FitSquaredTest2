package DifferentClasses.Exercises

abstract class Rest (name:String = "Descanso",
            difficulty:Int =0,
            requirement:String = "",
        //qué parte del cuerpo ejercita
            type: String = "",
            description: String = "Descanse, no se exija tanto, porque podria lesionarse.")
    :Rest(name, difficulty, requirement, type, description){
}