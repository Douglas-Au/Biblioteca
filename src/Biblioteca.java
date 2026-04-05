import java.util.*;
import java.time.*;

public class Biblioteca {
    private String nome;
    private List<Livro> acervo;
    private HashMap<Integer, Livro> livros;
    private HashMap<Integer, Usuario> pessoas;
    private List<Usuario> usuarios;
    private List<Registro> registros;
    private Integer id_livro;
    private Integer id_user;
    private Integer id_rgistro;

    public Usuario addUsuario(Usuario user){
        usuarios.add(user);
        user.setId(id_user++);
        pessoas.put(user.getId(), user);
        return user;
    }

    public Livro addLivro(Livro livro){
        acervo.add(livro);
        livro.setId(id_livro++);
        livros.put(livro.getId(), livro);
        return livro;
    }

    public Biblioteca(String nome) {
        acervo = new ArrayList<>();
        usuarios = new ArrayList<>();
        registros = new ArrayList<>();
        this.nome = nome;
        id_user = 0;
        id_livro = 0;
        id_rgistro = 0;
        livros = new HashMap<>();
        pessoas = new HashMap<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Livro> getacervo() {
        return acervo;
    }

    public void setacervo(List<Livro> acervo) {
        this.acervo = acervo;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    private int contacervo(String nome_livro){
        int cont = 0;
        for(Livro l: acervo){
            cont += (l.getNome().equals(nome_livro) ) ? 1 : 0;
        }
        return cont;
    }

    public void Acervo(){
        for(Livro liv: acervo){
            System.out.printf("Titulo: %s \t Autor: %s \t Edição: %s \t id: %d\n",liv.getNome(),liv.getAutor(),liv.getEdicao(),liv.getId());
        }
    }

    public void Consulta(String nome_do_livro) {
        for(Livro l: acervo){
            if(l.getNome().equals(nome_do_livro)){
                System.out.println(l.getNome() + " " + l.getAutor() + " " + l.getEdicao() + " " + l.getDisponivel());
            }
        }
    }

    public Boolean Alugar(String nome_livro, Usuario user) {
        Livro escolhido = null;
        if(!usuarios.contains(user)){
            System.out.println("Usuario não cadastrado no sistema");
            return false;
        }
        for(Livro livro: acervo){
            if(livro.getNome().equals(nome_livro) && livro.getDisponivel()) {
                escolhido = livro;
                break;
            }
        }
        if(escolhido == null){
            System.out.println("Não há copia disponível deste livro");
            return false;
        }
        Registro novo_registro = new Registro(escolhido,user,id_rgistro++);
        registros.add(novo_registro);
        escolhido.setDisponivel(false);
        System.out.println("vc tem até " + novo_registro.getPrazo() + " para retornar o livro");
        return true;
    }

    public boolean Devolucao(Usuario user){
        Livro livro = null;
        for(Registro re: registros){
            if( re.getRegistro_usuario().equals(user.getId()) ){
                livro = livros.get(re.getRegistro_livro());
                livro.setDisponivel(true);
                registros.remove(re);
                System.out.println("Livro devolvido com sucesso");
                livro.setDisponivel(true);
                return true;
            }
        }
        System.out.println("Usuário não encontrado");
        return false;
    }

    public Boolean Renovar_emprestimo(Usuario user){
        for(Registro reg: registros){
            if(reg.getRegistro_usuario().equals(user.getId())){
                if(reg.getRenovado() >= 2){
                    System.out.println("Não é possível renovar esse emprestimo");
                    return false;
                }
                reg.setPrazo(reg.getPrazo().plusDays(10));
                reg.setRenovado( reg.getRenovado() + 1);
                System.out.println("Emprestimo renovado com sucesso, vc tem mate o dia " + reg.getPrazo() + " para retornar o livro");
                return true;
            }
        }
        return false;
    }

}
