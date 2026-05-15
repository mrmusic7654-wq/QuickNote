package com.example.quicknote.ui.components

import androidx.activity.compose.BackHandler
import androidx.compose.runtime.Composable

@Composable
fun AppBackHandler(onBack: () -> Unit) { BackHandler(onBack = onBack) }