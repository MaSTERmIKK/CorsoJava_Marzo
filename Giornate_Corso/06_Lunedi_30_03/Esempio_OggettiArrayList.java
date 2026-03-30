/*
    ESEMPIO: OGGETTI DENTRO ARRAYLIST + METODI

    Mostra:
    - creazione classe
    - creazione oggetti
    - ArrayList di oggetti
    - metodi che lavorano sugli oggetti
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOggettiExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList di oggetti Persona
        ArrayList<Persona> persone = new ArrayList<>();

        boolean continua = true;

        while (continua) {

            System.out.println("\nMENU:");
            System.out.println("1 - Aggiungi persona");
            System.out.println("2 - Stampa persone");
            System.out.println("3 - Cerca maggiorenni");
            System.out.println("4 - Eta media");
            System.out.println("5 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer

            if (scelta == 1) {

                System.out.print("Nome: ");
                String nome = scanner.nextLine();

                System.out.print("Eta: ");
                int eta = scanner.nextInt();

                Persona p = new Persona(nome, eta);
                persone.add(p);

            } else if (scelta == 2) {

                stampaPersone(persone);

            } else if (scelta == 3) {

                stampaMaggiorenni(persone);

            } else if (scelta == 4) {

                double media = calcolaMediaEta(persone);
                System.out.println("Eta media: " + media);

            } else if (scelta == 5) {

                continua = false;

            } else {
                System.out.println("Scelta non valida");
            }

        }

        scanner.close();
    }


    // ----------------------------------------------------
    // METODO: stampa tutte le persone
    // ----------------------------------------------------
    public static void stampaPersone(ArrayList<Persona> lista) {

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

    }


    // ----------------------------------------------------
    // METODO: stampa solo maggiorenni
    // ----------------------------------------------------
    public static void stampaMaggiorenni(ArrayList<Persona> lista) {

        for (int i = 0; i < lista.size(); i++) {

            if (lista.get(i).eta >= 18) {
                System.out.println(lista.get(i));
            }

        }

    }


    // ----------------------------------------------------
    // METODO: calcola media età
    // ----------------------------------------------------
    public static double calcolaMediaEta(ArrayList<Persona> lista) {

        if (lista.size() == 0) return 0;

        int somma = 0;

        for (int i = 0; i < lista.size(); i++) {
            somma += lista.get(i).eta;
        }

        return (double) somma / lista.size();
    }

}


/*
    CLASSE PERSONA
*/
class Persona {

    String nome;
    int eta;

    // costruttore
    Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    // metodo toString per stampa facile
    public String toString() {
        return "Nome: " + nome + " - Eta: " + eta;
    }

}
