package com.composh.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.composh.myapplication.R
import com.composh.myapplication.ui.theme.ui.theme.Tugas_3Theme


@Composable
fun StudentCard(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(all = 14.dp)
            .background(
                color = Color(0xFF673AB7),
                shape = RoundedCornerShape(size = 10.dp)
            )
            .padding(all = 14.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            text = " KARTU PELAJAR DIGITAL ",
            fontSize = 18.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.Black
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(verticalAlignment = Alignment.CenterVertically) {
            Image(
                painter = painterResource(id = R.drawable.foto_saya),
                contentDescription = "Foto Profil Pelajar",
                modifier = Modifier
                    .size(90.dp)
                    .clip(CircleShape)
                    .border(width = 3.dp, Color(0xFF3882f6), CircleShape)

            )
            Spacer(modifier = Modifier.width(10.dp))

            Column {
                Text(
                    text = "Nama:Choiril Syah Reza A.",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                )

                Text(
                    text = "Kelas: X PPLG.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

                Text(
                    text = "Asal Sekolah: SKAMUHI.",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.White
                )

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Tugas_3Theme {
        StudentCard()
    }
}


