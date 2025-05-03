package idv.tim.k8s.springbootbar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringbootBarApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello bar";
    }


    public static void main(String[] args) {
        SpringApplication.run(SpringbootBarApplication.class, args);
    }

}
