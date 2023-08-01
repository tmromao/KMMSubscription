package com.example.kmmsubscription

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform