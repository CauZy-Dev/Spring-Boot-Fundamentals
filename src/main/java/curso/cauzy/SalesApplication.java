package curso.cauzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // spring-boot-starter
@RestController // Controlador REST : spring-boot-starter-web
public class SalesApplication {

    @GetMapping("/hello")
    public String helloWorld(){
        return "hello world";
    }

    public static void main(String[] args) { // psvm = atalha para a classe main
        SpringApplication.run(SalesApplication.class, args); //inicializa a classe spring boot : spring-boot-starter
    }
}
