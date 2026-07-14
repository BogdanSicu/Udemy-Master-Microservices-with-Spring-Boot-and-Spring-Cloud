# Udemy-Master-Microservices-with-Spring-Boot-and-Spring-Cloud

## course link: https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/

## course instructor: Ranga Karanam

### section 3 - Restful Web Services with Spring Boot

NOTE: Spring Boot 4 has changed dependencies a little bit compared to version 3 - Spring Boot 4 is more modular now - you need to be more specific on what you want to bring into your project

- internationalization messages need the default messages.properties, otherwise it will always go to the default message, no matter if there are other messages properties files like messages_fr.properties
- - it also needs Accept-Language header on the request

- swagger is enabled by default if the dependency is added -> it is accessed via {host}/swagger-ui/index.html#/

- to enable Content Negotiation for XML you need the "jackson-dataformat-xml" dependency 
- - it's also needed to specify inside the headers the "Accept" -> application/xml
