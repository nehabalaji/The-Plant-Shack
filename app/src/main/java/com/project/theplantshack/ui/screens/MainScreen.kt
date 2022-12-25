package com.project.theplantshack.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.project.theplantshack.ui.widgets.BottomNavigationBar
import com.project.theplantshack.ui.widgets.TopBar

@Composable
fun MainScreen() {
    Scaffold(
        topBar = { TopBar() },
        bottomBar = { BottomNavigationBar() },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
            ) {
                HomeScreen()
            }
        },
        backgroundColor = Color.White
    )
}
