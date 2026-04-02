public class Livro {
    private String Nome;
    private String Autor;
    private String Edicao;


    public Livro(String nome, String autor, String edicao) {
        Nome = nome;
        Autor = autor;
        Edicao = edicao;
    }

    public String getEdicao() {
        return Edicao;
    }

    public void setEdicao(String edicao) {
        Edicao = edicao;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }
}
