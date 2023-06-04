package com.example.raftingbuddy.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.raftingbuddy.components.VrbasGrid

@Composable
fun Vrbas(navController: NavHostController){
    Column(Modifier.fillMaxSize().background(Color.White)) {
        UpperNavigationBar(screenName = "Vrbas")
        VrbasGrid()
    }
    MyBottomBar(navController = navController)

}

@Preview
@Composable
fun DefaultPreviewOfVrbas(){
    val navController = rememberNavController()
    Vrbas(navController=navController)
}