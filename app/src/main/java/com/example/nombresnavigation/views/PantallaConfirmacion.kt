package com.example.nombresnavigation.views

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PantallaConfirmacion(onRegresarInicio: () -> Unit) {
    Column(modifier = Modifier.padding(16.dp)) {
        Text(text = "Pantalla C - Confirmación")
        Text(text = "Mensaje final: Proceso completado", modifier = Modifier.padding(top = 12.dp))

        Button(
            onClick = onRegresarInicio,
            modifier = Modifier.padding(top = 16.dp)
        ) {
            Text("Volver al inicio")
        }
    }
}