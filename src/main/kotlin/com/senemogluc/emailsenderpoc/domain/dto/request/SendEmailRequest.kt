package com.senemogluc.emailsenderpoc.domain.dto.request

data class SendEmailRequest(
    val to: String,
    val cc: MutableList<String>?,
    val subject: String,
    val body: String?
)
