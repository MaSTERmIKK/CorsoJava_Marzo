/*
    ESEMPI DI METODI SPECIALI IN JAVA (oltre costruttore e toString)

    Vediamo:
    - equals() → confronto logico tra oggetti
    - hashCode() → codice hash (usato in collezioni)
    - metodo statico → metodo della classe
    - metodo privato → logica interna
    - metodo finale (final) → non sovrascrivibile
*/

import java.util.ArrayList;

public class MetodiSpecialiExample {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. CONFRONTO TRA OGGETTI (equals)
        // ----------------------------------------------------
        Persona p1 = new Persona("Mirko", 30);
        Persona p2 = new Persona("Mirko", 30);

        // confronto con equals
        if (p1.equals(p2)) {
            System.out.println("Le persone sono uguali");
        } else {
            System.out.println("Le persone sono diverse");
        }


        // ----------------------------------------------------
        // 2. HASHCODE
        // ----------------------------------------------------
        System.out.println("Hash p1: " + p1.hashCode());
        System.out.println("Hash p2: " + p2.hashCode());


        // ----------------------------------------------------
        // 3. METODO STATICO
        // ----------------------------------------------------
        int maggiore = Persona.max(10, 20);
        System.out.println("Maggiore: " + maggiore);


        // ----------------------------------------------------
        // 4. USO IN ARRAYLIST
        // ----------------------------------------------------
        ArrayList<Persona> lista = new ArrayList<>();

        lista.add(p1);

        // contains usa equals()
        if (lista.contains(p2)) {
            System.out.println("Elemento trovato nella lista");
        }


        // ----------------------------------------------------
        // 5. METODO FINAL
        // ----------------------------------------------------
        p1.metodoImportante();

    }
}


/*
    CLASSE
*/
class Persona {

    private String nome;
    private int eta;

    // costruttore
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // ----------------------------------------------------
    // toString (già visto)
    // ----------------------------------------------------
    public String toString() {
        return nome + " - " + eta;
    }

    // ----------------------------------------------------
    // equals() → confronto logico
    // ----------------------------------------------------
    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true; // stesso oggetto
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;

        Persona other = (Persona) obj;

        return this.nome.equals(other.nome) && this.eta == other.eta;
    }

    // ----------------------------------------------------
    // hashCode() → coerente con equals
    // ----------------------------------------------------
    @Override
    public int hashCode() {
        return nome.hashCode() + eta;
    }

    // ----------------------------------------------------
    // METODO STATICO
    // appartiene alla classe, non all'oggetto
    // ----------------------------------------------------
    public static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    // ----------------------------------------------------
    // METODO PRIVATO
    // usato solo internamente
    // ----------------------------------------------------
    private void logInterno() {
        System.out.println("Log interno...");
    }

    // ----------------------------------------------------
    // METODO FINAL
    // non può essere sovrascritto nelle classi figlie
    // ----------------------------------------------------
    public final void metodoImportante() {
        logInterno();
        System.out.println("Metodo importante eseguito");
    }

}
