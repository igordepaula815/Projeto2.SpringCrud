package br.com.projeto2springboot.Projeto2.model;

import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;


@Entity                                                                // Indica que a classe Cliente é uma entidade JPA.
@Table(name = "cliente")                                               // Define o nome da tabela.
public class Cliente {
    @Id                                                               // Indica que o atributo id e uma chave primária.
    @GeneratedValue (strategy = GenerationType.IDENTITY)              // Indica que o atributo id e auto-incrementado.

    private  long id ;
    @Column(nullable = false , length = 50)                           // Indica que o atributo nome e uma coluna do banco de dados.
    private String nome;
    @Column(length = 11)                                              // Indica que o atributo cpf e uma coluna do banco de dados.
    private String cpf;
    @Enumerated(EnumType.STRING)                                      // Indica que o atributo sexo e uma coluna do banco de dados.
    private Sexo sexo;
    @DateTimeFormat( iso = DateTimeFormat.ISO.DATE)                   // Indica que o atributo datadenascimento e uma coluna do banco de dados.
    @Column(name = "datadenascimento")
    private LocalDate datadenascimento;
    @Column(length = 11)                                              //com tamanho máximo de 11 caracteres.
    private String celular;
    private String telefone;

    private String email;
    private boolean ativo;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDatadenascimento(int i) {
        return datadenascimento;
    }

    public void setDatadenascimento(LocalDate datadenascimento) {
        this.datadenascimento = datadenascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
