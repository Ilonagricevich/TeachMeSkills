package domain.use_cases

import data.remote.dto.toDomainPostList
import data.repository.PostsRepositoryIMPL

class PostsUseCase {
    fun getPosts() = PostsRepositoryIMPL().getPosts().toDomainPostList()

}