# carrental-rest-service
RESTful service which provides api to add cars and find the matching cars based on their availabilities.

Technology/API Used : Spring Boot, Jersey, Java17, JUnit 5, Maven

How to Run it:

1. clone the repository (carrental-rest-service) -> git clone https://github.com/modikapil/carrental-rest-service.git

2. GoTo Project (cd carrental-rest-service/) and compile it (mvn clean compile)

3. Run Spring Boot to launch Car Rental Service REST APIs on Embedded Tomcat
   
   mvn spring-boot:run
   
   E.g

   GET - http://localhost:8080/v1/carrental/addCars

   GET - http://localhost:8080/v1/carrental/availableCars/VW/02-03-2024/01-03-2024

Also, you can import this project on Eclipse or any IDE.

--------------------------------------------------------

## Future Plan
 - Add BDD Cucumber acceptance tests.
 - Improve addCars API and make it for admin to add cars.
