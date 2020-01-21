This is a simple project to demonstrate ZUUL as a server side load balancer. 
Server side load balancers replace traditional hardware-based load balancers. 
Since it is software, we have control over what it does and how many instances we need and where.
Zuul uses ribbon to talk to service registry(Eureka) in this case.

Steps to run this sample:
1. Start Eureka server. I used the project located at <link to Eureka server project>
* java -jar <path/name of the jar>

2. Start Zuul server(this project)
* java -jar <path/name of the jar>

3. Start the business service to which zuul has to forward the requests. 
* I used this [eureka-service](https://github.com/karthikmurugiah/spring-boot-service-discovery/tree/master/eureka/eureka-server)
* I tried using three instances of the same service to test load balancing feature.
* java -jar <path/name of the jar> --server.port=8080
* java -jar <path/name of the jar> --server.port=8081
* java -jar <path/name of the jar> --server.port=8082
 
4. Verify if all services are registered in Eureka using http://localhost:8761/
 
5. Open a browser and hit Zuul server using http://[hostname]:[zuulserverport]/[backendServiceId]/[backendServiceURI]
 If this is repeated several times, we can observe that the response is obtained from different instance each time