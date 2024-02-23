package br.com.projeto2springboot.Projeto2.dao;

import br.com.projeto2springboot.Projeto2.model.Cliente;
import jakarta.persistence.EntityManager;

import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository                                                                          // Anotação para indicar que a classe é um repositório
public class ClienteDao implements CRUD <Cliente, Long> {                            // Implementa a interface CRUD

@PersistenceContext                                                                  // Anotação para indicar que a classe é um repositório
private EntityManager entityManager;                                                 // Implementa a interface CRUD

    @Override                                                                             // **Método para pesquisa por ID:**
                                                                                          // Este método recebe um ID como parâmetro e retorna a entidade Cliente com esse ID, ou null se não for encontrada.
    public Cliente pesquisaPeloId(long id) {
        return entityManager.find(Cliente.class, id);
    }

    @Override
    public Cliente pesquisaPeloId(Long aLong) {
        return null;
    }

    @Override
    public List<Cliente> lista() {
        return null;
    }


    @Override
    public void insere(Cliente cliente) {
    entityManager.persist(cliente);

    }

    @Override
    public void atualiza(Cliente cliente) {
    entityManager.merge(cliente);

    }

    @Override
    public void remove(Cliente cliente) {
    entityManager.remove(cliente);

    }
}
