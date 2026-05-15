package com.example.quicknote.ui.components

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

@Composable
fun AppNavigationDrawer(drawerState: DrawerState, content: @Composable () -> Unit) {
    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                Text("QuickNote", style = MaterialTheme.typography.headlineSmall, modifier = androidx.compose.ui.Modifier.padding(16.dp))
                NavigationDrawerItem(label = { Text("Notes") }, selected = true, onClick = {})
                NavigationDrawerItem(label = { Text("Settings") }, selected = false, onClick = {})
            }
        },
        content = content
    )
}