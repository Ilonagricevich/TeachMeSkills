package domain.repositories

import data.remote.dto.DataPostDTO

interface PostRepository {
    fun getPosts(): List<DataPostDTO>
    fun getPostInfo(): DataPostDTO
}