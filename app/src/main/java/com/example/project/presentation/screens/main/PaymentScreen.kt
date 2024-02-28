//package com.example.project.presentation.screens.main
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Button
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.unit.dp
//import com.example.project.MainViewModel
//// Import the correct PaymentDetails class
//import com.example.project.presentation.screens.main.PaymentDetails
//
//@Composable
//fun PaymentScreen(vm: MainViewModel) {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        // Add other UI components as needed
//
//        Button(
//            onClick = { vm.initiatePayment() },
//            modifier = Modifier.padding(16.dp)
//        ) {
//            Text(text = "Initiate Payment")
//        }
//    }
//}
