import java.util.List;

import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Biblioteca B = new Biblioteca("LeLivros");
        out.println(B.getNome());

        B.Acervo();

        for(Usuario u: B.getUsuarios()){
            out.printf("Nome: %s \t id: %d \n", u.getNome(), u.getId());
        }

        Livro l1 = new Livro("A", "B","1");

        out.printf("Nome do Livro: %s \t Nome do Autor: %s \n",l1.getNome(),l1.getAutor());

        Usuario user = new Usuario("User");

        out.println(user.getNome());

        B.addUsuario(user);
        B.addUsuario(new Usuario("A"));
        B.addUsuario(new Usuario("B"));
        B.addUsuario(new Usuario("C"));
        B.addUsuario(new Usuario("D"));
        B.addUsuario(new Usuario("D"));

        B.addLivro(l1);
        B.addLivro(new Livro("A", "B","1"));
        B.addLivro(new Livro("A", "B","2"));
        B.addLivro(new Livro("A", "B","2"));
        B.addLivro(new Livro("A", "B","3"));

        B.Acervo();

        B.Consulta("A");

        B.Alugar("A", user);

        B.Consulta("A");

        B.Alugar("A", new Usuario("Z"));

        B.Renovar_emprestimo(user);
        B.Renovar_emprestimo(user);
        B.Renovar_emprestimo(user);

        B.Consulta("A");

        //B.Devolucao(user);

        B.Consulta("A");

    }
}
