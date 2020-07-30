package com.tasneembohra.github.util

import kotlinx.coroutines.MainScope
import kotlinx.coroutines.launch

fun post(delay: Long = 700, listener: () -> Unit) {
    MainScope().launch {
        kotlinx.coroutines.delay(delay)
        listener.invoke()
    }
}