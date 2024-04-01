package com.senemogluc.emailsenderpoc.config

import com.senemogluc.emailsenderpoc.config.properties.MailSenderProperties
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@EnableConfigurationProperties(MailSenderProperties::class)
class AppConfig {
}