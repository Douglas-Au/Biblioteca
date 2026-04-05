import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Usuario {
    private String Nome;
    private Integer id;
    private HashMap<Integer, Livro> emprestimos;

    public Usuario(String nome) {
        Nome = nome;
        emprestimos = new HashMap<>();
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public Livro getEmprestimo(int livro_id){
        Livro emprestimo = emprestimos.get(livro_id);
        if(emprestimo == null){
            System.out.println("emprestimo não encontrado");
        }
        else {
            System.out.println("emprestimo encontrado");
        }
        return emprestimo;
    }

}
