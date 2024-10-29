package exercicio1;

/*
- declaração de atributos do vetor
- construtores do vetor
- get e set do vetor
- métodos do vetor
 */


 public class FilmeVetor {

    //atributos privados quando está em um vetor
    private Filme[] vetor;
    private int quantidadeVetor;

    //construtores
    public FilmeVetor (int tamanho) {
        this.vetor = new Filme[tamanho];
        this.quantidadeVetor = 0;
    }

    //getters
    //publicos + atributo(primeiro) + return

    public Filme getVetor (int indice) {
        return this.vetor[indice];
    }

    public int getQuantidadeVetor() {
        return quantidadeVetor;
    }

    //setters
    //publicos + void + 
    public void setVetor (int indice, Filme novo) {
        this.vetor[indice] = novo;
    }

    public void setQuantidadeVetor (int novo) {
        this.quantidadeVetor = novo;
    }


    //incluir filmes no arquivo
    public boolean incluirFilme (Filme novo) {
        if (this.quantidadeVetor == this.vetor.length) {
            //condição para saber se o arquivo está cheio
            return false;
        } else {
            this.vetor[this.getQuantidadeVetor()] = novo;
            this.quantidadeVetor ++;
            return true;
        }
    }

    //procurar filmes pelo genero
    public int procurarGenero(char g, int index) {
        int valor = 0;

        if (this.novo.length != 0){
            for (int i = 0; i < index; i++) {
                if (this.novo[i].getGenero() == g) {
                    valor ++;
                }
            }
            return valor;
        } else {
            return valor;
        }       
    }
}

