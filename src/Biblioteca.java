import java.util.*;

public class Biblioteca {
    private String Nome;
    private List<Livro> Livros;
    private List<Usuario> Usuarios;

    //private Integer Qtd;
    //private Boolean Disponivel;
    //private Integer Id;
    //private List<Livro> Emprestimos;

    public Biblioteca(String nome) {
        Livros = new ArrayList<>();
        Usuarios = new ArrayList<>();
        Nome = nome;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public List<Livro> getLivros() {
        return Livros;
    }

    public void setLivros(List<Livro> livros) {
        Livros = livros;
    }

    public List<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        Usuarios = usuarios;
    }
}
