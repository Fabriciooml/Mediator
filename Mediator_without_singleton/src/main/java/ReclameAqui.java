public class ReclameAqui {

    private static ReclameAqui instancia = new ReclameAqui();

    private ReclameAqui() {}

    public static ReclameAqui getInstancia() {
        return instancia;
    }

    public String receberReclamacao(Reclamado reclamado, String mensagem) {
        return "O ReclameAqui agradece seu contato.\n" +
                ">>" + reclamado.receberReclamacao(mensagem);
    }


}
