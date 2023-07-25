# optimal-growth
Optimal growth project from microservice textbook  
This project encapsulates everything that needs to be known about microservice from the textbook  
<<<<<<< Image >>>>>>

## The Sub-sections 
1. Internalization
2. HATEAOS(Hypermedia as Template Engine )
3. Docker
   * Simple DockerFile for services
   * Multistage Dockerfile
   * Docker-compose for microservice
   * Integration of PostgreSQL with Spring service
   * Maven Integration plugin for Docker
4. Spring Cloud Configuration
    Setting this up using different feature and technologies like docker, environments and maven and spring configuration properties.
    * Using file-system
    * Using git
    * Using Vault
5. Spring Cloud Gateway

## Branches
Each section has different branches named based on chapter and checkpoints and feature name... The branch goes like this
e.g internalization on chapter 3: 
chpt_03-chkpt_05_Internalization

List of branches are 


Contributor:
- Olakunle Balogun

## SERVICES

| S/N | Name                  | Port | Application Name     |
|-----|-----------------------|------|----------------------|
| 1   | configuration-service | 8071 | configserver         |
| 2   | eureka-server         | 8070 | eurekaserver         |
| 3   | license-service       | 8080 | license-service      |
| 4   | organization-service  | 8081 | organization-service |

## Note
Always check the docker-compose file for the service configuration and run the service using docker-compose.


   


