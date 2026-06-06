package com.example.bottomnavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navController = rememberNavController()
            Scaffold(
                bottomBar = {
                    BottomNavigationBar(
                        items = listOf(
                            BottomNavItem("Home", "home", Icons.Default.Home),
                            BottomNavItem("Chat", "chat", Icons.Default.Notifications, 25),
                            BottomNavItem("Settings", "setting", Icons.Default.Settings)
                        ),
                        navController = navController,
                        onItemClick = {
                            navController.navigate(it.route)
                        }
                    )
                }
            ) { innerPadding ->
                Navigation(
                    navHostController = navController,
                    modifier = Modifier.padding(innerPadding)
                )
            }
        }
    }
}


@Composable
fun Navigation(navHostController: NavHostController, modifier: Modifier = Modifier) {
    NavHost(navController = navHostController, startDestination = "home")
    {
        composable("home")
        {
            HomeScreen()
        }

        composable("chat")
        {
            ChatScreen()
        }

        composable("setting")
        {
            SettingsScreen()
        }
    }
}


@Composable
fun BottomNavigationBar(
    items: List<BottomNavItem>,
    navController: NavController,
    modifier: Modifier = Modifier,
    onItemClick: (BottomNavItem) -> Unit
) {
    NavigationBar(
        modifier = modifier,
        containerColor = Color.Cyan,
        tonalElevation = 4.dp
    ) {
        items.forEach { item ->
            val backStackEntry = navController.currentBackStackEntryAsState()
            val selected = item.route == backStackEntry.value?.destination?.route
            NavigationBarItem(
                selected = selected,
                onClick = { onItemClick(item) },
                icon = {
                    Icon(imageVector = item.icon, contentDescription = item.name)
                },
                label = {
                    Text(text = item.name)
                }
            )
        }
    }
}


@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Home Screen"
        )
    }
}

@Composable
fun ChatScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Chat Screen"
        )
    }
}


@Composable
fun SettingsScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    )
    {
        Text(
            text = "Settings Screen"
        )
    }
}