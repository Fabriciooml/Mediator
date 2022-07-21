public class Empresa implements Reclamado {

    public Empresa() {}

    public String receberReclamacao(String mensagem) {
        return "A Empresa irá procurar melhorar o serviço da reclamação: " + mensagem;
    }
}
