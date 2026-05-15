package com.example.quicknote.ui.navigation

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object AddEditNote : Screen("add_edit_note/{noteId}")
    object Settings : Screen("settings")
}