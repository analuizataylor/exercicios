package exercicio6;

public class ContaVetor {

    // declaração de atributos

    private Conta[] vetor;
    private int quantidadeVetor;


    // construtor
    public ContaVetor (int tamanho) {
        this.vetor = new Conta[tamanho];
        this.quantidadeVetor = 0;
    }


    //get
    public Conta[] getVetor() {
        return vetor;
    }

    public int getQuantidadeVetor() {
        return quantidadeVetor;
    }


    //set
    public void setVetor(Conta[] vetor) {
        this.vetor = vetor;
    }

    public void setQuantidadeVetor(int quantidadeVetor) {
        this.quantidadeVetor = quantidadeVetor;
    }
    
    
    // cadastrar contas 
    public boolean cadastrarConta (Conta novo) {
        if (this.quantidadeVetor == this.vetor.length) {
            //condição para saber se o arquivo está cheio
            return false;
        } else {
            this.vetor[this.getQuantidadeVetor()] = novo;
            this.quantidadeVetor ++;
            return true;
        }
    }


    // pesquisar se numero da conta existe
    public int pesquisarNumeroConta(int numero) {
        for (int i = 0; i < this.quantidadeVetor; i++) {
            if (this.vetor[i].getNumero() == numero){
                return i;
            }
        }
        return this.quantidadeVetor;
    }


    // procurar nome e vizualiar conta
    public int pesquisarNome(String nome) {
        for (int i = 0; i < this.quantidadeVetor; i++) {
            if (this.vetor[i].getNome().equalsIgnoreCase(nome)) {
                return i;
            }
        }
        return this.quantidadeVetor;
    }
    
    
    // excluir a conta com menor saldo
    public boolean excluirConta (Conta conta){
        if (this.quantidadeVetor == 0){
            return false;
        } else {
            int i = 0;
            while (i < this.quantidadeVetor && this.vetor[i] != conta){
                i++;
            }
            if (i == this.quantidadeVetor){
                return false;
            } else {
                this.vetor[i] = this.vetor[this.quantidadeVetor-1];
                this.quantidadeVetor--;
                return true;
            }
        }
    }

    // toString
    public String toString() {
        String resposta = "";
        for (int i = 0; i < this.quantidadeVetor; i++) {
            resposta += (i + 1) + "." + this.vetor[i].toString();
        }
        return resposta;
    }
}