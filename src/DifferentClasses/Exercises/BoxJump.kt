package DifferentClasses.Exercises

abstract class BoxJump (name:String = "Box Jump",
               difficulty:Int = 2,
               requirement:String = "Un objeto elebado que aguante tu peso y Piernas",
        //qué parte del cuerpo ejercita
               type: String = "Pierna",
               description: String = "Consiste en saltar un objeto con superficie plana con una medicion predeterminada.")
    :BoxJump(name, difficulty, requirement, type, description){
}