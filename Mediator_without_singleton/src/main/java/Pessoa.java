public class Pessoa {
    public String reclamar(Reclamado reclamado, String mensagem) {
        return ReclameAqui.getInstancia().receberReclamacao(reclamado, mensagem);
    }
}
