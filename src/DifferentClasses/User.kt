package DifferentClasses

data class User(
        var email: String,
        var password:String,
        var age: String,
        var levelOfExercise: String,
        var name: String,
        var weight: String,
        var height: Double,
        var priority: Int,
        var materials: String,
        var sex: String,
        var daysPerWeek: Int,
        val history: History
) {
}