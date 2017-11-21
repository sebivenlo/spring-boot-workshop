# Spring-Boot Workshop
_by Merve Sahin_

## During this workshop you will get to learn how to:
- bind your Java Models to the client using **Thymeleaf**
- deal with forms using Rest + make ajax calls
- enhance security with **Spring Security**
- deal with HTTP (404) and Server errors
- bind and query your database using **Spring Data JPA**
- create integration tests with **MockMvc**

## We will use Netbeans for this workshop.
## Before you get started, please make sure you meet these requirements:

### 1. Install the following plugin in Netbeans: `NB Spring Boot`
### 2. We will use Docker to setup the database.  
   Check whether docker is running:  
```bash
$ docker info
```
   In case it cannot connect to the Docker daemon execute this in **Linux**:   
```bash
$ sudo service docker start
```   
   in **Windows** powershell:    
```bash
restart-service *docker*
```   
   in **MacOS**
```bash
$ docker-machine start
```  
### 3. Build an image from the `Dockerfile` with the following command:    
```bash
$ docker build -t spring-boot-workshop .
```   
### 4. Run docker image:    
```bash
$ docker run -p 5443:5432 spring-boot-workshop
```

