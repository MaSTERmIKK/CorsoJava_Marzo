/*
    ESEMPIO DI POLIMORFISMO CON METODO AGGIUNTIVO

    Oltre a saluta(), aggiungiamo un metodo polimorfico:
    calcolaValore()
*/

import java.util.ArrayList;

public class PolimorfismoMetodoExample {

    public static void main(String[] args) {

        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(new Studente("Mirko", 20, 28));
        lista.add(new Lavoratore("Anna", 30, 1500));

        // ----------------------------------------------------
        // POLIMORFISMO SU PIÙ METODI
        // ----------------------------------------------------
        for (int i = 0; i < lista.size(); i++) {

            Persona p = lista.get(i);

            p.saluta(); // metodo polimorfico 1

            int valore = p.calcolaValore(); // metodo polimorfico 2
            System.out.println("Valore calcolato: " + valore);

            System.out.println("-------------------");
        }

    }
}


/*
    CLASSE BASE
*/
class Persona {

    protected String nome;
    protected int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public void saluta() {
        System.out.println("Ciao, sono " + nome);
    }

    // metodo polimorfico base
    public int calcolaValore() {
        return eta;
    }

}


/*
    CLASSE FIGLIA: STUDENTE
*/
class Studente extends Persona {

    private int media;

    public Studente(String nome, int eta, int media) {
        super(nome, eta);
        this.media = media;
    }

    @Override
    public void saluta() {
        System.out.println("Sono lo studente " + nome + " con media " + media);
    }

    // override metodo polimorfico
    @Override
    public int calcolaValore() {
        return media * 2; // esempio logica diversa
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

    @Override
    public void saluta() {
        System.out.println("Sono il lavoratore " + nome + " con stipendio " + stipendio);
    }

    // override metodo polimorfico
    @Override
    public int calcolaValore() {
        return stipendio / 10; // logica diversa
    }

}
