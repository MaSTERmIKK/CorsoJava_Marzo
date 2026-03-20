import java.util.Scanner;

// Classe Veicolo
class Veicolo {

    // Variabili dell'oggetto
    String marca;
    String modello;
    int anno;
    double prezzo;
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Creazione dell'oggetto veicolo
        Veicolo v = new Veicolo();

        // Variabile per controllare se i dati sono stati inseriti
        boolean inserito = false;

        boolean continua = true;

        // Ciclo menu
        while (continua) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Inserisci dati veicolo");
            System.out.println("2 - Visualizza veicolo");
            System.out.println("3 - Modifica prezzo");
            System.out.println("4 - Verifica età veicolo");
            System.out.println("5 - Esci");
            System.out.print("Scelta: ");

            int scelta = input.nextInt();
            input.nextLine(); // pulizia buffer

            switch (scelta) {

                case 1:
                    inserisciVeicolo(v, input);
                    inserito = true;
                    break;

                case 2:
                    if (inserito) {
                        visualizzaVeicolo(v);
                    } else {
                        System.out.println("Nessun veicolo inserito");
                    }
                    break;

                case 3:
                    if (inserito) {
                        modificaPrezzo(v, input);
                    } else {
                        System.out.println("Nessun veicolo inserito");
                    }
                    break;

                case 4:
                    if (inserito) {
                        verificaEta(v);
                    } else {
                        System.out.println("Nessun veicolo inserito");
                    }
                    break;

                case 5:
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }

        input.close();
    }

    // Funzione per inserire i dati
    public static void inserisciVeicolo(Veicolo v, Scanner input) {

        System.out.print("Marca: ");
        v.marca = input.nextLine();

        System.out.print("Modello: ");
        v.modello = input.nextLine();

        System.out.print("Anno: ");
        v.anno = input.nextInt();

        System.out.print("Prezzo: ");
        v.prezzo = input.nextDouble();

        // Controlli base
        if (v.prezzo <= 0) {
            System.out.println("Prezzo non valido");
        }

        if (v.anno <= 1900) {
            System.out.println("Anno non valido");
        }

        input.nextLine(); // pulizia buffer
    }

    // Funzione per visualizzare
    public static void visualizzaVeicolo(Veicolo v) {

        System.out.println("\n--- VEICOLO ---");
        System.out.println("Marca: " + v.marca);
        System.out.println("Modello: " + v.modello);
        System.out.println("Anno: " + v.anno);
        System.out.println("Prezzo: " + v.prezzo);
    }

    // Funzione per modificare il prezzo
    public static void modificaPrezzo(Veicolo v, Scanner input) {

        System.out.print("Nuovo prezzo: ");
        double nuovoPrezzo = input.nextDouble();

        if (nuovoPrezzo > 0) {
            v.prezzo = nuovoPrezzo;
            System.out.println("Prezzo aggiornato");
        } else {
            System.out.println("Prezzo non valido");
        }
    }

    // Funzione per verificare età
    public static void verificaEta(Veicolo v) {

        int annoCorrente = 2026; // semplificato
        int eta = annoCorrente - v.anno;

        if (eta < 5) {
            System.out.println("Veicolo nuovo");
        } else if (eta <= 15) {
            System.out.println("Veicolo usato");
        } else {
            System.out.println("Veicolo vecchio");
        }
    }
}
