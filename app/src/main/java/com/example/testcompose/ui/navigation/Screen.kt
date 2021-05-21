package com.example.testcompose.ui.navigation

sealed class Screen(val route: String) {
    object NavigationExampleNav: Screen("navigationExample")
    object BoxExampleNav : Screen("boxExample")
    object StateBadExampleNav : Screen("stateBadExample")
    object StateGoodExampleNav : Screen("stateGoodExample")
    object ViewModelExampleNav : Screen("viewModelExample")
    object AnimationExampleNav: Screen("animationExample")
}