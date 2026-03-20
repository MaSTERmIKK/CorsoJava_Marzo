import java.util.ArrayList;
import java.util.Scanner;

public class GestioneNomi {

    public static void main(String[] args) {

        // Scanner per leggere input da tastiera
        Scanner input = new Scanner(System.in);

        // Creazione della ArrayList per salvare i nomi
        ArrayList<String> nomi = new ArrayList<>();

        // Variabile per la scelta del menu
        int scelta = 0;

        // Variabile per controllare il ciclo
        boolean continua = true;

        // Ciclo WHILE: il programma continua finché l'utente non esce
        while (continua) {

            // Stampa del menu
            System.out.println("\n--- MENU ---");
            System.out.println("1 - Aggiungi nome");
            System.out.println("2 - Visualizza tutti i nomi");
            System.out.println("3 - Cerca nome");
            System.out.println("4 - Rimuovi nome");
            System.out.println("5 - Esci");
            System.out.print("Scelta: ");

            // Lettura della scelta
            scelta = input.nextInt();
            input.nextLine(); // pulizia buffer

            // SWITCH per gestire le opzioni
            switch (scelta) {

                case 1:
                    // AGGIUNTA NOME
                    System.out.print("Inserisci nome: ");
                    String nome = input.nextLine();

                    nomi.add(nome); // aggiunge il nome alla lista
                    System.out.println("Nome aggiunto!");
                    break;

                case 2:
                    // VISUALIZZAZIONE LISTA
                    if (nomi.size() == 0) {
                        System.out.println("Lista vuota");
                    } else {
                        System.out.println("Lista nomi:");
                        
                        // Ciclo FOR per stampare tutti i nomi
                        for (int i = 0; i < nomi.size(); i++) {
                            System.out.println((i + 1) + " - " + nomi.get(i));
                        }
                    }
                    break;

                case 3:
                    // RICERCA NOME
                    System.out.print("Inserisci nome da cercare: ");
                    String cerca = input.nextLine();

                    // contains controlla se il nome è presente
                    if (nomi.contains(cerca)) {
                        System.out.println("Nome trovato");
                    } else {
                        System.out.println("Nome non trovato");
                    }
                    break;

                case 4:
                    // RIMOZIONE NOME
                    System.out.print("Inserisci nome da rimuovere: ");
                    String rimuovi = input.nextLine();

                    if (nomi.contains(rimuovi)) {
                        nomi.remove(rimuovi); // rimuove il nome
                        System.out.println("Nome rimosso");
                    } else {
                        System.out.println("Nome non trovato");
                    }
                    break;

                case 5:
                    // USCITA
                    System.out.println("Arrivederci!");
                    continua = false; // termina il ciclo
                    break;

                default:
                    // Scelta non valida
                    System.out.println("Scelta non valida");
            }
        }

        // Chiusura scanner
        input.close();
    }
}
