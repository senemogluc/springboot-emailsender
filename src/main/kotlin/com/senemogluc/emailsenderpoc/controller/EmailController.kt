package com.senemogluc.emailsenderpoc.controller

import com.senemogluc.emailsenderpoc.domain.dto.request.SendEmailRequest
import com.senemogluc.emailsenderpoc.service.EmailService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/email")
class EmailController(private val emailService: EmailService) {

    @PostMapping("/send")
    fun sendMail(request: SendEmailRequest) = emailService.sendMail(request)

    @PostMapping("/send/template")
    fun sendMailWithTemplate(request: SendEmailRequest) = emailService.sendMailWithTemplate(request)
}