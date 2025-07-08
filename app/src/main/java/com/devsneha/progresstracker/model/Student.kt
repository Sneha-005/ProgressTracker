package com.devsneha.progresstracker.model

data class Student(
    val name: String,
    val className: String,
    val studentId: String,
    val courses: List<Course>,
    val attendance: Attendance,
    val tests: List<Test>
)

data class Course(val name: String)

data class Attendance(val daysPresent: Int, val totalDays: Int)

data class Test(val subject: String, val date: java.time.LocalDate, val score: Int?)