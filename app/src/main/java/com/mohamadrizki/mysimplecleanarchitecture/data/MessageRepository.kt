package com.mohamadrizki.mysimplecleanarchitecture.data

import com.mohamadrizki.mysimplecleanarchitecture.domain.IMessageRepository
import com.mohamadrizki.mysimplecleanarchitecture.domain.MessageEntity

class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String): MessageEntity = messageDataSource.getMessageFromSource(name)
}