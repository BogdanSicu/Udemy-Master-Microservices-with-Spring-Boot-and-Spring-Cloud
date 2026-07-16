# Udemy-Master-Microservices-with-Spring-Boot-and-Spring-Cloud

## course link: https://www.udemy.com/course/microservices-with-spring-boot-and-spring-cloud/

## course instructor: Ranga Karanam

### section 3 - Restful Web Services with Spring Boot

NOTE: Spring Boot 4 has changed dependencies a little bit compared to version 3 - Spring Boot 4 is more modular now - you need to be more specific on what you want to bring into your project

- internationalization messages need the default messages.properties, otherwise it will always go to the default message, no matter if there are other messages properties files like messages_fr.properties
  - it also needs Accept-Language header on the request

- swagger is enabled by default if the dependency is added -> it is accessed via {host}/swagger-ui/index.html#/

- to enable Content Negotiation for XML you need the "jackson-dataformat-xml" dependency 
  - it's also needed to specify inside the headers the "Accept" -> application/xml

- Versioning factors to consider:
  - URI pollution
  - Misuse of HTTP Headers
  - Caching 
  - Can we execute the request on the browser?
  - API Documentation
  - Summary: No Perfect Solution
- Another type of versioning is the Spring Boot Versioning - same options !!! Only one enabled at a time - it is global !!! 
  - spring.mvc.apiversion.use.path-segment 
    - you need to add "spring.mvc.apiversion.use.path-segment={position of the version value inside the URI}" inside the application.properties
    - ex: /2.0.0/person-sbi -> the version is on position 0
  - spring.mvc.apiversion.use.query-parameter
    - you need to add spring.mvc.apiversion.use.query-parameter={name of the query parameter} inside the application.properties
    - ex: params: { key: version, value: 1.0.0 }
  - spring.mvc.apiversion.use.header={name of the header parameter} 
    - it is very similar to the *query-parameter* one -> it uses the same code implementation
    - ex: headers: { key: X-API-VERSION, value: 2.0.0 }
  - spring.mvc.apiversion.use.media-type-parameter[application/json]={name of the media-type}
    - it is very similar to *query-parameter* -> it uses the same code implementation
    - ex: headers: { key: Accept, value: application/json;version=2 }


- HATEOAS - Hypermedia as the engine of the application state
  - websites allow you to see *Data* and perform *Actions* using links
- Implementation options:
  - 1.custom format and implementation - difficult to maintain
  - 2.use standard implementations
    - HAL - JSON Hypertext Application Language: simple format that gives consistent and easy way to hyperlink between resources in API
    - Spring HATEOAS: Generate HAL responses with hyperlinks to resources