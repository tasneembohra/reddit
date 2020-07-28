package com.tasneembohra.github.util

import androidx.annotation.MainThread
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel

@MainThread
inline fun <reified T : ViewModel> Fragment.getViewModel(noinline creator: (() -> T)? = null): T {
    val lazy: Lazy<T> = if (creator == null) {
        viewModels()
    } else {
        viewModels { BaseViewModelFactory(creator) }
    }

    return lazy.value
}

@MainThread
inline fun <reified T : ViewModel> Fragment.getActivityViewModel(noinline creator: (() -> T)? = null): T {
    val lazy: Lazy<T> = if (creator == null) {
        activityViewModels()
    } else {
        activityViewModels { BaseViewModelFactory(creator) }
    }

    return lazy.value
}