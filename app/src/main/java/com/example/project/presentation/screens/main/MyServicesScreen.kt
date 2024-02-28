package com.example.project.presentation.screens.main

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.example.project.MainViewModel

@Composable
fun MyServicesScreen(navController: NavController, vm: MainViewModel) {
    val userData = vm.userData.value
    val isLoading = vm.inProgress.value
    BottomNavigationMenu(selectedItem = BottomNavigationItem.SERVICES, navController = navController)
}




