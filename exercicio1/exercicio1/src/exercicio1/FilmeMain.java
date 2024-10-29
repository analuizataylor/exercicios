package exercicio1;

/*
1) Faça um programa para cadastrar dados de uma locadora de filmes, onde cada registro será composto pelos
seguintes campos: código do filme, título do filme e gênero (A – ação, T – terror, D – drama). O programa
deverá conter as seguintes operações:

a) Incluir filmes no arquivo (vetor).
b) Consultar o total de filmes de um determinado gênero.
c) Excluir um filme do arquivo procurando pelo nome

*/

import java.util.Scanner;

public class FilmeMain {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        char opcao;

        //instancia o vetor
        FilmeVetor locadora = new FilmeVetor(100);

        do {
            System.out.println("1. Incluir um novo filme \n"+
                                "2. Consultar o total de filmes de um determinado gênero \n"+
                                "3. Excluir um filme da locadora pelo nome \n" +
                                "4. Sair do menu");

            System.out.println("Insira a sua opção: ");
            opcao = entrada.next().charAt(0);
            entrada.nextLine();

            switch (opcao) {
                case '1':
                    incluirFilme(locadora);
                    break;
                case '2':
                    consultarTotalGenero(locadora);
                    break;
                case '3':
                    excluirFilme(locadora);
                    break;
                case '4':
                    System.out.println("Você saiu do menu");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
                }
            }   while (opcao != '4');

        entrada.close();
    }

    // MÉTODO INCLUIR FILME
    static void incluirFilme(FilmeVetor filmeVetor) {
        int código;
        String nome;
        char genero;

        System.out.println("Digite o código do filme");
        código = entrada.nextInt();
        entrada.nextLine();

        System.out.println("Digite o nome do filme: ");
        nome = entrada.nextLine();

        System.out.println("Digite o gênero  (A - ação, T - terror, D - drama): ");
        genero = entrada.nextLine().toUpperCase().charAt(0);

        Filme novo = new Filme(código, nome, genero);

        if (filmeVetor.incluirFilme(novo)) {
            System.out.println("Filme adicionado com sucesso!");
        } else {
            System.out.println("Filme não adicionado, arquivo cheio");
        }
    }

    // MÉTODO CONSULTAR TOTAL DE GÊNERO
    static void consultarTotalGenero(FilmeVetor filmeVetor) {
        System.out.println("Digite o gênero para consultar (A – ação, T – terror, D – drama): ");
        char genero = entrada.nextLine().toUpperCase().charAt(0);

        int total = filmeVetor.consultarTotalGenero(genero);
        System.out.println("Total de filmes do gênero " + genero + ": " + total);
    }

    // MÉTODO EXCLUIR FILME
    static void excluirFilme(FilmeVetor filmeVetor) {

    System.out.println("Digite o código do filme que deseja excluir: ");
    int codigo = entrada.nextInt();
    entrada.nextLine(); // limpar o buffer do scanner

    boolean encontrado = false;

    for (int i = 0; i < filmeVetor.getQuantidadeVetor(); i++) {
        if (filmeVetor.getVetor(i).getCodigo() == codigo) {
            // Desloca os elementos para "remover" o filme
            for (int j = i; j < filmeVetor.getQuantidadeVetor() - 1; j++) {
                filmeVetor.setVetor(j, filmeVetor.getVetor(j + 1));
            }

            // atualiza a quantidade de filmes
            filmeVetor.setQuantidadeVetor(filmeVetor.getQuantidadeVetor() - 1);
            encontrado = true;
            System.out.println("Filme excluído com sucesso!");
            break;
        }
    }

    if (!encontrado) {
        System.out.println("Filme não encontrado.");
    }
}
}
