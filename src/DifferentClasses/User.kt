package DifferentClasses

import Logic.classifyBMI

data class User(
        var email: String,
        var password:String,
        var age: Int,
        var levelOfExercise: Int,
        var name: String,
<<<<<<< HEAD
        var weight: String,
        var height: Double,
        var priority: Int,
        var materials: String,
        var sex: String,
        var daysPerWeek: Int,
=======
        var weight: Float,
        var height: Float,
>>>>>>> 6240000604f23406cb51c83c745be4ca13cde11d
        val history: History
) {
    var bmi:Float = ((weight*0.453592)/(height*height)).toFloat()

    fun classifyAge():Int{
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

    fun classifyBMI(): Int{
        println(bmi)
        if (bmi < 18.5){
            //"Bajo peso"
            return 1
        }
        else if (bmi > 18.5 && bmi <24.9 ){
            //"Normal"
            return 2
        }
        else if(bmi > 24.9 && bmi < 29.9){
            println("Sobrepeso")
            return 3
        }
        else{
            //obesidad
            return 4
        }
    }

    fun getDifficultyLevel():Int {
        if (classifyBMI() == 1 || classifyBMI() == 4) {
            if (classifyAge()  == 3 || classifyAge() == 4){
                return 1
            }
            else if (classifyAge() == 2 && levelOfExercise <= 3){
                return 1
            }
            else{
                return 2
            }
        }
        else if(classifyBMI() == 2){
            if (levelOfExercise <= 3){
                if (classifyAge() in (1..2)){
                    return 3
                }
                else{
                    return 2
                }
            }
            else if(levelOfExercise in (4..6)){
                if (classifyAge() in (1..2)){
                    return 4
                }
                else{
                    return 3
                }
            }
            else if(levelOfExercise > 7){
                if (classifyAge() in (1..2)){
                    return 5
                }
                else{
                    return 4
                }
            }
        }
        else if (classifyBMI() == 3){
            if (levelOfExercise <= 3){
                if (classifyAge() in (1..2)){
                    return 2
                }
                else{
                    return 1
                }
            }
            else if (levelOfExercise in (4..6)){
                if (classifyAge() == 1){
                    return 3
                }
                else if (classifyAge() in (2..3)){
                    return 2
                }
                else return 1
            }
            else if (levelOfExercise > 7){
                if (classifyAge() == 1){
                    return 4
                }
                else if(classifyAge() in (2..3)){
                    return 3
                }
                else{
                    return 2
                }
            }
        }
        return 0
    }
}