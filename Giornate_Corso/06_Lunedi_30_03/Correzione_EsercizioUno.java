import java.util.ArrayList;
import java.util.Scanner;

// Classe Dipendente
class Dipendente {
    String nome;
    double stipendio;
    String dipartimento;

    // Costruttore
    Dipendente(String nome, double stipendio, String dipartimento) {
        this.nome = nome;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }
}

public class Correzione_EsercizioUno {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // ArrayList che contiene gli oggetti Dipendente
        ArrayList<Dipendente> dipendenti = new ArrayList<Dipendente>();

        boolean continua = true;

        while (continua) {

            // Menu
            System.out.println("\n--- MENU DIPENDENTI ---");
            System.out.println("1 - Aggiungi dipendente");
            System.out.println("2 - Visualizza dipendenti");
            System.out.println("3 - Modifica stipendio");
            System.out.println("4 - Elimina dipendente");
            System.out.println("5 - Esci");
            System.out.print("Scelta: ");
            int scelta = scanner.nextInt();
            scanner.nextLine(); // pulizia buffer

            switch (scelta) {

                case 1:
                    // CREATE
                    System.out.print("Inserisci nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Inserisci stipendio: ");
                    double stipendio = scanner.nextDouble();
                    scanner.nextLine(); // pulizia buffer

                    System.out.print("Inserisci dipartimento: ");
                    String dipartimento = scanner.nextLine();

                    Dipendente nuovo = new Dipendente(nome, stipendio, dipartimento);
                    dipendenti.add(nuovo);

                    System.out.println("Dipendente aggiunto con successo.");
                    break;

                case 2:
                    // READ
                    if (dipendenti.size() == 0) {
                        System.out.println("Nessun dipendente presente.");
                    } else {
                        System.out.println("\n--- LISTA DIPENDENTI ---");
                        for (int i = 0; i < dipendenti.size(); i++) {
                            System.out.println((i + 1) + " - Nome: " + dipendenti.get(i).nome
                                    + ", Stipendio: " + dipendenti.get(i).stipendio
                                    + ", Dipartimento: " + dipendenti.get(i).dipartimento);
                        }
                    }
                    break;

                case 3:
                    // UPDATE
                    if (dipendenti.size() == 0) {
                        System.out.println("Nessun dipendente da modificare.");
                    } else {
                        System.out.print("Inserisci il nome del dipendente da modificare: ");
                        String nomeDaModificare = scanner.nextLine();

                        boolean trovato = false;

                        for (int i = 0; i < dipendenti.size(); i++) {
                            if (dipendenti.get(i).nome.equalsIgnoreCase(nomeDaModificare)) {
                                System.out.print("Inserisci il nuovo stipendio: ");
                                double nuovoStipendio = scanner.nextDouble();
                                scanner.nextLine(); // pulizia buffer

                                dipendenti.get(i).stipendio = nuovoStipendio;
                                System.out.println("Stipendio aggiornato.");
                                trovato = true;
                            }
                        }

                        if (trovato == false) {
                            System.out.println("Dipendente non trovato.");
                        }
                    }
                    break;

                case 4:
                    // DELETE
                    if (dipendenti.size() == 0) {
                        System.out.println("Nessun dipendente da eliminare.");
                    } else {
                        System.out.print("Inserisci il nome del dipendente da eliminare: ");
                        String nomeDaEliminare = scanner.nextLine();

                        boolean trovato = false;

                        for (int i = 0; i < dipendenti.size(); i++) {
                            if (dipendenti.get(i).nome.equalsIgnoreCase(nomeDaEliminare)) {
                                dipendenti.remove(i);
                                System.out.println("Dipendente eliminato.");
                                trovato = true;
                                break;
                            }
                        }

                        if (trovato == false) {
                            System.out.println("Dipendente non trovato.");
                        }
                    }
                    break;

                case 5:
                    continua = false;
                    System.out.println("Programma terminato.");
                    break;

                default:
                    System.out.println("Scelta non valida.");
            }
        }

        scanner.close();
    }
}
