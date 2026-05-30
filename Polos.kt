package com.modifier.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.modifier.myapplication.R

@Composable
fun StudentCard() {
    Column() {
        Text(text = " ==== Kartu Pelajar Digital === ",
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Row() {
            Image(
                painter = painterResource(id = R.drawable.contoh),
                contentDescription = null,
                modifier = Modifier.size(90.dp)
            )
            Column() {
                Text(text = "Nama = Choril Syah Reza A.")
                Text(text = "Kelas = X PPLG")
                Text(text = "Asal Sekolah = SKAMUHI")

                Text(
                    text = "================================",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyApplicationTheme {
        StudentCard()
    }
}