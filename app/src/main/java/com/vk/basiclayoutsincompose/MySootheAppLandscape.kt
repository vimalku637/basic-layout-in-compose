package com.vk.basiclayoutsincompose

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.vk.basiclayoutsincompose.ui.theme.BasicLayoutsInComposeTheme

@Composable
fun MySootheAppLandscape() {
    BasicLayoutsInComposeTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            Row {
                SootheNavigationRail()
                HomeScreen()
            }
        }
    }
}