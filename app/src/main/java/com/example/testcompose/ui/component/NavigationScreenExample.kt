package com.example.testcompose.ui.component

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.navigate
import com.example.testcompose.ui.navigation.Screen

@Composable
fun NavigationScreenExample(navControler: NavHostController) {
    Column() {
        val modifier = Modifier
            .fillMaxWidth()
            .weight(1f)
            .padding(8.dp)
        Button(
            modifier = modifier,
            onClick = { navControler.navigate(Screen.BoxExampleNav.route) }) {
            Text(
                text = "Box Example",
                color = Color.Green,
                fontSize = 24.sp
            )
        }
        Button(
            modifier = modifier,
            onClick = { navControler.navigate(Screen.StateBadExampleNav.route) }) {
            Text(
                text = "State bad Example",
                color = Color.Green,
                fontSize = 24.sp
            )
        }
        Button(
            modifier = modifier,
            onClick = { navControler.navigate(Screen.StateGoodExampleNav.route) }) {
            Text(
                text = "State good Example",
                color = Color.Green,
                fontSize = 24.sp
            )
        }
        Button(
            modifier = modifier,
            onClick = { navControler.navigate(Screen.ViewModelExampleNav.route) }) {
            Text(
                text = "ViewModel Example",
                color = Color.Green,
                fontSize = 24.sp
            )
        }
        Button(
            modifier = modifier,
            onClick = { navControler.navigate(Screen.AnimationExampleNav.route) }) {
            Text(
                text = "Animation Example",
                color = Color.Green,
                fontSize = 24.sp
            )
        }
    }
}