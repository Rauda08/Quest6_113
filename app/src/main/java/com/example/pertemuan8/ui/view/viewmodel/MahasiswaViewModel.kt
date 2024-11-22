package com.example.pertemuan8.ui.view.viewmodel

import androidx.lifecycle.ViewModel
import com.example.pertemuan8.ui.model.Mahasiswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class MahasiswaViewModel : ViewModel() {
    // Request
    private val _mahasiswaUiState = MutableStateFlow(Mahasiswa())
    // Response
    val mahasiswaUiState: StateFlow<Mahasiswa> = _mahasiswaUiState.asStateFlow()

    fun saveDataSiswa(mahasiswa: Mahasiswa) {
        _mahasiswaUiState.update { currentState ->
            currentState.copy(
                nim = mahasiswa.nim,
                nama = mahasiswa.nama,
                email = mahasiswa.email
            )
        }
    }
}
