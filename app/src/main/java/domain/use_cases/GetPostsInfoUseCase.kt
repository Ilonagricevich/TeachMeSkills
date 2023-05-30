package domain.use_cases

import data.remote.dto.toDomainPost
import data.repository.PostsRepositoryIMPL
import domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

class GetPostsInfoUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    fun getPostInfo() = PostsRepositoryIMPL().getPostInfo.toDomainPost()
}