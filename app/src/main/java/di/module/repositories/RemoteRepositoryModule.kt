package di.module.repositories

import data.repository.remote.PostsRemote
import data.repository.remote.PostsRemoteIMPL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class RemoteRepositoryModule {
    @Provides
    fun providePostsRemote(): PostsRemote = PostsRemoteIMPL()
}