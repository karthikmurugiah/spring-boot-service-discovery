This is a simple project to see how client side load balancing works with Ribbon.
I have used Eureka as the service registry.
A sample server application and a client application.
The client application does nothing but call server application and return its result.

Steps to run this sample:
1. Start Eureka server(ribbon-eureka-server)
* java -jar <path/name of the jar>

2. Start client application(ribbon-server)
* java -jar <path/name of the jar>

3. Start server application(ribbon-client) 
I tried using three instances of the same service to test load balancing feature.
* java -jar <path/name of the jar> --server.port=9090
* java -jar <path/name of the jar> --server.port=9091
* java -jar <path/name of the jar> --server.port=9092
 
4. Verify if all services are registered in Eureka using http://localhost:8761/
 
5. Open a browser and hit the client service using http://localhost:8888/client. If this is repeated several times, we can observe that the response is obtained from different instance each time