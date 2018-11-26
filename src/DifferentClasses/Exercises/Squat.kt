package DifferentClasses.Exercises

abstract class Squat (name:String = "Squat",
    difficulty:Int = 1,
    requirement:String = "Piernas",
    //qué parte del cuerpo ejercita
    type: String = "Pierna",
    description: String = "Consiste en bajar de forma completamente vertical,flexionando las rodillas a la vez que se mantiene la espalda recta, sin que las rodillas pasen de las puntas de tus pies.")
    :Squat(name, difficulty, requirement, type, description){
}
