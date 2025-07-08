package com.devsneha.progresstracker.ui.dashboard

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devsneha.progresstracker.data.StudentRepository
import com.devsneha.progresstracker.model.Student
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate

sealed class DashboardUiState {
    object Loading : DashboardUiState()
    data class Success(val student: Student) : DashboardUiState()
    data class Error(val message: String) : DashboardUiState()
}

class DashboardViewModel : ViewModel() {
    private val repository = StudentRepository()
    private val _uiState = MutableStateFlow<DashboardUiState>(DashboardUiState.Loading)
    val uiState: StateFlow<DashboardUiState> = _uiState.asStateFlow()

    fun load(context: Context) {
        _uiState.value = DashboardUiState.Loading
        viewModelScope.launch {
            try {
                val student = repository.getStudent(context)
                _uiState.value = DashboardUiState.Success(student)
            } catch (e: Exception) {
                _uiState.value = DashboardUiState.Error("Failed to load student data")
            }
        }
    }
} 