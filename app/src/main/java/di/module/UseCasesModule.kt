package di.module
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import domain.repositories.PostRepository
import domain.use_cases.GetPostsInfoUseCase
import domain.use_cases.PostsUseCase


@Module
@InstallIn(SingletonComponent::class)
class UseCasesModule {
    @Provides
    fun providePostInfoUseCase(postRepository: PostRepository) =
        GetPostsInfoUseCase(postRepository = postRepository)

    @Provides
    fun providePostsUseCase(postRepository: PostRepository) =
        PostsUseCase(postRepository = postRepository)
}