package com.example.raftingbuddy.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.raftingbuddy.components.NeretvaGrid

@Composable
fun Neretva (navController: NavHostController) {
    Column(Modifier.fillMaxSize().background(Color.White)) {
        UpperNavigationBar(screenName = "Neretva")
        NeretvaGrid()
    }
    MyBottomBar(navController = navController)

}

@Preview
@Composable
fun DefaultPreviewOfNeretva(){
    val navController = rememberNavController()
    Neretva(navController = navController)
}