public class FilaClientes {
    private NoCliente inicio;
    private NoCliente fim;

    public FilaClientes() {
        this.inicio = null;
        this.fim = null;
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void adicionarCliente(String nome, int identificacao, String motivo) {
        NoCliente novo = new NoCliente(nome, identificacao, motivo);
        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }
        System.out.println("Cliente adicionado à fila!");
    }

    public void atenderCliente() {
        if (estaVazia()) {
            System.out.println("Fila vazia! Não há clientes para atender.");
        } else {
            System.out.println("Atendendo cliente: " + inicio.nome + " (ID: " + inicio.identificacao + ")");
            inicio = inicio.proximo;
            if (inicio == null) {
                fim = null;
            }
        }
    }

    public void exibirFila() {
        if (estaVazia()) {
            System.out.println("Fila vazia!");
        } else {
            NoCliente atual = inicio;
            System.out.println("Fila de Atendimento:");
            while (atual != null) {
                System.out.println("Nome: " + atual.nome + ", ID: " + atual.identificacao + ", Motivo: " + atual.motivo);
                atual = atual.proximo;
            }
        }
    }
}
