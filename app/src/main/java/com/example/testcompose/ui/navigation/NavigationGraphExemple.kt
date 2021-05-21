package com.example.testcompose.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.testcompose.ui.component.*
import com.example.testcompose.ui.component.viewModel.ExampleViewModel

@Composable
fun NavigationGraphExample(){
    val navController = rememberNavController()
    
    NavHost(navController = navController, startDestination = Screen.NavigationExampleNav.route){
        composable(Screen.NavigationExampleNav.route){
            NavigationScreenExample(navController)
        }
        composable(Screen.BoxExampleNav.route){
            BoxExample()
        }
        composable(Screen.StateBadExampleNav.route){
            ExampleStateBad()
        }
        composable(Screen.StateGoodExampleNav.route){
            ExampleStateGood()
        }
        composable(Screen.ViewModelExampleNav.route){
            ExampleViewModel()
        }
        composable(Screen.AnimationExampleNav.route){
            ExampleAnimation()
        }
    }
}