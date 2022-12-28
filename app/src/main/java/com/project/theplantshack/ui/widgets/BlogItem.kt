package com.project.theplantshack.ui.widgets

import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Spring
import androidx.compose.animation.core.spring
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.theplantshack.data.model.Blog
import com.project.theplantshack.ui.theme.Montserrat

@Composable
fun BlogItem(blog: Blog) {
    val expanded = remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 16.dp, vertical = 8.dp)
            .animateContentSize(
                animationSpec = spring(
                    dampingRatio = Spring.DampingRatioHighBouncy,
                    stiffness = Spring.StiffnessLow
                )
            )
            .clickable { expanded.value = !expanded.value },
        shape = RoundedCornerShape(10.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            Image(
                painterResource(id = blog.image),
                contentDescription = "Explore image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clipToBounds()
            )

            Text(
                text = blog.title,
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = Montserrat,
                    color = Color.DarkGray
                ),
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp, top = 8.dp, bottom = 8.dp)
            )
            if (expanded.value) {
                DisplayDescription(blog = blog)
            }
        }
    }
}

@Composable
fun DisplayDescription(blog: Blog) {
    Text(
        text = blog.description,
        style = TextStyle(
            fontSize = 12.sp,
            fontFamily = Montserrat,
            color = Color.Gray
        ),
        modifier = Modifier
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
    )
}
