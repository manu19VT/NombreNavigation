package com.example.nombresnavigation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import com.example.nombresnavigation.views.PantallaConfirmacion
import com.example.nombresnavigation.views.PantallaDetalle
import com.example.nombresnavigation.views.PantallaLista

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = "pantallaA"
    ) {

        // Pantalla A (Lista)
        composable("pantallaA") {
            PantallaLista(
                onNombreClick = { nombre ->
                    navController.navigate("pantallaB/$nombre")
                }
            )
        }

        // Pantalla B (Detalle)
        composable(
            route = "pantallaB/{nombre}",
            arguments = listOf(navArgument("nombre") { type = NavType.StringType })
        ) { backStackEntry ->
            val nombre = backStackEntry.arguments?.getString("nombre") ?: ""

            PantallaDetalle(
                nombre = nombre,
                onIrAPantallaC = {
                    navController.navigate("pantallaC")
                }
            )
        }

        // Pantalla C (Confirmación)
        composable("pantallaC") {
            PantallaConfirmacion(
                onRegresarInicio = {
                    navController.navigate("pantallaA") {
                        popUpTo("pantallaA") { inclusive = true } // limpia stack
                    }
                }
            )
        }
    }
}