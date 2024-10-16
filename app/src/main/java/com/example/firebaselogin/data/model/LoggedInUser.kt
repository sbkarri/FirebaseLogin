package com.example.firebaselogin.data.model

/**
 * Data class that captures user information for logged in users retrieved from LoginRepository
 */
data class LoggedInUser(
    val userId: String,
    val displayName: String,
    val orderId: String,
    val rideStatus: String,
    val bookingNumber: String,
    val driverId: String
)