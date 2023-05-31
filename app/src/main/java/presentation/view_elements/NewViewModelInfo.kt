package presentation.view_elements

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import domain.models.DomainPostsList
import domain.use_cases.GetPostsInfoUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
    class NewViewModelInfo @Inject constructor(
    private val getPostsInfoUseCase: GetPostsInfoUseCase
) : ViewModel() {

    private val _postInfo = MutableLiveData<DomainPostsList>()
    val postInfo: LiveData<DomainPostsList> = _postInfo

    init {
        getPostInfo()
    }

    private fun getPostInfo() {
        _postInfo.value = getPostsInfoUseCase.getPostInfo()
    }
}