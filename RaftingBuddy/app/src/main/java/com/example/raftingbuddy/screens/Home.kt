package com.example.raftingbuddy.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.example.raftingbuddy.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController


@Composable
fun Home(
    modifier: Modifier = Modifier,
    navController: NavHostController

) {

    Column(
        modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center

    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Column(modifier = Modifier.clickable {  navController.navigate("Neretva")})
            {
                Image(
                    painter = painterResource(R.drawable.neretvaapp),
                    contentDescription = "Neretva",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = "Neretva",
                    fontSize = 22.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Column(modifier = Modifier.clickable {  navController.navigate("Tara") })
            {
                Image(
                    painter = painterResource(R.drawable.taraapp),
                    contentDescription = "Tara",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = "Tara",
                    fontSize = 22.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
            Column(modifier = Modifier.clickable {  navController.navigate("Vrbas") })
            {
                Image(
                    painter = painterResource(R.drawable.vrbasapp),
                    contentDescription = "Vrbas",
                    modifier = Modifier
                        .size(150.dp)
                        .clip(CircleShape)
                )
                Text(
                    text = "Vrbas",
                    fontSize = 22.sp,
                    modifier = Modifier.align(Alignment.CenterHorizontally)
                )
            }
        }
    }


    MyBottomBar(navController = navController)
    UpperNavigationBar(screenName = "Home")
}


@Composable
fun MyBottomBar(navController: NavHostController) {
Box(
modifier = Modifier.fillMaxWidth()
) {
    Surface(
        color = Color(0xFF4189e8),
        elevation = 50.dp,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 770.dp, bottom = 0.1.dp)
            .height(90.dp)
    ) {
        Row(
            modifier = Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            IconButton(
                onClick = { navController.navigate("Home") },
                modifier = Modifier.size(60.dp)

            ) {
                Icon(
                    Icons.Filled.Home,
                    contentDescription = "Home",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
            IconButton(
                onClick = { navController.navigate("AddNewPost") },
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    Icons.Filled.Add,
                    contentDescription = "AddNewPost",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
            IconButton(
                onClick = { navController.navigate("Profile") },
                modifier = Modifier.size(60.dp)
            ) {
                Icon(
                    Icons.Filled.Person,
                    contentDescription = "Profile",
                    tint = Color.White,
                    modifier = Modifier.size(40.dp)
                )
            }
        }
    }
}
}

@Composable
fun UpperNavigationBar(
    screenName: String,
    backgroundColor: Color = Color(0xFF4189e8),
    contentColor: Color = contentColorFor(backgroundColor),
    elevation: Dp = AppBarDefaults.TopAppBarElevation
    ) {
        TopAppBar(
            backgroundColor = backgroundColor,
            contentColor = contentColor,
            elevation = elevation,
            modifier = Modifier
                .height(90.dp)
                .fillMaxWidth()
        ) {
            Image(
                painter = painterResource(R.drawable.logo_mini),
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 16.dp)
                    .size(70.dp)
            )
            Text(
                text = screenName,
                color = Color.White,
                fontSize = 30.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
        }



@Preview
@Composable
fun DefaultPreviewOfHome(){
    val navController = rememberNavController()
    Home(navController= navController)
}
