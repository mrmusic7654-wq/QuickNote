package com.example.quicknote.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ColorPicker(selectedColor: Color, onColorSelected: (Color) -> Unit) {
    val colors = listOf(Color.Red, Color.Blue, Color.Green, Color.Yellow, Color.Magenta)
    Row(modifier = Modifier.padding(8.dp)) {
        colors.forEach { color ->
            Box(modifier = Modifier
                .size(40.dp)
                .padding(4.dp)
                .background(color, CircleShape)
                .clickable { onColorSelected(color) })
        }
    }
}