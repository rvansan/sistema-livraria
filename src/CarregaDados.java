import java.time.LocalDate;

public class CarregaDados {

    public CarregaDados(){
        carregaClientes();
        carregaLivros();
    }

    private void carregaClientes(){
        Cliente cliente1 = new Cliente(1, "Rafael", "rafael@email",LocalDate.of(1981, 12, 8));
        Cliente.adcionarCliente(cliente1);

        Cliente cliente2 = new Cliente(2, "Pam", "pam@email",LocalDate.of(1983, 5, 2));
        Cliente.adcionarCliente(cliente2);
    }

    private void carregaLivros(){
        Autor autor1 = new Autor();
        Livro livro1 = new Livro(1, "nome do livro 1", autor1, true, LocalDate.now(), LocalDate.now());
        Livro.adicionarLivro(livro1);

        Autor autor2 = new Autor();
        Livro livro2 = new Livro(2, "nome do livro 2", autor2, true, LocalDate.now(), LocalDate.now());
        Livro.adicionarLivro(livro2);

        Autor autor3 = new Autor();
        Livro livro3 = new Livro(3, "nome do livro 3", autor3, false, LocalDate.now(), LocalDate.now());
        Livro.adicionarLivro(livro3);

        Autor autor4 = new Autor();
        Livro livro4 = new Livro(4, "nome do livro 4", autor4, true, LocalDate.now(), LocalDate.now());
        Livro.adicionarLivro(livro4);
    }

}
