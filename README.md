# HelloSimpleRest
Simple Web Application for hosting REST API with Maven, and javax.ws.rs library

This workable example show how to create a basic REST service using Java EE.
The example require an application server to work. 

### Test :
Once deployed into a web server with its respective server hosting URL and port, 
the following REST API (deployed in glassfish without any database connection) could be tested:

    [GET] http://localhost:5191/SimpleRestExample/rest/examples/helloWorld 
    [GET] http://localhost:5191/SimpleRestExample/rest/examples/helloJson
    [POST] http://localhost:5191/SimpleRestExample/rest/examples/helloPost

### Reference :

http://javaee.ch/2016/02/05/restful-web-service-with-java-ee-jax-rs-and-json-beginners-tutorial/