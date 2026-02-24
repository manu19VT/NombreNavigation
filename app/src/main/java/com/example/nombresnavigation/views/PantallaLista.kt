package com.example.nombresnavigation.views

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PantallaLista(onNombreClick: (String) -> Unit) {
    val nombres = listOf("Manuel", "Ana", "Carlos", "Sofía")

    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Pantalla A - Lista")

        nombres.forEach { nombre ->
            Text(
                text = nombre,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .clickable {
                        onNombreClick(nombre)
                    }
                    .padding(12.dp)
            )
        }
    }
}