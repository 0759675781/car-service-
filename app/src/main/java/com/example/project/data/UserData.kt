package com.example.project.data

data class UserData(
    var userId: String? = null,
    var name: String? = null,
    var username: String? = null,
    var imageUrl: String? = null,
    var bio: String? = null,
    var following: List<String>? = null,
    var role:List<Roles>? = null,
    var services: List<ServicesData>? = null
)
{
    //convert to map for firebase
    fun toMap() = mapOf(
        "userId" to userId,
        "name" to name,
        "username" to username,
        "imageUrl" to imageUrl,
        "bio" to bio,
        "following" to following,
        "role" to role,
        "services" to services
    )

}