package com.sourav1.androidcomponents

import java.io.Serializable

data class PersonalInfo(
    val firstName: String,
    val lastName: String,
    val bDate: String,
    val country: String
): Serializable
