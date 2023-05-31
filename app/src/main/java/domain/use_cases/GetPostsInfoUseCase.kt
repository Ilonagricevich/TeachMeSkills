package domain.use_cases

import data.remote.dto.toDomainPost
import domain.repositories.PostRepository
import javax.inject.Inject


class GetPostsInfoUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    fun getPostInfo() = postRepository.getPostInfo().toDomainPost()
}