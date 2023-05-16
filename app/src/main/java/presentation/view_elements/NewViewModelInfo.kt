package presentation.view_elements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import domain.models.DomainPosts
import domain.use_cases.GetPostsInfoUseCase


open class NewViewModelInfo : ViewModel() {

    private val _postInfo = MutableLiveData<DomainPosts>()
    val postInfo: LiveData<DomainPosts> = _postInfo

    init {
        getPostInfo()
    }

    private fun getPostInfo() {
        _postInfo.value = GetPostsInfoUseCase().getPostInfo()
    }
}