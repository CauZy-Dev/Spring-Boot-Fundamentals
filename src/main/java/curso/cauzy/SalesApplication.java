package curso.cauzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication // spring-boot-starter
@RestController // Controlador REST : spring-boot-starter-web
public class SalesApplication {

    @Autowired //chama o factory, instancia a classe
    @Qualifier("applicationName")
    private String applicationName; // foi injetado o return no beam por meio da anotação Qualifier

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) { // psvm = atalha para a classe main
        SpringApplication.run(SalesApplication.class, args); //inicializa a classe spring boot : spring-boot-starter
    }
}
