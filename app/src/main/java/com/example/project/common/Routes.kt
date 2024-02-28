package com.example.project.common

sealed class Routes(val route:String){
    object Profile:Routes("profile")
    object Signup:Routes("signup")
    object Login:Routes("login")
    object Services:Routes("services")
    object MyServices:Routes("myservices")
    object Search:Routes("search")
  object Logout:Routes("Logout")
object PaymentGateway:Routes("PaymentGateway")
}