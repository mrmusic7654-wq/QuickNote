package com.example.quicknote.ui.components

import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable

@Composable
fun SearchField(query: String, onQueryChange: (String) -> Unit) {
    TextField(value = query, onValueChange = onQueryChange, label = { androidx.compose.material3.Text("Search") })
}