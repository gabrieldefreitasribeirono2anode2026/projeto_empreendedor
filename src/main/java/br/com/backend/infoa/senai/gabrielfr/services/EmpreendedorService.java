package br.com.backend.infoa.senai.gabrielfr.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.backend.infoa.senai.gabrielfr.Repositories.EmpreendedorRepository;

@Service
//A mesma identificação feita com Entity, aqui será Service para identificar a classe
public class EmpreendedorService {
    
    @Autowired
    //INjeção de depend~encia: Chama a outra classe: Lembre-se:
    //Controller -> chama -> Service -> chama -> Repository -> acessa -> Model
    private EmpreendedorRepository empreendedorRepository;
    //Serviço chama Repositório, lembrando que estou no pasta Service

    
    public Long contar() {
        return empreendedorRepository.count();
        //Acessar esse repositório e count
    }
    //Tudo isso(public long...) é equivalente no banco a uma consulta
    //Métodos de contagem(Equivalente a uma consulta do tipo: select count(*) from empreendedor):
    //integer muito grande = long

}
