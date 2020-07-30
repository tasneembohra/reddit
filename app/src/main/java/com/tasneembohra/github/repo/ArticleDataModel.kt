package com.tasneembohra.github.repo

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ArticleDataModel(
    val title:String = "",
    val articleText:String = "",
    val articleHtmlText:String = "",
    val thumbnailUrl:String = ""
) : Parcelable