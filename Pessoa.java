
public class Pessoa {
    private int id;
    private String nome;

    // construtor 
    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        // formata a saida pra ficar igual de banco de dados
        return "ID: " + id + " | Nome: " + nome;
    }
}