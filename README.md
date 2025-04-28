# Trabalho Prático 1

## Sistema de Atendimento ao Cliente
Descrição do Projeto
O projeto Sistema de Atendimento ao Cliente é uma aplicação simples implementada em Java que utiliza estruturas de dados como Fila e Pilha para gerenciar o atendimento a clientes e o histórico de solicitações. A aplicação permite que os clientes sejam adicionados a uma fila de atendimento, que pode ser atendida em ordem, e permite adicionar e remover solicitações de um histórico utilizando uma pilha.

## Funcionalidades
### Fila de Clientes:

Adicionar um cliente à fila com informações como nome, identificação e motivo do atendimento.

Atender o próximo cliente da fila, removendo-o da fila.

Exibir a lista de clientes na fila com seus dados.

### Histórico de Solicitações (Pilha):

Adicionar solicitações ao histórico com ID, descrição e data/hora.

Remover a última solicitação do histórico.

Exibir o histórico completo de solicitações.

## Estruturas Utilizadas
Fila: Utilizada para organizar os clientes na ordem de chegada. A fila segue o princípio FIFO (First In, First Out), ou seja, o primeiro cliente a chegar é o primeiro a ser atendido.

Pilha: Utilizada para armazenar o histórico de solicitações. A pilha segue o princípio LIFO (Last In, First Out), ou seja, a última solicitação adicionada é a primeira a ser removida.

## Estrutura de Classes
NoCliente: Representa um cliente na fila com atributos como nome, identificação e motivo do atendimento.

FilaClientes: Gerencia a fila de clientes com operações de adicionar, atender e exibir os clientes.

NoSolicitacao: Representa uma solicitação no histórico com atributos como ID, descrição e data/hora.

PilhaSolicitacoes: Gerencia o histórico de solicitações com operações de adicionar, remover e exibir o histórico.

SistemaAtendimento: Classe principal que contém a interface do sistema, onde o usuário pode interagir com o sistema por meio de um menu de opções.

## Como Usar
Adicionar Solicitação ao Histórico:

Selecione a opção "1" para adicionar uma solicitação. Informe o ID da solicitação, a descrição e a data/hora.

Remover Solicitação do Histórico:

Selecione a opção "2" para remover a última solicitação do histórico.

Exibir Histórico de Solicitações:

Selecione a opção "3" para visualizar todas as solicitações no histórico.

Adicionar Cliente à Fila:

Selecione a opção "4" para adicionar um cliente à fila. Informe o nome, número de identificação e motivo do atendimento.

Atender Próximo Cliente:

Selecione a opção "5" para atender o próximo cliente na fila.

Exibir Fila de Clientes:

Selecione a opção "6" para visualizar todos os clientes na fila.

Sair:

Selecione a opção "0" para encerrar o sistema.
