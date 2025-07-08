//package com.devsneha.progresstracker.ui.dashboard
//
//import com.devsneha.progresstracker.model.*
//import java.time.LocalDate
//
//fun getDummyStudent(): Student {
//    return Student(
//        name = "Sneha Dev",
//        className = "10th Grade",
//        studentId = "STU12345",
//        courses = listOf(
//            Course("Mathematics"),
//            Course("Science"),
//            Course("English"),
//            Course("History"),
//            Course("Geography")
//        ),
//        attendance = Attendance(daysPresent = 20, totalDays = 22),
//        tests = listOf(
//            Test("Mathematics", LocalDate.now().plusDays(3), null),
//            Test("Science", LocalDate.now().plusDays(10), null),
//            Test("English", LocalDate.now().minusDays(7), 88),
//            Test("History", LocalDate.now().minusDays(15), 92),
//            Test("Geography", LocalDate.now().minusDays(20), 85)
//        )
//    )
//}