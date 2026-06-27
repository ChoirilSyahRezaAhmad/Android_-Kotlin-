package com.example.helloandroid.ui.theme

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloandroid.Greeting

@Composable
fun First() {
    Column(
        modifier = Modifier
            .fillMaxWidth() //Untuk Menampilkan Halaman kecil.
            .fillMaxSize() //Untuk Menampilkan 1 Halaman Full.
            .padding(16.dp)
    ) {
        Text(text = "My Name Is Choiril Syah Reza Ahmad ",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
            )
        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "I Go To School SMK Muhammadiyah 1 Weleri ",
            fontSize = 12.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    HelloAndroidTheme {
        First()
    }
}