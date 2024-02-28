package com.example.project.presentation.screens.main

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.project.MainViewModel
import com.example.project.PaymentDetails

//import com.example.project.PaymentDetails

class PaymentGateway {
    companion object {
        fun submitPayment(paymentDetails: PaymentDetails): PaymentResult {
            // Implementation of payment submission logic goes here
            // This is just a placeholder
            return PaymentResult(success = true)
        }
    }
}

@Composable
fun PaymentScreen(vm: MainViewModel) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Add other UI components as needed

        Button(
            onClick = { vm.initiatePayment() },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(text = "Initiate Payment")
        }
    }
}

data class PaymentDetails(
    val amount: Double,
    val currency: String,
    val description: String
)

data class PaymentResult(
    val success: Boolean,
    val errorMessage: String? = null
) {
    fun isSuccess(): Boolean {
        return success
    }


        // Specify a different JVM name for the getErrorMessage function
        @JvmName("getErrorMsg")
        fun getErrorMessage(): String? {
            return errorMessage
        }
    }
