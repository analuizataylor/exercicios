package exercicio6;
//número da conta, nome do cliente e saldo.

public class Conta {

    //declaração de objetos
    private int numero;
    private String nome;
    private double saldo;


    //construtores
    public Conta (int num, String n, double s) {
        this.numero = num;
        this.nome = n;
        this.saldo = s; 
    }


    //getters (como se fossem funções pois retornam)
    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public double getSaldo() {
        return saldo;
    }


    //setters (como se fossem procedimentos)
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

    //toString
    public String toString() {
        return "\n Número da conta: " + this.numero + "\n" +
        "Nome do Cliente: " + this.nome + "\n" +
        "Saldo da conta: R$" + saldo + "\n";
    } 
}