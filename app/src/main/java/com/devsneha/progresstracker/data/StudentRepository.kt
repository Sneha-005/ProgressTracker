package com.devsneha.progresstracker.data

import android.content.Context
import com.devsneha.progresstracker.model.*
import kotlinx.coroutines.delay
import kotlinx.serialization.decodeFromString
import java.io.IOException
import java.time.LocalDate
import kotlinx.serialization.json.Json

class StudentRepository {
    suspend fun getStudent(context: Context): Student {
        delay(2000)
        return try {
            val jsonString = context.assets.open("student.json").bufferedReader().use { it.readText() }
            val studentRaw = Json.decodeFromString<Student>(jsonString)
            studentRaw
        } catch (e: IOException) {
            Student(
                name = "Sneha Dev",
                className = "10th Grade",
                studentId = "STU12345",
                courses = listOf(
                    Course("Mathematics"),
                    Course("Science"),
                    Course("English"),
                    Course("History"),
                    Course("Geography")
                ),
                attendance = Attendance(daysPresent = 20, totalDays = 22),
                tests = listOf(
                    Test("Mathematics", "2024-07-10", null),
                    Test("Science", "2024-07-17", null),
                    Test("English", "2024-06-30", 88),
                    Test("History", "2024-06-22", 92),
                    Test("Geography", "2024-06-17", 85)
                )
            )
        }
    }
} 