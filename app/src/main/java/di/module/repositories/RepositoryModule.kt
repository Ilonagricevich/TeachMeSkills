package di.module.repositories
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import data.repository.PostsRepositoryIMPL
import data.repository.remote.PostsRemote
import domain.repositories.PostRepository

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {


    @Provides
    fun providePostsRepository(postsRemote: PostsRemote): PostRepository =
        PostsRepositoryIMPL(postsRemote = postsRemote)
}