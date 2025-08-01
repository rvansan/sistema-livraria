import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private boolean estaDisponivel;
    private LocalDate dataCadastro;
    private LocalDate dataAtualizacao;
    private static List<Livro> livros = new ArrayList<>();

    public Livro(int id, String titulo, Autor autor, boolean estaDisponivel, LocalDate dataCadastro, LocalDate dataAtualizacao) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.estaDisponivel = estaDisponivel;
        this.dataCadastro = dataCadastro;
        this.dataAtualizacao = dataAtualizacao;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public boolean isEstaDisponivel() {
        return estaDisponivel;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public LocalDate getDataAtualizacao() {
        return dataAtualizacao;
    }

    public static void adicionarLivro(Livro livro){
        livros.add(livro);
    }

    public static List<Livro> getLivrosDisponiveis(){
        List<Livro> livrosRetorno = new ArrayList<>();
        for(Livro livro : livros){
            if(livro.isEstaDisponivel()) {
                livrosRetorno.add(livro);
            }
        }
        return livrosRetorno;
    }

    public static void exibirLivrosDisponiveis(){
        for (Livro livro : livros){
            if(livro.isEstaDisponivel()) {
                String mensagem = String.format("%d - %s", livro.id, livro.titulo);
                System.out.println(mensagem);
            }
        }
    }

    public static void emprestarLivro(Cliente cliente, int idLivroEscolhido){
        for(Livro livro : livros){
            if(livro.getId() == idLivroEscolhido) {
                livro.estaDisponivel = false;
            }
        }
    }

}
