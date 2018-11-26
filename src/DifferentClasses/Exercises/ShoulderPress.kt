package DifferentClasses.Exercises

abstract class ShoulderPress(name:String = "Shoulder press",
                    difficulty:Int = 2,
                    requirement:String = "Barra, tortas de barra, rack, piernas y brazos",
        //qué parte del cuerpo ejercita
                    type: String = "Hombro",
                    description: String = "Consiste en empujar la barra de los hombros hacia arriba de la cabeza.")
    :ShoulderPress(name, difficulty, requirement, type, description) {
}