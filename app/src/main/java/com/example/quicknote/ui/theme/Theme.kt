package com.example.quicknote.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable

private val DarkColorScheme = darkColorScheme(
    primary = Cyan80,
    secondary = CyanGrey80,
    background = BackgroundDark
)

@Composable
fun QuickNoteTheme(content: @Composable () -> Unit) {
    MaterialTheme(colorScheme = DarkColorScheme, content = content)
}