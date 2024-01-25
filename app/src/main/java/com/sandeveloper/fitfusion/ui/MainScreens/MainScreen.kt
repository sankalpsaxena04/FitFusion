package com.sandeveloper.fitfusion.ui.MainScreens

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Chat
import androidx.compose.material.icons.filled.DensityMedium
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.SportsScore
import androidx.compose.material.icons.outlined.Chat
import androidx.compose.material.icons.outlined.DensityMedium
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.SportsScore
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.sandeveloper.fitfusion.Functionality.BottomNavigationItem
import com.sandeveloper.fitfusion.Functionality.Navigation
import com.sandeveloper.fitfusion.Functionality.Screen

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun mainPage(navController: NavController){
    val items = listOf(
        BottomNavigationItem(
            "Home", Icons.Filled.Home, Icons.Outlined.Home, false, route = "home_screen"
        ),
        BottomNavigationItem(
            "Connect", Icons.Filled.Chat, Icons.Outlined.Chat, false,45, route = "connect_screen"
        ),
        BottomNavigationItem(
            "Progress", Icons.Filled.SportsScore, Icons.Outlined.SportsScore, true, route = "progress_screen"
        ),
        BottomNavigationItem(
            "More", Icons.Filled.DensityMedium, Icons.Outlined.DensityMedium, false, route = "more_screen"
        )
    )

    var selectedItemIndex by rememberSaveable {
                mutableStateOf(0)
    }
    var pagerState = rememberPagerState {
        items.size
    }
    Scaffold(bottomBar = {
        NavigationBar {
            items.forEachIndexed{index, item->
                NavigationBarItem(
                    selected = selectedItemIndex==index,

                    onClick = { selectedItemIndex=index
                                navController.navigate(item.route)
                              },
                    label = { Text(text = item.title) },
                    alwaysShowLabel = false,
                    icon = {
                        BadgedBox(badge = {
                            if (item.badgeCount!=null){
                                Badge {
                                    Text(text = item.badgeCount.toString())
                                }
                            }else if(item.hasUpdate){
                                Badge()
                            }
                        }) {
                            androidx.compose.material3.Icon(imageVector =
                            if(index==selectedItemIndex){
                                item.selectedIcon }
                            else{
                                item.unselectedIcon
                                                       },
                                contentDescription =item.title )
                            
                        }
                    })

            }
        }
    }) {
    }


}