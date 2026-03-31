/*
    ESEMPIO DI EREDITARIETÀ IN JAVA

    Concetto:
    - Una classe FIGLIA eredita attributi e metodi dalla classe PADRE
    - Si usa la parola chiave: extends
*/

import java.util.ArrayList;

public class EreditarietaExample {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // CREAZIONE OGGETTI DI CLASSI FIGLIE
        // ----------------------------------------------------
        Studente s1 = new Studente("Mirko", 20, 28);
        Lavoratore l1 = new Lavoratore("Anna", 30, 1500);

        // ----------------------------------------------------
        // USO METODI EREDITATI
        // ----------------------------------------------------
        s1.saluta();
        l1.saluta();

        // ----------------------------------------------------
        // METODI SPECIFICI DELLE CLASSI FIGLIE
        // ----------------------------------------------------
        System.out.println("Media studente: " + s1.getMedia());
        System.out.println("Stipendio: " + l1.getStipendio());

        // ----------------------------------------------------
        // ARRAYLIST DI TIPO GENERICO (POLIMORFISMO BASE)
        // ----------------------------------------------------
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(s1); // Studente è una Persona
        lista.add(l1); // Lavoratore è una Persona

        // stampa generale
        for (int i = 0; i < lista.size(); i++) {
            lista.get(i).saluta(); // metodo comune
        }

    }
}


/*
    CLASSE PADRE
*/
class Persona {

    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void saluta() {
        System.out.println("Ciao, sono " + nome + " e ho " + eta + " anni");
    }

    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }
}


/*
    CLASSE FIGLIA: STUDENTE
*/
class Studente extends Persona {

    private int media;

    public Studente(String nome, int eta, int media) {
        super(nome, eta); // richiama costruttore padre
        this.media = media;
    }

    public int getMedia() {
        return media;
    }

}


/*
    CLASSE FIGLIA: LAVORATORE
*/
class Lavoratore extends Persona {

    private int stipendio;

    public Lavoratore(String nome, int eta, int stipendio) {
        super(nome, eta);
        this.stipendio = stipendio;
    }

    public int getStipendio() {
        return stipendio;
    }

}
