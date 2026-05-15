package com.example.quicknote.ui.components

import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable

@Composable
fun AppSnackbarHost(hostState: SnackbarHostState) { SnackbarHost(hostState = hostState) }