public class NoSolicitacao {
    int id;
    String descricao;
    String dataHora;
    NoSolicitacao proximo;

    public NoSolicitacao(int id, String descricao, String dataHora) {
        this.id = id;
        this.descricao = descricao;
        this.dataHora = dataHora;
        this.proximo = null;
    }
}
