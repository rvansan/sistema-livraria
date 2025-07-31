import java.time.LocalDate;

public class Cliente {
    private int  id;
    private String nome, email;
    private LocalDate dataNascimento;

    public Cliente(int id, String nome, String email, LocalDate dataNascimento){
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

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
}
