package com.example.questuserinput_048

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier

@Composable
fun FormDataDiri(modifier: Modifier
){
    var textNama by remember { mutableStateOf(value = "")}
    var textAlamat by remember {mutableStateOf(value = "")}
    var textJK by remember {mutableStateOf(value = "")}

}
