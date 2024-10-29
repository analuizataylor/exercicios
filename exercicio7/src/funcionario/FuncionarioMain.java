package funcionario;
/*
7) Uma empresa possui um cadastro de funcionários com os seguintes dados: nome, número de horas
trabalhadas no mês e categoria (pode ser O - Operário ou G-gerente). Sabendo-se que essa empresa deseja
informatizar sua folha de pagamento. Faça um programa que:

a) Cadastre os dados dos funcionários. 
O máximo que a empresa suporta são 18 funcionários ativos;
b) Alterar o número de horas trabalhadas de um determinado funcionário;
c) Mostrar todos os dados dos funcionários e seus respectivos salários brutos. Para calcular o salário bruto
adote o valor de R$112,00 para uma hora trabalha + acréscimo da categoria do funcionário. Ver tabela
abaixo:
G - 15%
O - 10%
 */


import java.util.Scanner;

public class FuncionarioMain {

    // scanner declarado como global
    Scanner entrada = new Scanner(System.in);

    public static void main (String[] args) {

        // cria variavel de opcao do menu
        char opcao;

        //instancia o vetor
        FuncionarioVetor empresa = new FuncionarioVetor(18);
        do {
            System.out.println("1. Cadastrar um novo funcionário \n"+
            "2. Alterar horas trabalhadas \n"+
            "3. Mostrar dados dos funcionários \n" +
            "4. Sair do menu");

            opcao = scan.next().charAt(0);
            switch (opcao) {
            
            case '1':
                //metodo
                break;
            
            }
        } while (opcao != 4);

    }

    

    


}
