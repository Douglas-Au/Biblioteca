import java.util.*;
import java.time.LocalDateTime;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private Integer id_livro;
    private Integer id_user;
    private HashMap<String, Registro> registros;

    public Usuario addUsuario(Usuario user){
        usuarios.add(user);
        user.setId(id_user++);
        return user;
    }

    public Livro addLivro(Livro livro){
        livros.add(livro);
        livro.setId(id_livro++);
        return livro;
    }

    public Biblioteca(String nome) {
        livros = new ArrayList<>();
        usuarios = new ArrayList<>();
        this.nome = nome;
        id_user = 0;
        id_livro = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public void Acervo(){
        for(Livro liv: livros){
            System.out.printf("Titulo: %s \t Autor: %s \t Edição: %s \t id: %d\n",liv.getNome(),liv.getAutor(),liv.getEdicao(),liv.getId());
        }
    }

    //Ideia cada copia de livro tem um indentificador assim, esses livros através de hash são achados pelo identificador, se pode também saber exatamente a copia que o usuário possui
    //Ideia dois os livros ficam guardados na biblioteca numa espécie de coleção e possívelmente hash assim nessa coleção set podemos guardar o
}
