package data.repository

import data.remote.dto.DataPostDTO

interface PostsRepository {
    fun getPosts(): List<DataPostDTO>
    fun getPostInfo(): DataPostDTO
}