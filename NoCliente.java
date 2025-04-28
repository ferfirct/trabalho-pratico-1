public class NoCliente {
    String nome;
    int identificacao;
    String motivo;
    NoCliente proximo;

    public NoCliente(String nome, int identificacao, String motivo) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.motivo = motivo;
        this.proximo = null;
    }
}
