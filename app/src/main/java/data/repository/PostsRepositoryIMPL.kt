package data.repository

import data.remote.dto.DataPostDTO
import data.repository.remote.PostsRemoteIMPL

class PostsRepositoryIMPL : PostsRepository {
    override fun getPosts(): List<DataPostDTO> = PostsRemoteIMPL().getPosts()
    override fun getPostInfo(): DataPostDTO = PostsRemoteIMPL().getPostInfo()
}