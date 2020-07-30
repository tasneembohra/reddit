package com.tasneembohra.github.ui.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tasneembohra.github.remote.ErrorState
import com.tasneembohra.github.remote.SuccessState
import com.tasneembohra.github.repo.ArticleDataModel
import com.tasneembohra.github.repo.Repository
import com.tasneembohra.github.util.post
import kotlinx.coroutines.launch

class ArticleViewModel(private val repo:Repository) : ViewModel() {

    private val _errorLiveData = MutableLiveData<Boolean>()
    val errorLiveData:LiveData<Boolean>
    get() = _errorLiveData

    private val _loadingLiveData = MutableLiveData<Boolean>(true)
    val loadingLiveData:LiveData<Boolean>
    get() = _loadingLiveData

    private val _dataLiveData = MutableLiveData<List<ArticleDataModel>>()
    val dataLiveData:LiveData<List<ArticleDataModel>>
    get() = _dataLiveData


    init {
        fetchArticles()
    }

    fun fetchArticles() = viewModelScope.launch {
        _errorLiveData.postValue(false)
        _loadingLiveData.postValue(true)
        val result = repo.fetchArticles()
        post {
            _loadingLiveData.postValue(false)
            if (result is ErrorState)  _errorLiveData.postValue(true)
            if (result is SuccessState) _dataLiveData.postValue(result.data)
        }
    }

    fun getSelectedArticle(position:Int) = dataLiveData.value?.get(position)

}