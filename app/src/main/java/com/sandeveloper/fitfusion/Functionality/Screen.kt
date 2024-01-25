package com.sandeveloper.fitfusion.Functionality

sealed class Screen(val route:String) {
    object FirstPage: Screen("firstPage_screen")
    object Login: Screen("login_screen")
    object  Register: Screen("register_screen")
    object  Home:Screen("home_screen")
    object  Connect:Screen("connect_screen")
    object More:Screen("more_screen")
    object Progress:Screen("progress_screen")
    object Profile:Screen("profile_screen")
    object Main:Screen("main_page")
}