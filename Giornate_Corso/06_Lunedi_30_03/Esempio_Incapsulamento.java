/*
    ESEMPIO DI INCAPSULAMENTO IN JAVA

    Concetto:
    - Gli attributi sono PRIVATE (non accessibili direttamente)
    - Si accede tramite METODI (getter e setter)
*/

import java.util.ArrayList;
import java.util.Scanner;

public class IncapsulamentoExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<Persona> persone = new ArrayList<>();

        boolean continua = true;

        while (continua) {

            System.out.println("\nMENU:");
            System.out.println("1 - Aggiungi persona");
            System.out.println("2 - Stampa persone");
            System.out.println("3 - Modifica età");
            System.out.println("4 - Esci");
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

                System.out.print("Indice persona: ");
                int index = scanner.nextInt();

                if (index >= 0 && index < persone.size()) {

                    System.out.print("Nuova età: ");
                    int nuovaEta = scanner.nextInt();

                    // uso setter (NON accesso diretto)
                    persone.get(index).setEta(nuovaEta);

                } else {
                    System.out.println("Indice non valido");
                }

            } else if (scelta == 4) {

                continua = false;

            } else {
                System.out.println("Scelta non valida");
            }

        }

        scanner.close();
    }


    // ----------------------------------------------------
    // METODO STAMPA
    // ----------------------------------------------------
    public static void stampaPersone(ArrayList<Persona> lista) {

        for (int i = 0; i < lista.size(); i++) {

            Persona p = lista.get(i);

            // uso getter
            System.out.println(i + ") Nome: " + p.getNome() + " - Eta: " + p.getEta());

        }

    }

}


/*
    CLASSE CON INCAPSULAMENTO
*/
class Persona {

    // ----------------------------------------------------
    // ATTRIBUTI PRIVATI
    // ----------------------------------------------------
    private String nome;
    private int eta;


    // ----------------------------------------------------
    // COSTRUTTORE
    // ----------------------------------------------------
    public Persona(String nome, int eta) {
        this.nome = nome;
        this.setEta(eta); // uso setter per controllo
    }


    // ----------------------------------------------------
    // GETTER
    // ----------------------------------------------------
    public String getNome() {
        return nome;
    }

    public int getEta() {
        return eta;
    }


    // ----------------------------------------------------
    // SETTER
    // controllo sui dati
    // ----------------------------------------------------
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEta(int eta) {

        if (eta >= 0) {
            this.eta = eta;
        } else {
            System.out.println("Errore: età non valida");
        }

    }

}
