import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        boolean continuarExibicao = false;

        do{

            System.out.println("Você Gostaria de ver os livros disponíveis?");
            System.out.println("Se SIM, digite 's'");
            System.out.println("Se NÃO, digite 'n'");

            Scanner scanner = new Scanner(System.in);
            String opcao = scanner.next();

            if(opcao.equals("s")) {
                exibirLivros();
                continuarExibicao = true;
            } else if(opcao.equals("n")) {
                System.out.println("***************************");
                System.out.println("Saindo...");
                System.out.println("***************************\n");
                continuarExibicao = false;
            } else {
                System.out.println("***************************");
                System.out.println("Opção Inválida!");
                System.out.println("***************************\n");
                continuarExibicao = true;
            }

        }while(continuarExibicao);
    }

    private static void exibirLivros(){
        System.out.println("***************************");
        System.out.println("Exibindo livros.");

        Livro livro = new Livro();
        livro.id = 1;
        livro.titulo = "titulo";
        livro.estaDisponivel = true;
        livro.dataCadastro = LocalDate.now();
        livro.dataAtualizacao = LocalDate.now();

        System.out.println("***************************\n");
    }
}