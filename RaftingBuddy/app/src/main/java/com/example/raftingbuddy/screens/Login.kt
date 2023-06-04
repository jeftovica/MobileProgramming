package com.example.raftingbuddy.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.raftingbuddy.R


@Composable
fun Login(
    modifier: Modifier = Modifier,
    navController: NavHostController

) {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    val focusManager = LocalFocusManager.current

    Column(
        modifier
            .fillMaxSize()
            .background(color = Color(0xFF4189e8)),
    ) {
        Column(
            modifier
                .fillMaxWidth()
                .height(300.dp)
                .background(color = Color(0xFF4189e8)),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = "Logo of App",
                modifier = Modifier.size(300.dp)
            )
        }
        Column(
            modifier
                .fillMaxWidth()
                .height(550.dp)
                .background(color = Color(0xFF4189e8))
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Column(
                horizontalAlignment = Alignment.Start,
                modifier = modifier.background(color = Color(0xFF4189e8))
            ) {
                Text(
                    text = "Email:",
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = modifier.padding(5.dp),
                )
                TextField(
                    value = email,
                    placeholder = { Text("example@email.com") },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next
                    ),
                    keyboardActions = KeyboardActions(onNext = {
                        focusManager.moveFocus(
                            FocusDirection.Down
                        )
                    }),
                    singleLine = true,
                    onValueChange = { email = it },
                    modifier = modifier
                        .clip(RoundedCornerShape(50.dp))
                        .height(55.dp)
                        .width(300.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Black,
                        placeholderColor = Color.Gray,
                        focusedIndicatorColor = Color.Transparent, // removes underline when focused
                        unfocusedIndicatorColor = Color.Transparent, // removes underline when unfocused
                        disabledIndicatorColor = Color.Transparent, // removes underline when disabled
                        backgroundColor = Color.White
                    )
                )
            }

            Column(
                horizontalAlignment = Alignment.Start,
                modifier = modifier.background(color = Color(0xFF4189e8))
            ) {
                Text(
                    text = "Password:",
                    fontSize = 15.sp,
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    modifier = modifier.padding(5.dp),
                )
                TextField(
                    value = password,
                    placeholder = { Text("Password") },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(onNext = { focusManager.clearFocus() }),
                    singleLine = true,
                    onValueChange = { password = it },
                    visualTransformation = PasswordVisualTransformation(),
                    modifier = modifier
                        .clip(RoundedCornerShape(50.dp))
                        .height(55.dp)
                        .width(300.dp),
                    colors = TextFieldDefaults.textFieldColors(
                        textColor = Color.Black,
                        placeholderColor = Color.Gray,
                        focusedIndicatorColor = Color.Transparent, // removes underline when focused
                        unfocusedIndicatorColor = Color.Transparent, // removes underline when unfocused
                        disabledIndicatorColor = Color.Transparent, // removes underline when disabled
                        backgroundColor = Color.White
                    )
                )
            }
            Column(
                modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .background(color = Color(0xFF4189e8))
                    .verticalScroll(rememberScrollState())
                    .padding(56.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier
                        .clickable {navController.navigate("Home")}
                        .height(50.dp)
                        .background(color = Color(0xFF4aed4c), shape = RoundedCornerShape(25.dp))
                        .verticalScroll(rememberScrollState())
                        .width(150.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center

                ) {
                    Text(
                        text = "Login",
                        fontSize = 20.sp,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        modifier = modifier.padding(5.dp),
                    )
                }
            }
            Row(modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .background(color = Color(0xFF4189e8)),
                horizontalArrangement = Arrangement.Center,

                ) {
                Text(
                    text = "You do not have a profile?",
                    color= Color.White,
                    modifier = Modifier.padding(vertical = 8.dp)
                )
                ClickableText(
                    text = AnnotatedString(" Register"),
                    style = TextStyle(color = Color(0xFF4aed4c)),
                    onClick = {
                        navController.navigate("Signup")
                    },
                    modifier = Modifier
                        .padding(vertical = 8.dp)

                )
            }


        }

    }



}

@Preview
@Composable
fun DefaultPreviewOfLogin(){
    val navController = rememberNavController()
    Login(navController = navController)
}

