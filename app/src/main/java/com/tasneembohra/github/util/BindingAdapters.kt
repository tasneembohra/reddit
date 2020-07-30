package com.tasneembohra.github.util

import android.os.Build
import android.text.Html
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("bind:visibility")
fun setVisibility(view: View, value: Boolean?) {
    if (value == true) view.visibility = View.VISIBLE
    else view.visibility = View.GONE
}

@BindingAdapter("bind:text")
fun setText(textView:TextView, text:String?) {
    if (text?.isNotEmpty() == true) {
        textView.show()
        textView.text = text
    } else {
        textView.hide()
    }
}

@BindingAdapter("bind:html")
fun setHtmlText(textView:TextView, text:String?) {
    if (text?.isNotEmpty() == true) {
        textView.show()
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            textView.text = Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY)
        } else {
            textView.text = Html.fromHtml(text)
        }
    } else {
        textView.hide()
    }
}

@BindingAdapter("bind:avatar")
fun setAvatar(imageView: ImageView, url: String?) {
    if (url?.isNotEmpty() == true) {
        imageView.show()
        Glide.with(imageView.context)
            .load(url)
            .into(imageView)
    } else {
        imageView.hide()
    }
}