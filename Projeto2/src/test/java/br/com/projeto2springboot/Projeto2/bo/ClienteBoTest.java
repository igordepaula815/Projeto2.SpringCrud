package br.com.projeto2springboot.Projeto2.bo;

import br.com.projeto2springboot.Projeto2.model.Cliente;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;


@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ClienteBoTest {

    private ClienteBO bo;

    public void  insere(){

        Cliente cliente = new Cliente();
        cliente.setNome("João");
    }

}
