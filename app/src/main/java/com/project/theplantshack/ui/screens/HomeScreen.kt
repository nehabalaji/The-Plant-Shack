package com.project.theplantshack.ui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.project.theplantshack.R
import com.project.theplantshack.data.resource.SampleData
import com.project.theplantshack.ui.theme.Montserrat
import com.project.theplantshack.ui.widgets.BlogItem
import com.project.theplantshack.ui.widgets.PlantItem
import com.project.theplantshack.ui.widgets.Title

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(rememberScrollState())
    ) {
        Title(title = "Shop")
        PlantList()
        HomeBanner()
        Title(title = "Explore")
        ExploreList()
    }
}

@Composable
fun PlantList() {
    LazyRow(
        contentPadding = PaddingValues(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        items(SampleData.getPlants()) { plant ->
            PlantItem(plant = plant)
        }
    }
}

@Composable
private fun HomeBanner() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, bottom = 16.dp)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.BottomCenter)
                .height(150.dp)
                .clip(RoundedCornerShape(20.dp))
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_banner_bg),
                contentDescription = "Home banner",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .width(200.dp)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Get 50% Discount Today",
                    style = TextStyle(
                        fontSize = 30.sp,
                        fontFamily = Montserrat,
                        color = Color.DarkGray
                    )
                )
            }
        }

        Box(
            modifier = Modifier
                .height(200.dp)
                .align(Alignment.BottomEnd)
                .padding(bottom = 16.dp, end = 8.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.home_banner_plant),
                contentDescription = "Banner plant",
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
                    .offset(y = 15.dp, x = 40.dp)
                    .clipToBounds(),
                contentScale = ContentScale.Crop
            )
        }
    }
}

@Composable
private fun ExploreList() {
    LazyColumn(
        contentPadding = PaddingValues(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = Modifier
            .height(500.dp)
    ) {
        items(SampleData.getBlogs()) { blog ->
            BlogItem(blog)
        }
    }
}
