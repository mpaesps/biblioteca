package entities;

import java.time.LocalDateTime;
import java.util.List;

public class Autor {
    private String nome;
    private LocalDateTime idade;
    private List<Livro> livroList;

    public Autor() {
    }

    public Autor(String nome, LocalDateTime idade, List<Livro> livroList) {
        this.nome = nome;
        this.idade = idade;
        this.livroList = livroList;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDateTime getIdade() {
        return idade;
    }

    public void setIdade(LocalDateTime idade) {
        this.idade = idade;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }
}
