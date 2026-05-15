package com.example.quicknote.ui.components

import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable

@Composable
fun NoteFAB(onClick: () -> Unit) {
    FloatingActionButton(onClick = onClick) { Icon(Icons.Default.Add, contentDescription = null) }
}