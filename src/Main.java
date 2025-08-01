import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CarregaDados cd = new CarregaDados();

        Cliente cliente = login();

        if(cliente.getId() > 0) {
            System.out.println("Seja bem vindo, " + cliente.getNome());
            System.out.println("***************************");
            boolean continuarExibicao = false;

            do{
                System.out.println("Você Gostaria de ver os livros disponíveis?");
                System.out.println("Se SIM, digite 's'");
                System.out.println("Se NÃO, digite 'n'");
                Scanner scanner = new Scanner(System.in);
                String opcao = scanner.next();

                if(opcao.equals("s")) {
                    exibirLivros(cliente);
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

            }while (continuarExibicao);
        }
    }

    private static void exibirLivros(Cliente cliente){
        System.out.println("***************************");
        System.out.println("Exibindo livros.");
        Livro.exibirLivrosDisponiveis();

        System.out.println("Escolha o id do livro:");
        Scanner scanner = new Scanner(System.in);
        int idLivroEscolhido = scanner.nextInt();

        Livro livro = Livro.getLivroById(idLivroEscolhido);
        Emprestimo.emprestarLivroCliente(livro, cliente);
        Emprestimo.exibirEmprestimos();


        System.out.println("***************************\n");
    }

    private static Cliente login(){
        System.out.println("*********************************");
        System.out.println("Insira o seu email : ");
        Scanner scanner = new Scanner(System.in);
        String email = scanner.next();

        for (Cliente cliente : Cliente.getClientes()){
            if(cliente.getEmail().equals(email)) {
                System.out.println("Cliente logado!");
                return cliente;
            }
        }
        Cliente cliente = null;
        System.out.println("Usuário inválido!");
        return cliente;
    }
}