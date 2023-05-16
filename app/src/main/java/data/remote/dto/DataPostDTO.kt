package data.remote.dto

import domain.models.DomainPosts
import domain.models.DomainPostsList

data class DataPostDTO(
    val id: Int,
    val title: String? = null,
    val description: String? = null
)

fun DataPostDTO.toDomainPost() =
    DomainPosts(
        id = id,
        title = title,
        description = description
    )

fun List<DataPostDTO>.toDomainPostList() =
    DomainPostsList(
        this.map {
            it.toDomainPost()
        }
    )