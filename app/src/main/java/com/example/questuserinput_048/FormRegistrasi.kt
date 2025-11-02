package com.example.questuserinput_048

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource

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

    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(dimensionResource(R.dimen.padding_medium)),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = stringResource(R.string.form),
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(bottom = dimensionResource(R.dimen.padding_medium))
        )

        OutlinedTextField(
            value = textNama,
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = stringResource(R.string.namalengkap)) },
            onValueChange = {
                textNama = it
            }
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))

        OutlinedTextField(
            value = textKota,
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),
            label = { Text(text = stringResource(R.string.kota)) },
            onValueChange = {
                textKota = it
            }
        )

        Spacer(modifier = Modifier.height(dimensionResource(R.dimen.padding_small)))

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = textTglLahir,
                singleLine = true,
                modifier = Modifier.weight(2f),
                label = { Text(text = stringResource(R.string.Tanggal)) },
                onValueChange = { textTglLahir = it }
            )
        }
    }

}