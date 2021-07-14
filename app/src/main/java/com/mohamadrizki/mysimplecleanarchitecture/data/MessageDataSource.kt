package com.mohamadrizki.mysimplecleanarchitecture.data

import com.mohamadrizki.mysimplecleanarchitecture.domain.MessageEntity

class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String): MessageEntity = MessageEntity("Hello $name! Welcome to Clean Architecture")
}