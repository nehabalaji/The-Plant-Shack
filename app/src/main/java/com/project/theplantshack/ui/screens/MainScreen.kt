package com.project.theplantshack.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import com.project.theplantshack.ui.theme.lightGray02
import com.project.theplantshack.ui.widgets.BottomNavigationBar
import com.project.theplantshack.ui.widgets.TopBar

@Composable
fun MainScreen() {
    val searchInput = rememberSaveable { mutableStateOf("") }
    Scaffold(
        topBar = { TopBar(searchInput) },
        bottomBar = { BottomNavigationBar() },
        content = { padding ->
            Column(
                modifier = Modifier
                    .padding(padding)
            ) {
                HomeScreen()
            }
        },
        backgroundColor = lightGray02
    )
}
