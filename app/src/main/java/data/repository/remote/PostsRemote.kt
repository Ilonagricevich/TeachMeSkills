package data.repository.remote

import data.remote.dto.DataPostDTO

interface PostsRemote {
    fun getPosts(): List<DataPostDTO>
    fun getPostInfo(): DataPostDTO
}