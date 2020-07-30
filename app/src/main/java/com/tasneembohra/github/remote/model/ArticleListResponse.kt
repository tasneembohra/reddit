package com.tasneembohra.github.remote.model

import com.google.gson.annotations.SerializedName
import com.tasneembohra.github.remote.IBaseResponse
import com.tasneembohra.github.repo.ArticleDataModel

data class ArticleListResponse(@SerializedName("data") val data:ArticleChildDataResponse?):IBaseResponse<List<ArticleDataModel>> {
    override fun build(): List<ArticleDataModel> {
        return data?.children?.map {
            ArticleDataModel(
                title = it.data?.title?:"",
                articleText = if(it.data?.article?.isNotEmpty() == true) it.data.article else it.data?.url?:"",
                articleHtmlText = it.data?.articleHtml?:"",
                thumbnailUrl = if (it.data?.thumbnail?.isNotEmpty() == true) it.data.thumbnail else it.data?.media?.oembed?.thumbnail?:""
            )
        }?: emptyList()
    }
}

data class ArticleChildDataResponse(@SerializedName("children") val children:List<ChildrenResponse>?)

data class ChildrenResponse(@SerializedName("data") val data:ArticleResponse?)

data class ArticleResponse(
    @SerializedName("title") val title:String,
    @SerializedName("thumbnail") val thumbnail:String?,
    @SerializedName("selftext") val article:String?,
    @SerializedName("selftext_html") val articleHtml:String?,
    @SerializedName("url") val url:String?,
    @SerializedName("media") val media:MediaResponse?
)

data class MediaResponse(@SerializedName("oembed") val oembed:OembedResponse?)


data class OembedResponse(@SerializedName("thumbnail_url") val thumbnail: String?)