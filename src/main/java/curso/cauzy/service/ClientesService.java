package curso.cauzy.service;

import curso.cauzy.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {

//    @Autowired ou usa isso
    private ClienteRepository repository;

    @Autowired // injeta quando chama
    public ClientesService (ClienteRepository clienteRepository) { //injeção de dependencia : delega outra classe para instanciar para vc
        this.repository = clienteRepository;
    }

    public void salverCliente(Object cliente){
        validarCliente(cliente);
        repository.persistir(cliente);
    }

    public void validarCliente(Object cliente){

    }
}
