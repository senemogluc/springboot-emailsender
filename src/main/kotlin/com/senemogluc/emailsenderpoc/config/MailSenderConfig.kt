package com.senemogluc.emailsenderpoc.config

import com.senemogluc.emailsenderpoc.config.properties.MailSenderProperties
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.JavaMailSenderImpl
import java.util.Properties


@Configuration
class MailSenderConfig(private val mailSenderProperties: MailSenderProperties) {

    @Bean
    fun javaMailSender(): JavaMailSender {
        val mailSender = JavaMailSenderImpl()
        mailSender.host = mailSenderProperties.host
        mailSender.port = mailSenderProperties.port
        mailSender.username = mailSenderProperties.username
        mailSender.password = mailSenderProperties.password

        configureJavaMailProperties(mailSender.javaMailProperties)
        return mailSender
    }

    private fun configureJavaMailProperties(properties: Properties){
        properties["mail.smtp.auth"] = mailSenderProperties.auth
        properties["mail.smtp.starttls.enable"] = mailSenderProperties.starttlsEnable
    }
}