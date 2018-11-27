package Logic

import DifferentClasses.History
import DifferentClasses.User
import kotlin.math.sqrt

//logica para las rutinas

fun classifyAge(age:Int):Int{
    if (age < 15){
        //niño no válido
        //poner mensaje en la aplicación
        return 0
    }
    else if(age in (16..29)){
        //adolescente
        return 1
    }
    else if (age in (30..44)){
        //joven
        return 2
    }
    else if (age in (45..60)){
        //adulto I
        return 3
    }
    else{
        return 4
    }
}

fun classifyBMI(bmi:Int): Int{
    if (bmi < 18.5){
        //"Bajo peso"
        return 0
    }
    else if (bmi > 18.5 && bmi <24.9 ){
        //"Normal"
        return 1
    }
    else if(bmi > 24.9 && bmi < 29.9){
        //"Sobrepeso"
        return 2
    }
    else{
        //obesidad
        return 4
    }
}

fun getDifficultyLevel(bmi: Int, age:Int, exerciseLevel: Int):Int{
    if (classifyAge(age) == 1 && classifyBMI(bmi) == (1 or 2) && exerciseLevel <= 3){
        return 3
    }
    else if (classifyAge(age) == 1 && classifyBMI(bmi) == (1 or 2) && exerciseLevel in (4..6)){
        return 4
    }
    else if (classifyAge(age) == 1 && classifyBMI(bmi) == (1 or 2) && exerciseLevel > 6){
        return 5
    }
    else if (classifyAge(age) == 1 && classifyBMI(bmi) == (1 or 2) && exerciseLevel > 6){
        return 5
    }
    return 0
}


fun main(args: Array<String>) {

    val newUser = User(
            "",
            "",
            53,
            2,
            "",
            170F,
            1.60F,
            History()
    )

    println(newUser.getDifficultyLevel())

}