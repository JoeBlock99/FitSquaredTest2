package DifferentClasses.Exercises

abstract class WeightLundge (name:String = "Lundge with weight",
                    difficulty:Int = 3,
                    requirement:String = "Barra, tortas para barra, rack y piernas",
        //qué parte del cuerpo ejercita
                    type: String = "Gluteo",
                    description: String = "Consiste en hacer una lunge, pero con la barra frente al cuello sobre los hombros.")
                    :WeightLundge(name, difficulty, requirement, type, description) {
}