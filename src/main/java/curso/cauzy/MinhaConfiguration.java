package curso.cauzy;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("development") // so roda nesse ambiente;/ perfil
public class MinhaConfiguration {

    @Bean
    public CommandLineRunner executar() { // executa assim que a aplicação inicializa
        return args -> {
            System.out.println("Executando a configuração de desenvolvimennto");
        };
    }

    // foi substituido pelo application.properties
//    @Bean(name = "applicationName")  //crie esse objeto no contexto da aplicação, coneção com banco de dados
//    public String applicationName(){
//        return "Sistema de Vendas";
//    }
}
