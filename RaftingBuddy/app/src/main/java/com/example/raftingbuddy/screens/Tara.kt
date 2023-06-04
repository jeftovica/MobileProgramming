package com.example.raftingbuddy.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.raftingbuddy.components.TaraGrid

@Composable
fun Tara(navController: NavHostController) {
    Column(Modifier.fillMaxSize().background(Color.White)){

        UpperNavigationBar(screenName = "Tara")
        TaraGrid()


    }
    MyBottomBar(navController= navController)
}

@Preview
@Composable
fun DefaultPreviewOfTara(){
    val navController = rememberNavController()
    Tara(navController = navController)
}