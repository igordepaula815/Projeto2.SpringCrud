package br.com.projeto2springboot.Projeto2.dao;

import br.com.projeto2springboot.Projeto2.model.Cliente;

import java.util.List;

public interface CRUD  < T , ID > {                                         // Interface CRUD para operaçoes basicas Criação, Leitura, Atualização e Deleção.

    Cliente pesquisaPeloId(long l);

    T pesquisaPeloId (ID id);                                               // Método para listar todas as entidades:**
    List < T > lista ();                                                    // Método lista
    void insere (T t);
    void atualiza (T t);
    void remove (T t);





}
