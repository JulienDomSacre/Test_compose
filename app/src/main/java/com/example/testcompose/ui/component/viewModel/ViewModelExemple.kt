package com.example.testcompose.ui.component.viewModel

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExampleViewModel() {
    val viewModel: ViewModelExampleViewModel = viewModel()
    val viewState by viewModel.state.collectAsState()

    viewState.apply {
        when(resultStatus){
            ResultStatus.Success -> ExampleViewModelSuccess {
                viewModel.changeState()
            }
            ResultStatus.Error -> ExampleViewModelError {
                viewModel.changeState()
            }
        }
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExampleViewModelSuccess(
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .fillMaxSize(),
        onClick = { onClick()}) {
        Text(
            text = "Success",
            color = Color.Green,
            fontSize = 48.sp
        )
    }
}

@SuppressLint("UnrememberedMutableState")
@Composable
fun ExampleViewModelError(
    onClick: () -> Unit
) {
    Button(
        modifier = Modifier
            .fillMaxSize(),
        onClick = { onClick()}) {
        Text(
            text = "Error",
            color = Color.Red,
            fontSize = 48.sp
        )
    }
}