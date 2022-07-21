public class Produto implements Reclamado {

    public Produto() {}

    public String receberReclamacao(String mensagem) {
        return "O responsável irá trabalhar na reclamação: " + mensagem;
    }
}
