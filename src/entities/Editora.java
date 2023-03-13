package entities;

import java.util.List;

public class Editora {
    private String nome;
    private String endereco;
    private List<Livro> livroList;

    public Editora() {
    }

    public Editora(String nome, String endereco, List<Livro> livroList) {
        this.nome = nome;
        this.endereco = endereco;
        this.livroList = livroList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }
}
