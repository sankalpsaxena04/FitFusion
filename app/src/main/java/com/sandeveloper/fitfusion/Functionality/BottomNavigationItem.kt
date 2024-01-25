package com.sandeveloper.fitfusion.Functionality

import androidx.compose.ui.graphics.vector.ImageVector

data class BottomNavigationItem(
    val title: String,
    val selectedIcon:ImageVector,
    val unselectedIcon:ImageVector,
    val hasUpdate:Boolean,
    val badgeCount:Int?=null,
    val route:String
)
