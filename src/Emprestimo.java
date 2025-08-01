import java.util.ArrayList;
import java.util.List;

public class Emprestimo {
    private Cliente cliente;
    private Livro livro;
    private static List<Emprestimo> emprestimos = new ArrayList();


    public static void exibirEmprestimos(){
        for(Emprestimo emprestimo : emprestimos){
            System.out.println(String.format("%s : %s", emprestimo.cliente.getNome(), emprestimo.livro.getTitulo()));
        }
    }

    public static List<Emprestimo> getEmprestimos(){
        return emprestimos;
    }

    public static void emprestarLivroCliente(Livro livro, Cliente cliente){
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.cliente = cliente;
        emprestimo.livro = livro;
        emprestimos.add(emprestimo);
        Livro.marcarLivroEmprestado(livro);
    }
}
