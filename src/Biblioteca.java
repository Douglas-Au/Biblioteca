import java.util.*;
import java.time.LocalDateTime;

public class Biblioteca {
    private String nome;
    private List<Livro> livros;
    private List<Usuario> usuarios;
    private Integer id_livro;
    private Integer id_user;
    private Integer id_rgistro;
    private List<Registro> registros;

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
        registros = new ArrayList<>();
        this.nome = nome;
        id_user = 0;
        id_livro = 0;
        id_rgistro = 0;
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

    private int contLivros(String nome_livro){
        int cont = 0;
        for(Livro l: livros){
            cont += (l.getNome().equals(nome_livro) ) ? 1 : 0;
        }
        return cont;
    }

    public void Acervo(){
        for(Livro liv: livros){
            System.out.printf("Titulo: %s \t Autor: %s \t Edição: %s \t id: %d\n",liv.getNome(),liv.getAutor(),liv.getEdicao(),liv.getId());
        }
    }

    public void Consulta(String nome_do_livro) {
        for(Livro l: livros){
            if(l.getNome().equals(nome_do_livro)){
                System.out.println(l.getNome() + " " + l.getAutor() + " " + l.getEdicao() + " " + l.getDisponivel());
            }
        }
    }

    public void Alugar(String nome_livro, Usuario user) {
        Livro escolhido = null;
        for(Livro livro: livros){
            if(livro.getNome().equals(nome_livro) && livro.getDisponivel()) {
                escolhido = livro;
                break;
            }
        }
        if(escolhido == null){
            System.out.println("Não há copia disponível deste livro");

        }
        registros.add(new Registro(escolhido,user,id_rgistro++));
        escolhido.setDisponivel(false);
        System.out.println("vc tem até 10 dias para retornar o livro");
    }

    public void Devolucao(Livro livro, Usuario user){
        registros.removeIf(
                re -> Objects.equals(re.getRegistro_livro(),
                livro.getId()) && Objects.equals(re.getRegistro_usuario(), user.getId())
        );
        livro.setDisponivel(true);
    }

}
