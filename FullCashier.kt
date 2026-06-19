package com.example.fullcashier.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun FullCashier(modifier: Modifier = Modifier) {
    //Menyimpan Apa Yang Diketik User Didalam Kolom Harga (Berupa Teks/String)
    var unitPrice by remember { mutableStateOf("") }

    //menyimpan Jumlah Barang (Berupa Angka/intenger)
    var itemCount by remember { mutableStateOf(0) }

    //Konversi Text Ke Angka Agar Bisa Dikalikan (Jika Kosong, Otomatis 0)
    val priceNumber = unitPrice.toIntOrNull() ?: 0
    val price = priceNumber * itemCount
    val discountPrice = price * 15 / 100
    val totalPrice = if (price >= 50000) {
        price - discountPrice
    } else price


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Kasir Grosir Pintar",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF1C1B1F)
        )

        Spacer(modifier = Modifier.height(30.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFC8E6C9))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                OutlinedTextField(
                    value = unitPrice,
                    onValueChange = { newinput ->
                        unitPrice = newinput
                    },
                    label = {
                        Text(
                            "Harga Satuan (RP)",
                            color = Color(0xFF000000),
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                    },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    modifier = Modifier.fillMaxWidth()
                )
            }
        }
        Spacer(modifier = Modifier.height(20.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(containerColor = Color(0xFFA5D6A7)),

            ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(26.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(text = "Total Pembayaran",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000)
                )

                Spacer(modifier = Modifier.height(10.dp))

                Text(
                    text = "Rp $totalPrice",
                    fontSize = 40.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1B5E20)
                )

                if (price >=50000)
                    Box(
                        modifier = Modifier
                            .clip(RoundedCornerShape(12.dp))
                            .background(Color(0xFFFFEBEE))
                            .padding(horizontal = 12.dp, vertical = 4.dp)
                    ){
                        Text(
                            text = "horeee! Diskon 15% (-Rp $discountPrice)",
                            color = Color(0xFFFA1D1D),
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }

                Spacer(modifier = Modifier.height(10.dp))

                Text(text = "Total Item: $itemCount",
                    fontSize = 25.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF000000)
                )
            }
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Button(
                onClick = { itemCount += 1 },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text("+1 PCS")
            }
            Button(
                onClick = { itemCount += 12 },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text("+1 LUSIN")
            }
            Button(
                onClick = { itemCount += 20 },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.buttonColors(containerColor = Color.Blue)
            ) {
                Text("+1 KODI")
            }
        }

        Spacer(modifier = Modifier.height(20.dp))

        OutlinedButton(
            onClick = {
                itemCount = 0
                unitPrice = "" },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Red
            ),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("RESET KASIR")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CashierPreview() {
    FullCashier()
}