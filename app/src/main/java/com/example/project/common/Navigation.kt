package com.example.project.common

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.project.MainViewModel
import com.example.project.presentation.common.NotificationMessage
import com.example.project.presentation.screens.auth.LoginScreen
import com.example.project.presentation.screens.auth.SignupScreen
import com.example.project.presentation.screens.main.MyProfileScreen
import com.example.project.presentation.screens.main.ServiceScreen

@Composable
fun DemandApp() {
    val vm: MainViewModel = hiltViewModel()
    val navController = rememberNavController()
    NotificationMessage(vm = vm)
    NavHost(navController = navController, startDestination = Routes.Signup.route) {

        composable(Routes.Signup.route) {
            SignupScreen(navController = navController, vm = vm)
        }
        composable(Routes.Login.route) {
            LoginScreen(navController = navController, vm = vm)
        }
        composable(Routes.Services.route) {
            ServiceScreen(navController = navController, vm = vm)
        }

        composable(Routes.Profile.route) {
            MyProfileScreen(navController = navController, vm = vm)
        }

    }
}