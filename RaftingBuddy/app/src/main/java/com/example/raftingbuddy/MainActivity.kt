package com.example.raftingbuddy

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.raftingbuddy.screens.*
import com.example.raftingbuddy.ui.theme.RaftingBuddyTheme
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.NavHost


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RaftingBuddyTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    RaftingBuddy()
                }
            }
            }
        }
    }


@Composable
fun RaftingBuddy(){
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "Login") {
        composable("Login") { Login(navController = navController) }
        composable("Home") { Home(navController = navController) }
        composable("Signup") { Signup(navController = navController) }
        composable("Neretva") { Neretva(navController = navController) }
        composable("Tara") { Tara(navController = navController) }
        composable("Vrbas") { Vrbas(navController = navController) }
        composable("Profile") { Profile(navController = navController) }
        composable("AddNewPost") { AddNewPost(navController = navController) }

    }
}







@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RaftingBuddy()
}