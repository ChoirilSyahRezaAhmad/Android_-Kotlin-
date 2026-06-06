package com.example.talk.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.talk.R


@Composable
fun Redbul(modifier: Modifier = Modifier){
    val isTokoBuka = true
    val warnaBackground  = if (isTokoBuka) Color(0xFF0D47FF) else Color(0xFF374151)
    val warnaText  = if (isTokoBuka) Color(0xFFFFFFFF) else Color(0xFFFFFFFF)
    val teksStatus = if (isTokoBuka) "Buka" else "Tutup"

    Column(modifier = modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Red Bull Indonesia",
            fontSize = 36.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF0D47FF))
        Spacer(modifier = Modifier.padding(8.dp))
        Text(
            textAlign = TextAlign.Center,
            text = "Jl. Asia Afrika No. 8, Gelora \n" +
                "Kecamatan Tanah Abang, Jakarta Pusat. \n",
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium)


        Spacer(modifier = Modifier.padding(15.dp))
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier
                .clip(RoundedCornerShape(size = 100.dp))
                .background(warnaBackground )
                .semantics{contentDescription = "Status Toko saat ini: $teksStatus" }
                .padding(horizontal = 40.dp, vertical = 15.dp)
        ){
            Text(text = teksStatus, color = warnaText, fontWeight = FontWeight.Bold, fontSize = 36.sp )
        }
        Spacer(modifier = Modifier.padding(30.dp))
        Text(
            textAlign = TextAlign.Center,
            text = "Red Bull adalah merek minuman energi global terpopuler asal Austria yang diluncurkan pada tahun 1987.",
            fontSize = 24.sp,
            fontWeight = FontWeight.Medium
        )

        Spacer(modifier = Modifier.padding(20.dp))
        Button(
            onClick = {/* aksi pesan */},
            modifier = Modifier
                .width(300.dp)
                .height(60.dp), // Standar WCAG minimum touch target "48.dp"
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF000000))
        ) {
             Text(text ="Pesan Sekarang",
                 color = Color(0xFFFFFFFF),
                 fontWeight = FontWeight.Bold,
                 fontSize = 32.sp )
        }
        Row(modifier = Modifier.padding(40.dp)) {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(50.dp)
                    .background(Color(0xFF000000))
                    .clickable(onClickLabel = "Buka Halaman Facebook Red Bull ") {
                        // Fungsi Click
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Masuk Facebook",
                    contentScale = ContentScale.Crop, // Mencegah gambar gepeng
                    modifier = Modifier
                        .padding(7.dp)
                        .size(40.dp)
                )
            }
            Spacer(modifier = Modifier.padding(12.dp))
                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier
                        .size(50.dp)
                        .background(Color(0xFF000000))
                        .clickable(onClickLabel = "Buka Halaman youtube Red Bull ") {
                            // Fungsi Click
                        }
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.youtube),
                        contentDescription = "Masuk Youtube",
                        contentScale = ContentScale.Crop, // Mencegah gambar gepeng
                        modifier = Modifier
                            .padding(7.dp)
                            .size(40.dp)
                    )
                }
            Spacer(modifier = Modifier.padding(12.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(50.dp)
                    .background(Color(0xFF000000))
                    .clickable(onClickLabel = "Buka Halaman Instagram Red Bull ") {
                        // Fungsi Click
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.instagram),
                    contentDescription = "Masuk Instagram",
                    contentScale = ContentScale.Crop, // Mencegah gambar gepeng
                    modifier = Modifier
                        .padding(5.dp)
                        .size(40.dp)
                     )
                }
            Spacer(modifier = Modifier.padding(12.dp))
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .size(50.dp)
                    .background(Color(0xFF000000))
                    .clickable(onClickLabel = "Buka Halaman Twitter Red Bull ") {
                        // Fungsi Click
                    }
            ) {
                Image(
                    painter = painterResource(id = R.drawable.twitter),
                    contentDescription = "Masuk Twitter",
//                    contentScale = ContentScale.Crop, // Mencegah gambar gepeng
                    modifier = Modifier
                        .padding(3.dp)
                        .size(40.dp)
                    )
                }
            }
        }

    }



@Preview(showBackground = true)
@Composable
fun PreviewDesainUMKM() {
    Redbul()
}