package com.example.nombresnavigation.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PantallaDetalle(
    nombre: String,
    onIrAPantallaC: () -> Unit
) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Pantalla B - Detalle")
        Text(text = "Nombre recibido: $nombre", modifier = Modifier.padding(top = 12.dp))

        Button(
            onClick = onIrAPantallaC,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Ir a Pantalla C")
        }
    }
}