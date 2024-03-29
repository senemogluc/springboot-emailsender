package com.senemogluc.emailsenderpoc.domain.dto.request

import kotlin.collections.MutableList

data class SendEmailRequest(
    val to: String,
    val cc: MutableList<String>?,
    val subject: String,
    val body: String?
)
