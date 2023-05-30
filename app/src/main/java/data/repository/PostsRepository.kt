package data.repository

import data.remote.dto.DataPostDTO

interface PostsRepository {
    suspend getPosts(): List<DataPostDTO>
    }