public class CentralReclamacoes {

    private static CentralReclamacoes instancia = new CentralReclamacoes();

    private CentralReclamacoes() {}

    public static CentralReclamacoes getInstancia() {
        return instancia;
    }

    public String receberReclamacao(Reclamado reclamado, String mensagem) {
        return "A CentralAjuda agradece seu contato.\n"+
                "A Secretaria respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + reclamado.receberReclamacao(mensagem);
    }

}
