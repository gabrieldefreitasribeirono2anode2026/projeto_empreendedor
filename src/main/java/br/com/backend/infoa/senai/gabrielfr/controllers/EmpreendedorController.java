package br.com.backend.infoa.senai.gabrielfr.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.backend.infoa.senai.gabrielfr.Models.Empreendedor;
import br.com.backend.infoa.senai.gabrielfr.services.EmpreendedorService;


@RestController
//Indica que a classe onde defino as requisições da aplicações, ou seja,
//definir a classe como controladora
@RequestMapping("/empreendedor")
//Serve para identificar a URN desse controlador
public class EmpreendedorController {
    
    @Autowired 
    private EmpreendedorService empreendedorService;

    //Um método de requisição: Vai chamar o método feito em service
    //nome da requisição: post(insert), get(select), put(update), delete(delete)
    @GetMapping("/contar")
    public Long contar() {
        return empreendedorService.contar();
    }
    //Lembrando que estamos dentro da pasta Controller

    @GetMapping("/listar")
    public List<Empreendedor> listar() {
        return empreendedorService.listar();
    }

    @GetMapping("/buscar/{id}")
    public Empreendedor buscarPorId(@PathVariable Integer id) {
        return empreendedorService.buscarPorId(id);
    }
}
