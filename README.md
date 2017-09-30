# Spring-Boot Workshop
_by Merve Sahin_

## During this workshop you will get to learn how to:
- bind your Java Models to the client using **Thymeleaf**
- deal with forms using Rest + make ajax calls
- enhance security with **Spring Security**
- deal with HTTP (404) and Server errors
- bind and query your database using **Spring Data JPA**
- deal with multiple languages (also number formats)
- modify Json conversion
- create integration tests with **MockMvc**

## We will use Netbeans for this workshop.
## Before you get started, please make sure you meet these requirements:

1. Install the following plugin in Netbeans: `NB Spring Boot`
2. In case you do not have postgres, please install the latest version <a href="https://www.postgresql.org/download/">here</a>
3. Create a  database for postgres using the command below.  
This works well in linux, in case you have Mac or Windows, open your terminal, navigate to the `bin` folder in your PostgreSQL installation path and execute the command.  
NOTE: make sure to change your username, in case it is not the default `postgres`.      
`createdb -h localhost -p 5432 -U postgres workshop`
4. Now you can pull this workshop. In your Netbeans project go to src/main/resources
   and change username/password in `application.properties` if they differ.

NOTE: After you run your application for the first time, change your `application.properties` file.
This line will prevent spring from recreating the database each time it is being executed:  
`spring.datasource.initialize=false`
