# Simple Java REST API

Backend by using Java and Spring Boot Framework

## Requirements

To run this program, make sure you have installed Java and Maven on your device.
This web service works by using the rest protocol and utilizes the Spring Boot framework in its implementation.

## How To Run

Run these two commands on the terminal / CMD of your device to run this REST web service.

```sh
mvn compile
```

Run server in localhost:8080
```sh
mvn spring-boot:run
```

The program will receive a request on localhost:8080

# Demo

## Login API

Login API can be accessed from http://localhost:8080/login using POST request with the following arguments:
- username
- password

Currently this API only implemented statically and can only receive 1 username and password as demosntrated here
![Demo-1](/assets/demo1.png)

## Job List API

Login API can be accessed from http://localhost:8080/jobs using GET request
![Demo-2](/assets/demo2.png)

## Job Detail API

Login API can be accessed from http://localhost:8080/job using GET request with a required parameter which is an `id` of the job that will be fetched
![Demo-3](/assets/demo3.png)
