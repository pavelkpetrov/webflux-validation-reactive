# Validation with reactive validator
## Application allow validate fields with 
  * javax.validation.ConstraintValidator
  * org.springframework.validation.Validator
  * custom reactive validator
   
## Prerequisites
  * installed mongodb and binded to the localhost:27017 
    (to start mongo db in the docker container the ./docker/mongodb.bat or mongodb.sh can be used)
  * jdk 8
  * maven
  
## Run application
mvn spring-boot:run

## Test application
  * curl commands are defined in the webflux-validation.curl.sh
  
  or
  * postman rest collection are defined in the webflux-validation.postman_collection.json 