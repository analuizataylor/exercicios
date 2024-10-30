package funcionario;
/*
- declaração de atributos do vetor
- construtores do vetor
- get e set do vetor
- métodos do vetor
 */

public class FuncionarioVetor {
        
    //declaracao de atributos
    private Funcionario[] vetor;
    private int quantidadeVetor;


    //construtor
    public FuncionarioVetor (int tamanho) {
        this.vetor = new Funcionario[tamanho];
        this.quantidadeVetor = 0;
    }


    //get = public + return + this
    public Funcionario getVetor (int indice) {
        return this.vetor[indice];
    }

    //set = public void + this
    public void setVetor (int indice, Funcionario novo) {
        this.vetor[indice] = novo;
    }


    //get = public + return + this
    public int getQuantidadeVetor() {
        return quantidadeVetor;
    }

    //set = public void + this + parametros
    public void setQuantidadeVetor(int novo) {
        this.quantidadeVetor = novo;
    } 


    //cadastrar um novo funcionario
    public boolean cadastrarFuncionario (Funcionario novo) {
        if (this.quantidadeVetor == this.vetor.length) {
            //condição para saber se o arquivo está cheio
            return false;
        } else {
            this.vetor[this.getQuantidadeVetor()] = novo;
            this.quantidadeVetor ++;
            return true;
        }
    }


    //alterar horas trabalhadas de um funcionario
    public boolean alterarHorasFuncionario (String nome, int novasHoras) {

    for (int i = 0; i < this.quantidadeVetor; i++) {
        if (vetor[i].getNome().equalsIgnoreCase(nome)) {
            vetor[i].setHorasTrabalhadas(novasHoras);
            return true;
        }
    } 
    return false;  //retorna false se a posição for inválida   
    }


    //mostrar todos os dados do objeto vetor
    public String toString() {
        String resposta = "";

        for (int i=0; i < this.quantidadeVetor; i++) {
            resposta += (i + 1) + "." + this.vetor[i].toString();
            return resposta;
        }
        return resposta;
    }
}