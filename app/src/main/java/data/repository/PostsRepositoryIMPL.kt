package data.repository

import data.remote.dto.DataPostDTO
import data.repository.remote.PostsRemote
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class PostsRepositoryIMPL : @Inject constructor(
        private val postsRemote: PostsRemote
) : PostRepository {
    override fun getPosts(): List<DataPostDTO> = PostsRemote.getPosts()
    override fun getPostInfo(): DataPostDTO = PostsRemote.getPostInfo()
}