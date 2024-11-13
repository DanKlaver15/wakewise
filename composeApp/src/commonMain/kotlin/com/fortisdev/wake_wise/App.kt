package com.fortisdev.wake_wise

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.*
import com.fortisdev.wake_wise.views.loginScreen
import org.jetbrains.compose.ui.tooling.preview.Preview

@Suppress("FunctionName")
@Composable
@Preview
fun App() {
    MaterialTheme {
        loginScreen()
    }
}