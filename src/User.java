public class User {

    private static User instance;

    private String nome;
    private int età;

    User(String nome, int età) {
        this.nome = nome;
        this.età = età;
    }

    public static User getInstance() {
        if (instance == null) {
            instance = new User("Mario", 30); // Valori di default
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEtà() {
        return età;
    }

    public void setEtà(int età) {
        this.età = età;
    }

    public void stampaInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Età: " + età);
    }

}