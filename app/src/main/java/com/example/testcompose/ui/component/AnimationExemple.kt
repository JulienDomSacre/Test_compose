package com.example.testcompose.ui.component

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun ExampleAnimation() {
    var isOn by remember { mutableStateOf(false) }
    val colorEx1 by animateColorAsState(
        targetValue = if (!isOn) Color.Red else Color.Green,
        animationSpec = tween(durationMillis = 1000)
    )
    val colorEx2 by animateColorAsState(
        targetValue = if (!isOn) Color.Red else Color.Green,
        animationSpec = tween(durationMillis = 1000, easing = FastOutLinearInEasing)
    )
    val colorEx3 by animateColorAsState(
        targetValue = if (!isOn) Color.Red else Color.Green,
        animationSpec = tween(durationMillis = 1000, easing = LinearEasing)
    )
    val colorEx4 by animateColorAsState(
        targetValue = if (!isOn) Color.Red else Color.Green,
        animationSpec = tween(durationMillis = 1000, easing = LinearOutSlowInEasing)
    )

    Column() {
        Button(
            onClick = { isOn = !isOn },
            modifier = Modifier
                .fillMaxWidth()
                .height(60.dp)
                .padding(top = 8.dp)
        ) { Text(text = "Click to animate")}
        Column() {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(16.dp)
                    .background(
                        color = colorEx1
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(16.dp)
                    .background(
                        color = colorEx2
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(16.dp)
                    .background(
                        color = colorEx3
                    )
            )
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
                    .padding(16.dp)
                    .background(
                        color = colorEx4
                    )
            )
        }

    }


}