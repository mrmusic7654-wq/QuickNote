package com.example.quicknote.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun AppBottomNavigationBar() {
    NavigationBar {
        NavigationBarItem(icon = { Icon(Icons.Default.Home, null) }, label = { Text("Home") }, selected = true, onClick = {})
        NavigationBarItem(icon = { Icon(Icons.Default.Settings, null) }, label = { Text("Settings") }, selected = false, onClick = {})
    }
}