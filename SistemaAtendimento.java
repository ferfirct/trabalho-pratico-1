import java.util.Scanner;

public class SistemaAtendimento {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        PilhaSolicitacoes pilha = new PilhaSolicitacoes();
        FilaClientes fila = new FilaClientes();
        int opcao = 0;

        do {
            System.out.println("\n--- Sistema de Atendimento ao Cliente ---");
            System.out.println("1. Adicionar solicitação ao histórico (Pilha)");
            System.out.println("2. Remover solicitação do histórico (Pilha)");
            System.out.println("3. Exibir histórico de solicitações (Pilha)");
            System.out.println("4. Adicionar cliente à fila");
            System.out.println("5. Atender próximo cliente");
            System.out.println("6. Exibir fila de clientes");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = Integer.parseInt(scanner.nextLine());

                if (opcao == 1) {
                    System.out.print("ID da Solicitação: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Descrição: ");
                    String descricao = scanner.nextLine();
                    System.out.print("Data e Hora: ");
                    String dataHora = scanner.nextLine();
                    pilha.adicionarSolicitacao(id, descricao, dataHora);
                } else if (opcao == 2) {
                    pilha.removerSolicitacao();
                } else if (opcao == 3) {
                    pilha.exibirHistorico();
                } else if (opcao == 4) {
                    System.out.print("Nome do Cliente: ");
                    String nome = scanner.nextLine();
                    System.out.print("Número de Identificação: ");
                    int identificacao = Integer.parseInt(scanner.nextLine());
                    System.out.print("Motivo do Atendimento: ");
                    String motivo = scanner.nextLine();
                    fila.adicionarCliente(nome, identificacao, motivo);
                } else if (opcao == 5) {
                    fila.atenderCliente();
                } else if (opcao == 6) {
                    fila.exibirFila();
                } else if (opcao != 0) {
                    System.out.println("Opção inválida! Tente novamente.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Erro de entrada. Digite apenas números inteiros para as opções e identificações.");
            }
        } while (opcao != 0);

        System.out.println("Sistema encerrado.");
        scanner.close();
    }
}
