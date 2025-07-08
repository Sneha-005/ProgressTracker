package com.devsneha.progresstracker.ui.dashboard

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import com.devsneha.progresstracker.ui.dashboard.getDummyStudent

class DashboardViewModel : ViewModel() {
    private val _student = MutableStateFlow(getDummyStudent())
    val student: StateFlow<com.devsneha.progresstracker.model.Student> = _student.asStateFlow()
} 