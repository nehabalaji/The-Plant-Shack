package com.project.theplantshack.ui.widgets

import androidx.compose.foundation.layout.size
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.project.theplantshack.data.model.BottomNavigationItem
import com.project.theplantshack.ui.theme.lightGray03
import com.project.theplantshack.ui.theme.lightGreen02

@Composable
fun BottomNavigationBar() {
    val selectedItem = rememberSaveable { mutableStateOf(BottomNavigationItem.Home.title) }
    val items = listOf(
        BottomNavigationItem.Home,
        BottomNavigationItem.Plant,
        BottomNavigationItem.Scan,
        BottomNavigationItem.Cart,
        BottomNavigationItem.Settings
    )
    BottomNavigation(
        backgroundColor = lightGray03,
        contentColor = Color.Gray
    ) {
        items.forEach { item ->
            BottomNavigationItem(
                icon = {
                    Icon(
                        painterResource(id = item.icon),
                        contentDescription = item.title,
                        modifier = Modifier
                            .size(20.dp)
                    )
                },
                label = {
                    Text(
                        text = item.title
                    )
                },
                selectedContentColor = lightGreen02,
                unselectedContentColor = Color.Black.copy(0.4f),
                alwaysShowLabel = false,
                selected = item.title == selectedItem.value,
                onClick = {
                    selectedItem.value = item.title
                }
            )
        }
    }
}
