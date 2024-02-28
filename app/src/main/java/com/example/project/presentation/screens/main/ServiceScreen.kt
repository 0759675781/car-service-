import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.project.MainViewModel
import com.example.project.presentation.screens.main.BottomNavigationItem
import com.example.project.presentation.screens.main.BottomNavigationMenu

// Define Car Parking Service data class
data class CarParkingService(
    val name: String,
    val description: String,
    val price: Double
)

// Sample car parking services data
val carParkingServices = listOf(
    CarParkingService("Basic Parking", "Standard parking space", 1000.00),
    CarParkingService("Premium Parking", "Reserved parking space", 600.00),
    CarParkingService("Valet Parking", "Personalized valet service", 300.00)
)

@Composable
fun ServiceScreen(navController: NavController, vm: MainViewModel) {
    Column(modifier = Modifier.fillMaxSize()) {
        Text(text = "Services")

        // Display car parking services
        carParkingServices.forEach { service ->
            Text(text = service.name)
            Text(text = service.description)
            Text(text = "$${service.price}")
            Button(onClick = { vm.addToCart(service) }) {
                Text(text = "Add to Cart")
            }
        }

        // Add a button to initiate payment
        Button(onClick = { vm.initiatePayment() }) {
            Text(text = "Proceed to Payment")
        }

        // Bottom navigation menu
        BottomNavigationMenu(
            selectedItem = BottomNavigationItem.SERVICES,
            navController = navController
        )
    }
}
