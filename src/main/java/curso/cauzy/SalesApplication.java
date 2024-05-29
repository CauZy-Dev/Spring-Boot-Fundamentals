package curso.cauzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@ComponentScan( // usado para scannerar pacotes externos
//        basePackageClasses = { "com/outra/biblioteca.exemblo"}
//)
@SpringBootApplication // spring-boot-starter scanney todas as annotation dentro do pacote curso.cauzy
@RestController // Controlador REST : spring-boot-starter-web
public class SalesApplication {

//    @Autowired //chama o factory, instancia a classe : spring-boot-starter
//    @Qualifier("applicationName")
// ou
    @Value("${spring.application.name}")
    private String applicationName; // foi injetado o return no beam por meio da anotação Qualifier

    @GetMapping("/hello")
    public String helloWorld(){
        return applicationName;
    }

    public static void main(String[] args) { // psvm = atalha para a classe main
        SpringApplication.run(SalesApplication.class, args); //inicializa a classe spring boot : spring-boot-starter
    }
}
