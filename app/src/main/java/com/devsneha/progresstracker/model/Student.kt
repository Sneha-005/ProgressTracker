package com.devsneha.progresstracker.model

import kotlinx.serialization.Serializable

@Serializable
data class Student(
    val name: String,
    val className: String,
    val studentId: String,
    val courses: List<Course>,
    val attendance: Attendance,
    val tests: List<Test>
)

@Serializable
data class Course(val name: String)

@Serializable
data class Attendance(val daysPresent: Int, val totalDays: Int)

@Serializable
data class Test(val subject: String, val date: String, val score: Int?)