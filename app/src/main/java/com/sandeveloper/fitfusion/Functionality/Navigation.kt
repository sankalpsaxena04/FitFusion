package com.sandeveloper.fitfusion.Functionality

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.sandeveloper.fitfusion.ui.MainScreens.connect
import com.sandeveloper.fitfusion.ui.MainScreens.home
import com.sandeveloper.fitfusion.ui.MainScreens.mainPage
import com.sandeveloper.fitfusion.ui.MainScreens.more
import com.sandeveloper.fitfusion.ui.MainScreens.progress
import com.sandeveloper.fitfusion.ui.authui.firstPage
import com.sandeveloper.fitfusion.ui.authui.login
import com.sandeveloper.fitfusion.ui.authui.register

@Composable
fun Navigation(navHostController: NavHostController){

    NavHost(navController = navHostController, startDestination = Screen.FirstPage.route ){
        composable(
            route= Screen.FirstPage.route
        ){
            firstPage(navHostController)
        }

        composable(
            route= Screen.Login.route
        ){
            login(navHostController)
        }

        composable(
            route= Screen.Register.route
        ){
            register(navHostController)
        }

        composable(route = Screen.Home.route){
            home(navHostController)
        }

        composable(route = Screen.Connect.route){
            connect(navHostController)
        }

        composable(route = Screen.Progress.route){
            progress(navHostController)
        }

        composable(route = Screen.More.route){
            more(navHostController)
        }
        composable(route= Screen.Main.route){
            mainPage(navHostController)
        }
    }
}