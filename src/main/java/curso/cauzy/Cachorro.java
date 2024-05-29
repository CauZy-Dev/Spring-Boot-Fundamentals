package curso.cauzy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) //usada apenas em parametros
@Retention(RetentionPolicy.RUNTIME) // exceutada em tempo de execeução
@Autowired
@Qualifier("cachorro")
public @interface Cachorro {
}
