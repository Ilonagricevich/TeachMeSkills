package data.repository.remote

import data.remote.dto.DataPostDTO

class PostsRemoteIMPL : PostsRemote {

    override fun getPosts(): List<DataPostDTO> =
        mutableListOf(
            DataPostDTO(
                id = 1,
                title = "Lion",
                description = "A species of predatory mammals, one of five members of the genus Panthera (Panthera),\n" +
                        "            belonging to the subfamily of big cats in the cat family"
            ),
            DataPostDTO(
                id = 2,
                title = "Tiger",
                description = "Predator from the cat family, panther genus, class of mammals"
            ),
            DataPostDTO(
                id = 3,
                title = "Zebra",
                description = "A subgenus of the equine genus, including the species Burchell\\'s zebra, Grevy's zebra"
            ),
            DataPostDTO(
                id = 4,
                title = "Elephant",
                description = "The largest animal living on land"
            ),
            DataPostDTO(
                id = 5,
                title = "Leopard",
                description = "The leopard is a large, beautiful cat with a muscular, flexible body"
            ),
            DataPostDTO(
                id = 6,
                title = "Kangaroo",
                description = "Kangaroo is a marsupial mammal from the kangaroo family"
            ),
            DataPostDTO(
                id = 7,
                title = "Giraffe",
                description = "The giraffe is the tallest animal in the world"
            ),
            DataPostDTO(
                id = 8,
                title = "Bear",
                description = "The bear is the largest predator on earth"
            )

        )

    override fun getPostInfo(): DataPostDTO =
        DataPostDTO(
            id = 1,
            title = "Lion",
            description = "A species of predatory mammals, one of five members of the genus Panthera (Panthera),\n" +
                    "            belonging to the subfamily of big cats in the cat family")
}