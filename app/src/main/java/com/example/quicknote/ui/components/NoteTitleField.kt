package com.example.quicknote.ui.components

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun NoteTitleField(value: String, onValueChange: (String) -> Unit) {
    TextField(value = value, onValueChange = onValueChange, label = { androidx.compose.material3.Text("Title") })
}