package exercicio1;

public class Filme {
    //atributos do filme

    int codigo;
    String nome;
    char genero;

    //construtores
    public Filme (int c, String n, char g) {
        this.codigo = c;
        this.nome = n;
        this.genero = g;
    }

    //getters
    //publicos com retorno
    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public char getGenero() {
        return genero;
    }


    //setters
    //privados sem retorno

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    //toString 
    //retorna os conteúdos dos atributos
    public String toString() {
        return "\n Código do filme: " + this.codigo + "\n" +
            "Nome do Filme: " + this.nome + "\n" +
            "Gênero: " + this.genero + "\n";
    }

}