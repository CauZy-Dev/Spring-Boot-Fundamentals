package curso.cauzy;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE) //usada apenas em classe
@Retention(RetentionPolicy.RUNTIME) // exceutada em tempo de execeução
@Configuration // arqueivo de configuração, executado quando roda o starer sprong
@Profile("development") // roda no perfil de development
public @interface Development {
}
