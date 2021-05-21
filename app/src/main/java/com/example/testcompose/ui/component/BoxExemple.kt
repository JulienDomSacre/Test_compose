package com.example.testcompose.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun BoxExample() {
    Box(
        Modifier
            .size(220.dp, 220.dp)
            .background(Color.Cyan)) {
        Box(
            Modifier
                .align(Alignment.TopStart)
                .size(150.dp, 150.dp)
                .background(Color.Red)
        )
        Box(
            Modifier
                .align(Alignment.TopStart)
                .size(80.dp, 80.dp)
                .background(Color.Blue)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun BoxExamplePreview() {
    BoxExample()
}