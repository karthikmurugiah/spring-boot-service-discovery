package samples.controller.functional;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping("/sample/hello")
	public String returnHello() {
		return "Hello Karthik!";
	}

}
