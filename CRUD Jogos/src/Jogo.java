public class Jogo {
    private int id;
    private String nome;
    private String genero;
    private String plataforma;

    // Construtor
    public Jogo(int id, String nome, String genero, String plataforma) {
        this.id = id;
        this.nome = nome;
        this.genero = genero;
        this.plataforma = plataforma;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    // Método toString para exibir os dados do jogo
    @Override
    public String toString() {
        return "ID: " + id + " | Nome: " + nome + " | Gênero: " + genero + " | Plataforma: " + plataforma;
    }
}