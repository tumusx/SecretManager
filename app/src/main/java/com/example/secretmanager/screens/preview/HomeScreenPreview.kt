package com.example.secretmanager.screens.preview

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.secretmanager.screens.HomeScreen
import com.example.secretmanager.ui.theme.SecretManagerTheme

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    SecretManagerTheme {
        HomeScreen(Modifier.padding(16.dp))
    }
}