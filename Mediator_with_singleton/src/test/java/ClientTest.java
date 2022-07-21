import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClientTest {

    @Test
    void deveReclamarProduto() {
        Cliente cliente = new Cliente();
        Produto produto = Produto.getInstancia();
        assertEquals("O ReclameAqui agradece seu contato.\n" +
                        ">>O responsável irá trabalhar na reclamação: O cashback demora muito pra cair na conta",
                cliente.reclamar(produto, "O cashback demora muito pra cair na conta"));
    }

    @Test
    void deveReclamarEmpresa() {
        Cliente cliente = new Cliente();
        Empresa empresa = Empresa.getInstancia();
        assertEquals("O ReclameAqui agradece seu contato.\n" +
                        ">>A Empresa irá procurar melhorar o serviço da reclamação: Empresa não responde meus emails",
                cliente.reclamar(empresa, "Empresa não responde meus emails"));
    }
}
