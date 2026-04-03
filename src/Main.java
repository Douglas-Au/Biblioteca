import static java.lang.System.out;

public class Main {
   public static void main(String[] args) {

       Livro l1 = new Livro("Livro", "Eu", "33");
       out.println(l1.getNome() + " " + l1.getEdicao() + " " + l1.getAutor());

       Usuario U1 = new Usuario("Nome");

       out.println(U1.getNome());

       Biblioteca B1 = new Biblioteca("Biblio");

       out.println(B1.getNome());

       out.println(B1.addUsuario(U1).getNome());



   }
}