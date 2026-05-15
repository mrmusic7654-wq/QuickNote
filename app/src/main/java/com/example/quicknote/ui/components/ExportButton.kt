package com.example.quicknote.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun ExportButton(onExport: () -> Unit) {
    Button(onClick = onExport) { Text("Export") }
}