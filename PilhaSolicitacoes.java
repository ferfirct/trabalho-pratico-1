public class PilhaSolicitacoes {
    private NoSolicitacao topo;

    public PilhaSolicitacoes() {
        this.topo = null;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void adicionarSolicitacao(int id, String descricao, String dataHora) {
        NoSolicitacao novo = new NoSolicitacao(id, descricao, dataHora);
        novo.proximo = topo;
        topo = novo;
        System.out.println("Solicitação adicionada ao histórico!");
    }

    public void removerSolicitacao() {
        if (estaVazia()) {
            System.out.println("Histórico vazio! Não há solicitações para remover.");
        } else {
            System.out.println("Removendo solicitação ID: " + topo.id);
            topo = topo.proximo;
        }
    }

    public void exibirHistorico() {
        if (estaVazia()) {
            System.out.println("Histórico vazio!");
        } else {
            NoSolicitacao atual = topo;
            System.out.println("Histórico de Solicitações:");
            while (atual != null) {
                System.out.println("ID: " + atual.id + ", Descrição: " + atual.descricao + ", Data e Hora: " + atual.dataHora);
                atual = atual.proximo;
            }
        }
    }
}
