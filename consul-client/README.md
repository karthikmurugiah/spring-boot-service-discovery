This is a sample project to demo consul as a service register.
All that this app will do is register itself to consul and show the instance details when queried(just to show
how the data from consul looks like).
Applications can query consul for the instance information and call the appropriate services

Steps to run this service:
1. Run consul agent
* path/to/consul>consul agent -dev

2. Run this client service
* java -jar <path/name of the jar>

3. Open consul UI to check if the client service is registered
http://localhost:8500/

4. Use the discovery service to list the instance information
http://localhost:8080/discoveryClient/consul-client