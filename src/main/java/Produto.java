public class Produto {
    private static Produto instancia = new Produto();

    private Produto() {}

    public static Produto getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O responsável irá trabalhar na reclamação: " + mensagem;
    }
}
