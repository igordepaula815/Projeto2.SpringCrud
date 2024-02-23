package br.com.projeto2springboot.Projeto2.bo;

import br.com.projeto2springboot.Projeto2.model.Cliente;
import br.com.projeto2springboot.Projeto2.dao.CRUD;
import br.com.projeto2springboot.Projeto2.dao.ClienteDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteBO implements CRUD<Cliente , Long > {

    @Autowired
    private ClienteDao dao;

    @Override
    public Cliente pesquisaPeloId(long id) {
        return dao.pesquisaPeloId(id);
    }

    @Override
    public Cliente pesquisaPeloId(Long aLong) {
        return null;
    }

    @Override
    public List<Cliente> lista() {
        return dao.lista();
    }

    @Override
    public void insere(Cliente cliente) {
        dao.insere(cliente);
    }

    @Override
    public void atualiza(Cliente cliente) {
        dao.atualiza(cliente);

    }

    @Override
    public void remove(Cliente cliente) {
        dao.remove(cliente);
    }

    public void inativa(Cliente cliente) {
        cliente.setAtivo(false);
        dao.atualiza(cliente);

    }

    public void ativa(Cliente cliente) {
        cliente.setAtivo(true);
        dao.atualiza(cliente);
    }


}
