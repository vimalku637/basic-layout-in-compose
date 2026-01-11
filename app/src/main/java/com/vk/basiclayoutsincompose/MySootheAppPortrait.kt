package com.vk.basiclayoutsincompose

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.vk.basiclayoutsincompose.ui.theme.BasicLayoutsInComposeTheme

@Composable
fun MySootheAppPortrait() {
    BasicLayoutsInComposeTheme {
        Scaffold(
            bottomBar = { SootheBottomNavigation() }
        ) { padding ->
            HomeScreen(Modifier.padding(padding))
        }
    }
}