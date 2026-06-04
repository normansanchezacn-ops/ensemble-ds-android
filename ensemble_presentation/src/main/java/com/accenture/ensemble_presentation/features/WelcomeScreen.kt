package com.accenture.ensemble_presentation.features

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.accenture.ensemble_presentation.R

@Composable
fun WelcomeScreen() {
    Card(modifier = Modifier.padding(40.dp)) {
        var expanded by remember { mutableStateOf(false) }
        Column(Modifier.clickable { expanded = !expanded }) {
            Image(
                painterResource(R.drawable.image),
                contentDescription = "Welcome image"
            )
            AnimatedVisibility(expanded) {
                HomeScreen()
            }
        }
    }
}

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun WelcomeScreenPreview() {
    WelcomeScreen()
}