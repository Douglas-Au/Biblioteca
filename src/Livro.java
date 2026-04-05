public class Livro {
    private String Nome;
    private String Autor;
    private String Edicao;
    private Integer id;

    private Boolean disponivel;
    private Integer id_locatario;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Livro(String nome, String autor, String edicao) {
        Nome = nome;
        Autor = autor;
        Edicao = edicao;
        disponivel = true;
        id_locatario = null;
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

    public Boolean getDisponivel() {
        return disponivel;
    }

    public void setDisponivel(Boolean disponivel) {
        this.disponivel = disponivel;
    }
}
