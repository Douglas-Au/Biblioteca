import java.util.List;

public class Livro {
    private String Nome;
    private String Autor;
    private Integer id;
    private Boolean disponivel;
    private List<Copia> copias;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Livro(String nome, String autor) {
        Nome = nome;
        Autor = autor;
        disponivel = true;
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
