package com.example.sistemlist1.ui.theme

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.collections.listOf

// List Versi Gak Bisa Di Scroll (Sebelum Di Perbaiki).
// 1. Membuat Cetakan Menggunakan data class,
data class LocalProducts(
    val id: Int,
    val name: String,
    val price: Int,
    val icon: String
)
// 2. Membuat Gudang Data (List)
// Sengaja Dibuat Banyak Agar Layarnya Penuh.....!!!!
val productWarehouse = listOf(
        LocalProducts(1,"Burger", 20000, "🍔" ),
        LocalProducts(2,"Teh Hijau", 14000, "🍵"),
        LocalProducts(3,"Ayam Goreng", 8000, "🍗"),
        LocalProducts(4,"Pizza", 120000, "🍕"),
        LocalProducts(5,"Roti", 25000, "🍞"),
        LocalProducts(6,"Wafel", 29000, "🧇"),
        LocalProducts(7,"Hot Dog", 15000, "🌭"),
        LocalProducts(8,"Es Krim", 6000, "🍨"),
        LocalProducts(9,"Pudding Susu", 14000, "🍮"),
        LocalProducts(10,"Kue Ulang Tahun", 120000, "🎂"),
        LocalProducts(11,"Donat", 2000, "🍩"),
        LocalProducts(12,"Spageti", 28000, "🍝"),
        LocalProducts(13,"Pai", 30000, "🥧"),
        LocalProducts(14,"Udang Goreng", 3000, "🍤"),
        LocalProducts(15,"Kue Bulan", 18000, "🥮"),
        LocalProducts(16,"Cokelat", 6000, "🍫"),
        LocalProducts(17,"Biskuit", 5000, "🍪"),
        LocalProducts(18,"Bir", 22000, "🍺"),
        LocalProducts(19,"Sushi", 8000, "🍣"),
        LocalProducts(20,"Nasi Kari", 14000, "🍛"),
)

@Composable
fun ListNormal (modifier: Modifier = Modifier) {
// 3. Menampilkan Dengan Column Biasa...!
    Column(
        modifier = Modifier.fillMaxWidth().padding(16.dp)
    ) {
        Text(text = "Gudang UMKM (Sesi 9)", fontSize = 26.sp, fontWeight = FontWeight.Bold)
        //Text(text = "Coba Scroll Ke Bawah Kalau Bisa! 😹", color = Coolor.Red )
        Spacer(modifier = Modifier.height(16.dp))

        productWarehouse.forEach { pruduct ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 10.dp)
                    .background(color = Color(0xFFF3F4F6), RoundedCornerShape(10.dp))
            ) {
                Text(text = pruduct.icon, fontSize = 34.sp)

                Spacer(modifier = Modifier.width(16.dp))

                Column() {
                    Text(text = pruduct.name, fontWeight = FontWeight.Bold, fontSize = 25.sp)

                    Spacer(modifier =  Modifier.height(8.dp))

                    Text(text = "Rp ${pruduct.price}", fontWeight = FontWeight.Bold, fontSize = 16.sp, color = Color(0xFF2E7D32))
                }
            }

        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ListNormal()
}