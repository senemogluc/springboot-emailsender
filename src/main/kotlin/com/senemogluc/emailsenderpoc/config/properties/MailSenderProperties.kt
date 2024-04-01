package com.senemogluc.emailsenderpoc.config.properties

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Profile

@Profile("manual-config")
@ConfigurationProperties(prefix = "mail-sender")
class MailSenderProperties{
    var host: String = ""
    var port: Int = 0
    var username: String = ""
    var password: String = ""
    var auth: Boolean = true
    var starttlsEnable: Boolean = true
}