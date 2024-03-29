package com.senemogluc.emailsenderpoc.service

import com.senemogluc.emailsenderpoc.domain.dto.request.SendEmailRequest
import org.springframework.mail.SimpleMailMessage
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.stereotype.Service

@Service
class EmailService(
    private val javaMailSender: JavaMailSender,
    private val template: SimpleMailMessage
) {
    fun sendMail(request: SendEmailRequest){

        val message = SimpleMailMessage()

        message.setTo(request.to)
        message.text = request.body
        message.subject = request.subject

        javaMailSender.send(message)
    }

    fun sendMailWithTemplate(request: SendEmailRequest) {

        val message = SimpleMailMessage(template)
        val text = template.text

        message.text = text!!.format(request.subject)
        message.setTo(request.to)

        javaMailSender.send(message)
    }
}