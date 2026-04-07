/*
    ESEMPIO DI SINGLETON IN JAVA

    Concetto:
    - Una sola istanza della classe
    - accessibile globalmente
    - costruttore privato

    Uso tipico:
    - configurazioni
    - log
    - manager globali
*/

public class SingletonExample {

    public static void main(String[] args) {

        // NON si può fare:
        // Config c = new Config(); ❌

        // si usa il metodo statico
        Config c1 = Config.getInstance();
        Config c2 = Config.getInstance();

        // verifica: stessa istanza
        if (c1 == c2) {
            System.out.println("Stessa istanza!");
        }

        // uso del singleton
        c1.setNomeApp("MyApp");

        System.out.println("Nome da c2: " + c2.getNomeApp());
    }
}


/*
    CLASSE SINGLETON
*/
class Config {

    // ----------------------------------------------------
    // 1. ISTANZA STATICA
    // ----------------------------------------------------
    private static Config instance;

    // ----------------------------------------------------
    // 2. COSTRUTTORE PRIVATO
    // ----------------------------------------------------
    private Config() {
    }

    // ----------------------------------------------------
    // 3. METODO DI ACCESSO
    // ----------------------------------------------------
    public static Config getInstance() {

        if (instance == null) {
            instance = new Config(); // creazione una sola volta
        }

        return instance;
    }

    // ----------------------------------------------------
    // 4. DATI DEL SINGLETON
    // ----------------------------------------------------
    private String nomeApp;

    public String getNomeApp() {
        return nomeApp;
    }

    public void setNomeApp(String nomeApp) {
        this.nomeApp = nomeApp;
    }

}
