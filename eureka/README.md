This is a sample project to demo Eureka as a service register.
All that this app will do is register itself to Eureka and show the instance details when queried(just to show
how the data from consul looks like).
Applications can query Eureka for the instance information and call the appropriate services

Steps to run this service:
1. Run Eureka Service(eureka-server)
java -jar <path/name of the jar>

2. Run Eureka client service(eureka-client)
java -jar <path/name of the jar>

3. Open Eureka UI to check if the client service is registered
http://<hostname>:8761/

4. Use the discovery service to list the instance information
http://<hostname>:8080/service-instances/eureka-client-service