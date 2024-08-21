package test.openshift.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MicroservicesApplication {
	@GetMapping("/")
	public String getMessage(){
		return ("Get successful");
	}
	@PostMapping("/input")
	public String getMessage(@PathVariable String name){
		return " post "+name;

	}

	public static void main(String[] args) {
		SpringApplication.run(MicroservicesApplication.class, args);
	}

}
