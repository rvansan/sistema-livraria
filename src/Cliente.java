import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int  id;
    private String nome, email;
    private LocalDate dataNascimento;
    private static List<Cliente> clientes = new ArrayList<>();

    public Cliente(int id, String nome, String email, LocalDate dataNascimento){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public Cliente(){}

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public static List<Cliente> getClientes(){
        return clientes;
    }

    public static void adcionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void exibirClientes(){
        for(Cliente cliente : clientes){
            String mensagem = String.format("%d - %s - %s - %td/%<tm/%<ty", cliente.id, cliente.nome, cliente.email, cliente.dataNascimento);
            System.out.println(mensagem);
        }
    }


}
