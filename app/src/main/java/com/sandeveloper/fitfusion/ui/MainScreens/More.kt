package com.sandeveloper.fitfusion.ui.MainScreens

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.sandeveloper.fitfusion.Functionality.Screen

@Composable
@OptIn(ExperimentalMaterial3Api::class)
fun more(navController: NavController){
    navController.navigate(Screen.Profile.route)
    ModalBottomSheet(onDismissRequest = { /*TODO*/ }) {

    }
}