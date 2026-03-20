/*
    ESEMPI DI CLASSI E OGGETTI IN JAVA
    Qui introduciamo le basi della programmazione OOP:
    - classe
    - attributi
    - metodi
    - costruttore
    - creazione oggetti
*/

public class ClassiOggettiExample {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. CREAZIONE OGGETTO
        // ----------------------------------------------------
        Persona p1 = new Persona();

        // assegnazione valori
        p1.nome = "Mirko";
        p1.eta = 30;

        // chiamata metodo
        p1.saluta();


        // ----------------------------------------------------
        // 2. CREAZIONE CON COSTRUTTORE
        // ----------------------------------------------------
        Persona p2 = new Persona("Anna", 25);

        p2.saluta();


        // ----------------------------------------------------
        // 3. UTILIZZO METODI CON RETURN
        // ----------------------------------------------------
        int anniMancanti = p2.anniPerPensione();

        System.out.println("Anni alla pensione: " + anniMancanti);


        // ----------------------------------------------------
        // 4. PIÙ OGGETTI
        // ----------------------------------------------------
        Persona p3 = new Persona("Luca", 40);

        p3.saluta();


        // ----------------------------------------------------
        // 5. MODIFICA ATTRIBUTI
        // ----------------------------------------------------
        p3.eta = 41;

        System.out.println("Nuova età: " + p3.eta);


        // ----------------------------------------------------
        // 6. ESEMPIO COMPLETO
        // ----------------------------------------------------
        if (p3.eta > 18) {
            System.out.println(p3.nome + " è maggiorenne");
        }

    }
}


/*
    DEFINIZIONE DELLA CLASSE
*/
class Persona {

    // ----------------------------------------------------
    // 1. ATTRIBUTI (VARIABILI DELLA CLASSE)
    // ----------------------------------------------------
    String nome;
    int eta;


    // ----------------------------------------------------
    // 2. COSTRUTTORE VUOTO
    // ----------------------------------------------------
    Persona() {
        // costruttore senza parametri
    }


    // ----------------------------------------------------
    // 3. COSTRUTTORE CON PARAMETRI
    // ----------------------------------------------------
    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }


    // ----------------------------------------------------
    // 4. METODO
    // ----------------------------------------------------
    void saluta() {
        System.out.println("Ciao, sono " + nome + " e ho " + eta + " anni");
    }


    // ----------------------------------------------------
    // 5. METODO CON RETURN
    // ----------------------------------------------------
    int anniPerPensione() {
        return 67 - eta;
    }

}
