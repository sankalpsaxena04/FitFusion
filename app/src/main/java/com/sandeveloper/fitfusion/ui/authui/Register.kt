package com.sandeveloper.fitfusion.ui.authui

import android.health.connect.datatypes.HeightRecord
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ArrowBackIosNew
import androidx.compose.material.icons.outlined.Height
import androidx.compose.material.icons.outlined.Mail
import androidx.compose.material.icons.outlined.MonitorWeight
import androidx.compose.material.icons.outlined.Password
import androidx.compose.material.icons.outlined.RemoveRedEye
import androidx.compose.material.icons.outlined.SupervisedUserCircle
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.sandeveloper.fitfusion.R

@Composable
fun register(navController: NavController){
    val scrollState = rememberScrollState()

    var filledEmailId by remember{
        mutableStateOf("")
    }
    var filledPassword by remember {
        mutableStateOf("")
    }
    var filledUserName by remember{
        mutableStateOf("")
    }
    var refilledPassword by remember {
        mutableStateOf("")
    }
    var filledHeight by remember{
        mutableStateOf("")
    }
    var filledWeight by remember {
        mutableStateOf("")
    }

    Column (modifier = Modifier
        .fillMaxSize()
        .verticalScroll(scrollState)
    ){
        IconButton(onClick = { navController.popBackStack()},modifier = Modifier
            .wrapContentSize(Alignment.TopStart)
            .offset(10.dp, 10.dp)) {
            Icon(imageVector = Icons.Outlined.ArrowBackIosNew, contentDescription ="back",
                modifier = Modifier.size(18.dp)
            )
        }

        Text(
            text = "Hello! Register to get started",
            style = TextStyle(
                fontSize = 30.sp,
                fontFamily = FontFamily(Font(R.font.urbanist_black)),
                fontWeight = FontWeight(700),
                color = MaterialTheme.colorScheme.primary,
            ), modifier = Modifier
                .padding(30.dp)
                .fillMaxWidth()

        )
        OutlinedTextField(value = filledUserName, onValueChange = { filledUserName = it }, label = {

            Text(text = "Enter your Username", color = MaterialTheme.colorScheme.primary)

        }, singleLine = true
            , modifier = Modifier
            .align(Alignment.CenterHorizontally)
            .fillMaxWidth()
            .padding(30.dp, 30.dp, 30.dp, 10.dp), placeholder = {
            Text(
                text = "XYZ"
            )
        },
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Text,
                 imeAction = ImeAction.Next
            )
        , leadingIcon = {
            Icon(
                imageVector = Icons.Outlined.SupervisedUserCircle,
                contentDescription = "UserName",
                tint = MaterialTheme.colorScheme.secondary
            )
        })



        OutlinedTextField(value = filledEmailId,
            onValueChange = { filledEmailId = it },
            label = {
                Text(text = "Enter your Email", color = MaterialTheme.colorScheme.primary)

            }, singleLine = true,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(30.dp, 20.dp, 30.dp, 10.dp),
            placeholder = {
                Text(
                    text = "example@eg.com"
                )
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email, imeAction = ImeAction.Next),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Mail,
                    contentDescription = "Email",
                    tint = MaterialTheme.colorScheme.secondary
                )
            })



        OutlinedTextField(value = filledPassword,
            onValueChange = { filledPassword = it },
            label = {
                Text(text = "Enter your Password", color = MaterialTheme.colorScheme.primary)
            }, singleLine = true,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(30.dp, 20.dp, 30.dp, 10.dp),
            placeholder = {
                Text(
                    text = ".........."
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Next),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Password,
                    contentDescription = "Password",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.RemoveRedEye, contentDescription = "Seek Password")
                }
            })
        OutlinedTextField(value = refilledPassword,
            onValueChange = { refilledPassword = it },
            label = {
                Text(text = "Confirm Password", color = MaterialTheme.colorScheme.primary)
            }, singleLine = true,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(30.dp, 20.dp, 30.dp, 10.dp),
            placeholder = {
                Text(
                    text = ".........."
                )
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password, imeAction = ImeAction.Next),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Password,
                    contentDescription = "Password",
                    tint = MaterialTheme.colorScheme.secondary
                )
            },
            trailingIcon = {
                IconButton(onClick = { /*TODO*/ }) {
                    Icon(imageVector = Icons.Outlined.RemoveRedEye, contentDescription = "Seek Password")
                }
            })
        OutlinedTextField(value = filledHeight,
            onValueChange = { filledHeight = it },
            label = {
                Text(text = "Height", color = MaterialTheme.colorScheme.primary)
            }, singleLine = true,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(30.dp, 20.dp, 30.dp, 10.dp),
            suffix = {
                Text(text = "cm")
            },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal, imeAction = ImeAction.Next),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.Height,
                    contentDescription = "Height",
                    tint = MaterialTheme.colorScheme.secondary
                )
            })
        OutlinedTextField(value = filledWeight,
            onValueChange = { filledWeight = it },
            label = {
                Text(text = "Weight", color = MaterialTheme.colorScheme.primary)
            }, singleLine = true,
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .fillMaxWidth()
                .padding(30.dp, 20.dp, 30.dp, 10.dp),
             suffix = {
                              Text(text = "kg")
            }
            ,
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Decimal, imeAction = ImeAction.Done),

            leadingIcon = {
                Icon(
                    imageVector = Icons.Outlined.MonitorWeight,
                    contentDescription = "Weight",
                    tint = MaterialTheme.colorScheme.secondary
                )
            })


        FilledTonalButton(onClick = {  },
            modifier = Modifier
                .padding(45.dp, 40.dp, 45.dp, 25.dp)
                .clip(RoundedCornerShape(10.dp))
                .background(MaterialTheme.colorScheme.primary)
                .fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(MaterialTheme.colorScheme.primary)


        ) {
            Text(
                text = "Register",
                style = TextStyle(
                    fontSize = 15.sp,
                    fontWeight = FontWeight(600),
                    color = MaterialTheme.colorScheme.inversePrimary,
                    textAlign = TextAlign.Center
                )
            )
        }

        TextButton(onClick = { /*TODO*/ }, modifier = Modifier.fillMaxWidth()) {
            Text(buildAnnotatedString {

                withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                    append("Already have an Account? ")
                }
                withStyle(style = SpanStyle(color = MaterialTheme.colorScheme.tertiary)) {
                    append("Login")
                }
            })
        }
    }

}