package samples.controller.functional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscoveryClientController {
	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/discoveryClient/{applicationName}")
	public List<ServiceInstance> discoveryPing(@PathVariable String applicationName){
		return this.discoveryClient.getInstances(applicationName);
	}

	@GetMapping("/my-health-check")
	public ResponseEntity<String> myCustomCheck() {
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
