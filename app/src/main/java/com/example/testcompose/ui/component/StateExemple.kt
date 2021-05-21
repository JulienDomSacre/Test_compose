package com.example.testcompose.ui.component

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExampleStateBad() {
    var isOn by mutableStateOf(false)
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                if (isOn) Color.Green else Color.Red
            )
    )
    Button(
        modifier = Modifier
            .padding(64.dp)
            .fillMaxSize(),
        onClick = { isOn = !isOn }) {
        Text(
            text = if (isOn) "On" else "Off",
            color = if (isOn) Color.Green else Color.Red,
            fontSize = 48.sp
        )
    }
}

@Composable
fun ExampleStateGood() {
    var isOn by remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                if (isOn) Color.Green else Color.Red
            )
    )
    Button(
        modifier = Modifier
            .padding(64.dp)
            .fillMaxSize(),
        onClick = { isOn = !isOn }) {
        Text(
            text = if (isOn) "On" else "Off",
            color = if (isOn) Color.Green else Color.Red,
            fontSize = 48.sp
        )
    }
}