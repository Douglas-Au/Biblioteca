import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void MostrarUsuarios(List<Usuario> usuarios){
        out.print("Usuarios \t Id\n");
        for(Usuario u: usuarios){
            out.printf("%s \t %d\n", u.getNome(), u.getId());
        }
    }
    public static void MostrarLivros(List<Usuario> usuarios) {
        out.print("Usuarios \t Id");
        for (Usuario u : usuarios) {
            out.printf("%s \t %d\n", u.getNome(), u.getId());
        }
    }
    public static void MostrarRegistros(List<Usuario> usuarios){
        out.print("Usuarios \t Id");
        for(Usuario u: usuarios){
            out.printf("%s \t %d\n", u.getNome(), u.getId());
        }
    }
   public static void main(String[] args) {
       Biblioteca B = new Biblioteca("LeLivros");
       out.println(B.getNome());

       B.Acervo();

       for(Usuario u: B.getUsuarios()){
           out.printf("Nome: %s \t id: %d \n", u.getNome(), u.getId());
       }

       Livro l1 = new Livro("Caminho das indias", "Silvio Santos", "67");

       out.printf("Nome do Livro: %s \t Nome do Autor: %s \t Edição: %s \n",l1.getNome(),l1.getAutor(),l1.getEdicao());

       Usuario user = new Usuario("Douglas");

       out.println(user.getNome());

       B.addUsuario(user);

       B.addLivro(l1);

       B.Acervo();

       MostrarUsuarios(B.getUsuarios());


   }
}