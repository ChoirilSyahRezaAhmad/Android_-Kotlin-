package com.example.cashier.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun Cashier( modifier: Modifier = Modifier ){
     var unitPrice by remember { mutableStateOf("") }
     var viewPrice by remember { mutableStateOf("") }


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
               colors = CardDefaults.cardColors(contentColor = Color(0xFFE8F5E9)) // Hijau Lembut
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
                                   color = Color(0xFF2E7D32),
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
               colors = CardDefaults.cardColors(contentColor = Color(0xFF6ADC73)), // Hijau Lembut

          ) {
               Column(
                    modifier = Modifier
                         .fillMaxWidth()
                         .padding(26.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
               ) {
                    Text(text =  "Harga (Rp)4", fontSize = 30.sp, color = Color(0xFF49454F))
                    Text(
                         text = "Rp $viewPrice",
                         fontSize = 35.sp,
                         fontWeight = FontWeight.ExtraBold,
                         color = Color(0xFF2E7D32)
                    )
               }
          }

          Spacer(modifier = Modifier.height(20.dp))

               Row(
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
               ) {
                    Button(
                         onClick = { viewPrice = unitPrice },
                         colors = ButtonDefaults.buttonColors(
                              containerColor = Color.Blue
                         )
                    ) {
                         Text("ADD PRICE")
                    }

                    Button(
                         onClick = { viewPrice = "0"
                                   unitPrice = "0" },
                         colors = ButtonDefaults.buttonColors(
                              containerColor = Color.Red
                         )
                    ) {
                         Text("RESET PRICE")
                    }
          }
     }
}

@Preview(showBackground = true)
@Composable
fun CashierPreview() {
     Cashier()
}