package com.example.newsapp.di

import com.example.newsapp.domain.repository.NewsRepository
import com.example.newsapp.domain.usecases.GetBreakingNewsUseCase
import com.example.newsapp.domain.usecases.SearchNewsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {
    @Provides
    @Singleton
    fun providesGetBreakingNewsUseCase(repository: NewsRepository): GetBreakingNewsUseCase =
        GetBreakingNewsUseCase(repository)

    @Provides
    @Singleton
    fun providesSearchNewsUseCase(repository: NewsRepository): SearchNewsUseCase =
        SearchNewsUseCase(repository)
}