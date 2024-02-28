package com.example.project.presentation.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.project.MainViewModel
import com.example.project.common.Routes
import com.example.project.presentation.common.CheckSignedIn
import com.example.project.presentation.common.ProgressSpinner

@Composable
fun LogoutScreen(navController: NavController, vm: MainViewModel) {
    CheckSignedIn(vm = vm, navController = navController)

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "Logout",
                modifier = Modifier.padding(8.dp),
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    vm.onLogout()
                    navController.navigate(Routes.Login.route) {
                        popUpTo(Routes.Logout.route) {
                            inclusive = true
                        }
                    }
                },
                modifier = Modifier.padding(8.dp)
            ) {
                Text(text = "LOGOUT")
            }
        }

        val isLoading = vm.inProgress.value
        if (isLoading) {
            ProgressSpinner()
        }
    }
}
