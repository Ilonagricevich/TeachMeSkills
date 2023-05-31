package domain.use_cases

import data.remote.dto.toDomainPostList
import data.repository.PostsRepositoryIMPL
import domain.repositories.PostRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PostsUseCase @Inject constructor(
    private val postRepository: PostRepository
) {
    fun getPosts() = postRepository.getPosts().toDomainPostList()

}