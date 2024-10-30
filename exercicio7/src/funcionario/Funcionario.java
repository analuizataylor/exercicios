package funcionario;
/*
- declaração de atributos
- contrutores
- getters
- setters
- toString
 */

public class Funcionario {

    // decLaracao de atributos
    private String nome;
    private int horasTrabalhadas;
    private char categoria;

    
    //contrutores
    public Funcionario (String n, int h, char c) {
        this.nome = n;
        this.horasTrabalhadas = h;
        this.categoria = ' ';
    }


    //getters = leem o valor do atributo
    public String getNome() {
        return this.nome;
    }
    public int getHorasTrabalhadas() {
        return this.horasTrabalhadas;
    }
    public char getCategoria() {
        return this.categoria;
    }


    //setters = alterar valor do atributo
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public double calcularSalario() {

        double salarioBruto = horasTrabalhadas * 112;

        if (this.categoria == 'G') {
            salarioBruto += salarioBruto * 1.15;
        } else if (this.categoria == 'O') {
            salarioBruto += salarioBruto * 1.10;
        }
        return salarioBruto;
    } 


    //toString = mostra os conteúdos dos atributos
    public String toString() {
        return "\n Nome: " + this.nome + "\n" +
            "Horas trabalhadas: " + this.horasTrabalhadas + "\n" +
            "Categoria: " + this.categoria + "\n" +
            "Salario Bruto: R$" + String.format("%.2f", calcularSalario()) + "\n";
    }
}
