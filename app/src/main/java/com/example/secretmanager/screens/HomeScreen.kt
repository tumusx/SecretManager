package com.example.secretmanager.screens

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.example.secretmanager.screens.components.ItemsCarousel
import com.example.secretmanager.uimodel.CarouselModel

@Composable
fun HomeScreen(modifier: Modifier) {
    ItemsCarousel(
        itemsCarousel = listOf(
            CarouselModel(Color.Red, "paisagem Murillo", "zz"),
            CarouselModel(Color.Black, "Murillo Cartao", "zz"),
            CarouselModel(Color.Blue, "Murillo Item", "zz")
        )
    )
}