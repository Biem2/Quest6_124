package com.example.quest6_124.viewmodel

import androidx.room.util.copy
import com.example.quest6_124.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class Siswaviewmodel : viewmodel() {

    // Request: private val _statusUI = MutableStateFlow(Siswa())
    private val _statusUI = MutableStateFlow(Siswa())

    // Request: val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun saveDataSiswa(ls: MutableList<String>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(
                nama = ls[0],
                gender = ls[1],
                alamat = ls[2]
            )
        }
    }
}