package ru.mixail_akulov.a52_paging_remote_mediator.di

import androidx.paging.ExperimentalPagingApi
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import ru.mixail_akulov.a52_paging_remote_mediator.data.DefaultLaunchesRepository
import ru.mixail_akulov.a52_paging_remote_mediator.domain.LaunchesRepository

@ExperimentalPagingApi
@Module
@InstallIn(SingletonComponent::class)
interface RepositoriesModule {

    @Binds
    fun bindLaunchesRepository(
        launchesRepository: DefaultLaunchesRepository
    ): LaunchesRepository

}