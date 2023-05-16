package presentation.view_elements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import domain.models.DomainPostsList
import domain.use_cases.PostsUseCase

open class ViewModelNews : ViewModel() {

    private val _postList = MutableLiveData<DomainPostsList>()
    val postList: LiveData<DomainPostsList> = _postList

    init {
        getPosts()
    }

    private fun getPosts() {
        _postList.value = PostsUseCase().getPosts()
    }
}