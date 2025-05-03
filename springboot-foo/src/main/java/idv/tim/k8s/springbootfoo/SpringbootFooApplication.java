package idv.tim.k8s.springbootfoo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootFooApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello foo";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFooApplication.class, args);
	}

}
