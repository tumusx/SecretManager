package com.example.secretmanager.screens.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.secretmanager.uimodel.CarouselModel

@Composable
fun ItemsCarousel(itemsCarousel: List<CarouselModel>) {
    LazyRow {
        items(itemsCarousel) {position->
            CardItemComponent(item = position)
        }
    }
}


@Composable
fun CardItemComponent(item: CarouselModel) {
    Card(colors = CardDefaults.cardColors(containerColor = item.cardColor), modifier = Modifier.padding(10.dp)) {
        Column {
            Text(text = item.nameItem, color = Color.Black, fontSize = 16.sp, modifier = Modifier.padding(16.dp), textAlign = TextAlign.Center)
        }
    }
}