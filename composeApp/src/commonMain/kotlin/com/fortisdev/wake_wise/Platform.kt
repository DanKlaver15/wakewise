package com.fortisdev.wake_wise

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform