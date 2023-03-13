package entities;

import entities.enums.TipoEmprestimo;

import java.util.List;

public class Biblioteca {
    private List<Livro> livroList;
    private List<Editora> editoraList;
    private List<Autor> autorList;

    public Biblioteca() {
    }

    public Biblioteca(List<Livro> livroList, List<Editora> editoraList, List<Autor> autorList) {
        this.livroList = livroList;
        this.editoraList = editoraList;
        this.autorList = autorList;
    }

    public List<Livro> getLivroList() {
        return livroList;
    }

    public void setLivroList(List<Livro> livroList) {
        this.livroList = livroList;
    }

    public List<Editora> getEditoraList() {
        return editoraList;
    }

    public void setEditoraList(List<Editora> editoraList) {
        this.editoraList = editoraList;
    }

    public List<Autor> getAutorList() {
        return autorList;
    }

    public void setAutorList(List<Autor> autorList) {
        this.autorList = autorList;
    }

    public void adicionaLivro(Livro livro) {
        livroList.add(livro);
    }

    public void removeLivro(Livro livro) {
        livroList.remove(livro);
    }

    public void adicionaAutor(Autor autor) {
        autorList.add(autor);
    }

    public void removeAutor(Autor autor) {
        autorList.remove(autor);
    }

    public void adicionaEditora(Editora editora) {
        editoraList.add(editora);
    }

    public void removeEditora(Editora editora) {
        editoraList.remove(editora);
    }

    public String buscarLivro(String titulo) {
        for (Livro l : livroList) {
            if (l.getTitulo().equals(titulo)) {

            }
        }
        return titulo;
    }

    public String buscarAutor(String autor) {
        for (Autor a : autorList) {
            if (a.getNome().equals(autor)) {

            }
        }
        return autor;
    }

    public String buscarEditora(String editora) {
        for (Editora e : editoraList) {
            if (e.getNome().equals(editora)) {
            }
        }
        return editora;
    }

    public void emprestarLivro(Livro livro) {
        if (livro.getQuantidade() > 0) {
            livro.setQuantidade(livro.getQuantidade() - 1);
        }
    }

    public void devolverLivro(Livro livro) {
        livro.setQuantidade(livro.getQuantidade() + 1);
    }

    public String exibirListaLivro(Livro livro) {
        for (Livro l : livroList) {
            return l.getTitulo() + " " + l.getGenero();


        }
        return null;
    }

    public int retornaQtdEmprestimoLivro(TipoEmprestimo tipoEmprestimo) {
        switch (tipoEmprestimo) {
            case NORMAL:
                return 3;
            case ESTUDANTE:
                return 5;
            case PROFESSOR:
                return 10;
            default:
                return 0;
        }
    }

    public void mostrarRelatorioEmprestimo(){
        for (Livro l : livroList){
            if (l.isEmprestado()){
                System.out.println("informações de quem pegou o bagulho");
            }
        }
    }
}
