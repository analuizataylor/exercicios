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
    //public + atributo(primeiro) + get + parametros
    //return + this
    public Filme getVetor (int indice) {
        return this.vetor[indice];
    }

    public int getQuantidadeVetor() {
        return quantidadeVetor;
    }

    //setters
    //publicos + void + set +  parametros
    //this 
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

    //consultar filmes pelo genero
    public int consultarTotalGenero(char g) {
        int contador = 0;

        for (int i = 0; i < quantidadeVetor; i++) {
            //verifica se o gênero do filme corresponde ao gênero procurado
            if (this.vetor[i].getGenero() == g) {
                contador++;
            }
        }
        return contador;
    }

    //excluir filme do vetor, procurando pelo nome
    public boolean excluirFilme (int codigo) {
        if (this.quantidadeVetor == 0) {
            return false;
        } else {
            int i = 0;
            while (i < this.quantidadeVetor && this.vetor[i].getCodigo() != codigo) {
                i++;
            }
            if (i == this.quantidadeVetor) {
                return false;
            } else {
                this.vetor[i] = this.vetor[this.quantidadeVetor - 1];
                this.quantidadeVetor --;
                return true;
            }
        }
    }

    

}


