package com.example.listfull.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// 1. Membuat Cetakan Menggunakan data class.
data class LocalProducts(
    val id: Int,
    val name: String,
    val price: Int,
    val icon: String
)

// 2. Membuat Gudang Data (List).
// Sengaja Dibuat Banyak Agar Layarnya Penuh (Lanjutan Sesi 9).....!!!!
val productWarehouse = listOf(
    LocalProducts(1, "Burger", 20000, "🍔"),
    LocalProducts(2, "Teh Hijau", 14000, "🍵"),
    LocalProducts(3, "Ayam Goreng", 8000, "🍗"),
    LocalProducts(4, "Pizza", 120000, "🍕"),
    LocalProducts(5, "Roti", 25000, "🍞"),
    LocalProducts(6, "Wafel", 29000, "🧇"),
    LocalProducts(7, "Hot Dog", 15000, "🌭"),
    LocalProducts(8, "Es Krim", 6000, "🍨"),
    LocalProducts(9, "Pudding Susu", 14000, "🍮"),
    LocalProducts(10, "Kue Ulang Tahun", 120000, "🎂"),
    LocalProducts(11, "Donat", 2000, "🍩"),
    LocalProducts(12, "Spageti", 28000, "🍝"),
    LocalProducts(13, "Pai", 30000, "🥧"),
    LocalProducts(14, "Udang Goreng", 3000, "🍤"),
    LocalProducts(15, "Kue Bulan", 18000, "🥮"),
    LocalProducts(16, "Cokelat", 6000, "🍫"),
    LocalProducts(17, "Biskuit", 5000, "🍪"),
    LocalProducts(18, "Bir", 22000, "🍺"),
    LocalProducts(19, "Sushi", 8000, "🍣"),
    LocalProducts(20, "Nasi Kari", 14000, "🍛"),
)

@Composable
fun ListFull(modifier: Modifier = Modifier) {
    // 3. Menampilkan Dengan lazyColumn...!
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),

        ) {
        Text(
            text = "Gudang UMKM (Sesi 10)", fontSize = 26.sp, fontWeight = FontWeight.Bold,
            textDecoration = TextDecoration.Underline
        )
        Text(
            text = "Lancar DiScroll Sampai Bawah...! 🚀😊",
            color = Color(0xFF000000),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(
            text = "📦 Total Produk : ${productWarehouse.size} PCS.",
            color = Color(0xFF2E7D32),
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(12.dp))
        // 4. LazyColumn Penyelamat Memori..!
        LazyColumn(
            // 5. Memberi Jarak Agar Kartu Keliatan Rapi.
            verticalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            // 6. Menggantikan forEach dengan items().

            items(productWarehouse) { pruduct ->

                // 7. Tampilan Background Product Dipercantik Dengan Card
                Card(
                    modifier = Modifier
                        .fillMaxWidth(),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFC0D3C0)),
                    elevation = CardDefaults.cardElevation(
                        defaultElevation = 16.dp
                    ),
                    shape = RoundedCornerShape(20.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(14.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(text = pruduct.icon, fontSize = 40.sp)

                        Spacer(modifier = Modifier.width(18.dp))

                        Column(
                            modifier = Modifier.weight(1f)
                        ) {
                            Text(
                                text = pruduct.name,
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp
                            )
                            Text(
                                text = "Tersedia",
                                fontSize = 16.sp,
                                color = Color(0xFF4CAF50),
                                fontWeight = FontWeight.Bold
                            )
                        }
                        Text(
                            text = "Rp ${pruduct.price}",
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color(0xFF1B5E20)
                        )
                    }

                }

            }

        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListFull()
}