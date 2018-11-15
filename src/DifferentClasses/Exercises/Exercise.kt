package DifferentClasses.Exercises

abstract class Exercise(
        val name: String,
        val difficulty: Int,
        var requirement: String,
        val type: Int,
        val description: String
) {
}