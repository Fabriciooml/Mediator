public class Empresa implements Reclamado {
    private static Empresa instancia = new Empresa();

    private Empresa() {}

    public static Empresa getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Empresa irá procurar melhorar o serviço da reclamação: " + mensagem;
    }
}
