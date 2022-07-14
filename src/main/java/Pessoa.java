public class Pessoa {
    public String reclamar(Reclamado reclamado, String mensagem) {
        return CentralReclamacoes.getInstancia().receberReclamacao(reclamado, mensagem);
    }
}
