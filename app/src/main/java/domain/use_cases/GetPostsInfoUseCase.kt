package domain.use_cases

import data.remote.dto.toDomainPost
import data.repository.PostsRepositoryIMPL


class GetPostsInfoUseCase {
    fun getPostInfo() = PostsRepositoryIMPL().getPostInfo().toDomainPost()
}