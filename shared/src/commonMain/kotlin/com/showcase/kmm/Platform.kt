package com.showcase.kmm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform