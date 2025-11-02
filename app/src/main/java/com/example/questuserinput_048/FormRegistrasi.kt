package com.example.questuserinput_048

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun formRegist (modifier: Modifier
){
    var textNama by remember { mutableStateOf(value = "")}
    var textKota by remember { mutableStateOf(value = "")}
    var textTglLahir by remember { mutableStateOf(value = "") }
    var textRT by remember { mutableStateOf(value = "") }
    var textRW by remember { mutableStateOf(value = "") }
    var textUmur by remember { mutableStateOf(value = "") }
    var textJK by remember { mutableStateOf(value = "") }
    var checkboxSetuju by remember { mutableStateOf(value = false) }

    var nama by remember { mutableStateOf(value = "") }
    var kota by remember { mutableStateOf(value = "") }
    var tglLahir by remember { mutableStateOf(value = "") }
    var rt by remember { mutableStateOf(value = "") }
    var rw by remember { mutableStateOf(value = "") }
    var umur by remember { mutableStateOf(value = "") }
    var jenis by remember { mutableStateOf(value = "") }

    var showDialog by remember { mutableStateOf(value = false) }
    var gender: List<String> = listOf("Laki-laki", "Perempuan")



}