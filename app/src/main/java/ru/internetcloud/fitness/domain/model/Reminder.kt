package ru.internetcloud.fitness.domain.model

data class Reminder(
    var id: Long = 0,
    var name: String? = null,
    var type: WorkoutType = WorkoutType.Swimming,
    var hour: Int = 0,
    var minute: Int = 0,
    var days: List<String?>? = null
)
