package com.mohamadrizki.mysimplecleanarchitecture.di

import com.mohamadrizki.mysimplecleanarchitecture.data.IMessageDataSource
import com.mohamadrizki.mysimplecleanarchitecture.data.MessageDataSource
import com.mohamadrizki.mysimplecleanarchitecture.data.MessageRepository
import com.mohamadrizki.mysimplecleanarchitecture.domain.IMessageRepository
import com.mohamadrizki.mysimplecleanarchitecture.domain.MessageInteractor
import com.mohamadrizki.mysimplecleanarchitecture.domain.MessageUseCase

object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}