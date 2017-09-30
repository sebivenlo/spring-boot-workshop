# spring-boot-workshop
Spring-Boot Workshop by Merve Sahin

## During this workshop you will get to learn how to:
1. bind your Java Models to the client using **Thymeleaf**
2. deal with forms using Rest + make ajax calls
3. enhance security with **Spring Security**
4. deal with HTTP (404) and Server errors
5. bind and query your database using **Spring Data JPA**
6. deal with multiple languages (also number formats)
7. modify Json conversion
8. create integration tests with **MockMvc**

## We will use Netbeans for this workshop.
## Before you get started, please make sure you meet these requirements:

1. Install the following plugin in Netbeans: `NB Spring Boot`
2. In case you do not have postgres, please install the latest version.
3. Create a  database for postgres using the command below in the terminal.  
This works well in linux, in case you have Mac or Windows, open your terminal, navigate to the `bin` folder in your PostgreSQL installation path and execute the command.  
NOTE: make sure to change your username, in case it is not the default `postgres`.      
`createdb -h localhost -p 5432 -U postgres workshop`
4. Now you can pull this workshop. In your Netbeans project go to src/main/resources
   and change username/password in `application.properties` if they differ.
