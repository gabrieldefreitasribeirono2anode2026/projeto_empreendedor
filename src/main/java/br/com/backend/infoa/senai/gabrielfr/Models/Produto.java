package br.com.backend.infoa.senai.gabrielfr.Models;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="produto")
public class Produto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private Integer id;

    @Column(name="data_fabricacao")
    private LocalDate data_fabricacao;

    @Column(name="preco")
    private Double preco;




    public Produto() {
    }




    public Produto(Integer id, LocalDate data_fabricacao, Double preco) {
        this.id = id;
        this.data_fabricacao = data_fabricacao;
        this.preco = preco;
    }




    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getData_fabricacao() {
        return data_fabricacao;
    }

    public void setData_fabricacao(LocalDate data_fabricacao) {
        this.data_fabricacao = data_fabricacao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    


    
}
