package com.mohamadrizki.mysimplecleanarchitecture.data

import com.mohamadrizki.mysimplecleanarchitecture.domain.MessageEntity

interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}