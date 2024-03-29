# Spring Boot Kotlin Email Sender POC

This project serves as a Proof of Concept (POC) for sending emails using Spring Boot with Kotlin. It demonstrates how to configure and utilize Spring Boot along with Kotlin to send emails efficiently. Additionally, it integrates Swagger UI for API documentation and testing.

## Features

- **Email Sending**: Demonstrates sending emails using Spring Boot's email functionality.
- **Template Integration**: Includes the integration of email templates for better customization and maintainability.
- **Swagger UI Integration**: Implements Swagger UI for API documentation and testing.
- **Configurability**: Allows configuration of email server settings such as host, port, username, and password through application.properties or environment variables.

## Setup

1. **Clone the Repository**:
```
git clone https://github.com/senemogluc/springboot-emailsender-poc.git
```

2. **About Configuration**:
- Open `application.yml`.
- Modify the properties related to the email server setup according to your SMTP server configuration.

3. **Configuration**:

```yaml
mail:
  host: ${MAIL_SENDER_HOST:smtp.gmail.com} #You may use other e-mail smtp's
  port: ${MAIL_SENDER_PORT:587}
  username: <your_mail>
  password: <your_password>
  properties:
    mail:
      smtp:
        auth: ${MAIL_SENDER_AUTH:true}
        starttls:
          enable: ${MAIL_SENDER_STARTTLS_ENABLE:true}
```

4.  **Request**:

```json
{
  "to": "receiver.mail@gmail.com",
  "cc": ["cc.mail@gmail.com"],
  "subject": "Example subject",
  "body": "Example body"
}
```

5.  **Curl**:

```
curl -X 'POST' \
  'http://localhost:8080/api/email/send?to=receiver.mail%40gmail.com&cc=cc.mail@gmail.com&subject=Example%20subject&body=Example%20body' \
  -H 'accept: */*' \
  -d ''
```
