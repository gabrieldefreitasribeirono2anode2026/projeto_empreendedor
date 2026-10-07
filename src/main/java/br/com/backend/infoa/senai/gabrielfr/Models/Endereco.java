package br.com.backend.infoa.senai.gabrielfr.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="cep")
    private String cep;

    @Column(name="logradouro")
    private String logradouro;

    @ManyToOne 
    @JoinColumn(name="empreendedor_id")
    private Empreendedor empreendedor;




    public Endereco() {
    }




    public Endereco(Integer id, String cep, String logradouro, Empreendedor empreendedor) {
        this.id = id;
        this.cep = cep;
        this.logradouro = logradouro;
        this.empreendedor = empreendedor;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public Empreendedor getEmpreendedor() {
        return empreendedor;
    }

    public void setEmpreendedor(Empreendedor empreendedor) {
        this.empreendedor = empreendedor;
    }


    







    
}
