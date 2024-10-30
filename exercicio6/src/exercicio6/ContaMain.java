package exercicio6;

/*
6) Faça uma aplicação para realizar o cadastro de contas bancárias com as seguintes informações: 
número da conta, nome do cliente e saldo.
O banco permitirá o cadastramento de apenas 15 contas e não pode haver mais
de uma conta com o mesmo número.

Crie o menu de opções a seguir:
1. Cadastrar contas (efetuar pesquisa se o número da conta já existe).
2. Visualizar todas as contas de um determinado cliente (procurar pelo nome).
3. Excluir a conta com menor saldo (supondo a não existência de saldos iguais).
4. Sair


*/

import java.util.Scanner;

public class ContaMain {
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        char opcao;
        ContaVetor banco = new ContaVetor(15);
        
        do {
            System.out.println("Menu:\n" +
                               "1. Cadastrar contas\n" +
                               "2. Visualizar todas as contas de um determinado cliente\n" +
                               "3. Excluir a conta com menor saldo\n" +
                               "4. Sair");

            System.out.println("Insira a sua opção: ");
            opcao = entrada.next().charAt(0);
            entrada.nextLine();

            switch (opcao) {
                case '1':
                    cadastrarContas(banco);
                    break;
                case '2':
                    pesquisarNome(banco);
                    break;
                case '3':
                    excluirConta(banco);
                    break;
                case '4':
                    System.out.println("Você saiu do menu");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != '4');

        entrada.close();
    }

    // MÉTODO CADASTRAR CONTA
    static void cadastrarContas(ContaVetor banco) {
        int numero;
        String nome;
        double saldo;

        System.out.println("Digite o número da conta:");
        numero = entrada.nextInt();
        entrada.nextLine();

        int posicao = banco.pesquisarNumeroConta(numero);

        if (posicao == banco.getQuantidadeVetor()) {
            System.out.print("Digite o nome do cliente: ");
            nome = entrada.nextLine();

            System.out.print("Digite o valor do saldo: ");
            saldo = entrada.nextDouble();
            entrada.nextLine();

            Conta nova = new Conta(numero, nome, saldo);

            if (banco.cadastrarConta(nova)) {
                System.out.println("Conta cadastrada com sucesso.");
            } else {
                System.out.println("Conta não cadastrada. Arquivo cheio.");
            }
        } else {
            System.out.println("Número da conta já existe.");
        }
    }


    // MÉTODO PESQUISAR NOME
    static void pesquisarNome(ContaVetor banco) {
        System.out.print("Digite o nome do cliente para visualizar as contas: ");
        String nome = entrada.nextLine();

        boolean encontrado = false;

        for (int i = 0; i < banco.getQuantidadeVetor(); i++) {
            if (banco.getVetor()[i].getNome().equalsIgnoreCase(nome)) {
                System.out.println(banco.getVetor()[i]);
                encontrado = true;
            } else {
                System.out.println("Cliente não encontrado!");
            }
        }
    }


    // MÉTODO EXCLUIR CONTA
    static void excluirConta(ContaVetor banco) {
        if (banco.getQuantidadeVetor() == 0) {
            System.out.println("Não há contas cadastradas.");
            return;
        }

        int indiceMenor = 0;
        double menorSaldo = banco.getVetor()[0].getSaldo();
        int contadorMenorSaldo = 1;

        for (int i = 1; i < banco.getQuantidadeVetor(); i++) {
            if (banco.getVetor()[i].getSaldo() < menorSaldo) {
                menorSaldo = banco.getVetor()[i].getSaldo();
                indiceMenor = i;
                contadorMenorSaldo = 1; // Resetar contador se encontrar um saldo menor
            } else if (banco.getVetor()[i].getSaldo() == menorSaldo) {
                contadorMenorSaldo++;
            }
        }

        if (contadorMenorSaldo > 1) {
            System.out.println("Existe mais de uma conta com o menor saldo de R$ " + menorSaldo + ". Nenhuma conta será excluída.");
        } else {
            Conta contaParaExcluir = banco.getVetor()[indiceMenor];
            if (banco.excluirConta(contaParaExcluir)) {
                System.out.println("A conta com saldo de R$ " + menorSaldo + " foi excluída com sucesso.");
            } else {
                System.out.println("Operação não realizada. Conta não encontrada.");
            }
        }
    }
}