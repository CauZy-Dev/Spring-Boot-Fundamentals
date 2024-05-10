package curso.cauzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // spring-boot-starter
@RestController //spring-boot-starter-web
public class SalesApplication {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

    public static void main(String[] args) {
        SpringApplication.run(SalesApplication.class, args);
    }
}
