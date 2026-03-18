import java.util.Scanner;

public class Bancomat {

    public static void main(String[] args) {

        // Creazione dello scanner per leggere input da tastiera
        Scanner input = new Scanner(System.in);

        // Variabile saldo iniziale
        double saldo = 1000;

        // Variabile per la scelta dell'utente
        int scelta = 0;

        // Variabile booleana per controllare il ciclo while
        boolean continua = true;

        // Ciclo WHILE: continua finché l'utente non decide di uscire
        while (continua) {

            // Stampa del menu
            System.out.println("\n--- BANCOMAT ---");
            System.out.println("1 - Visualizza saldo");
            System.out.println("2 - Preleva");
            System.out.println("3 - Deposita");
            System.out.println("4 - Esci");
            System.out.print("Scelta: ");

            // Lettura della scelta (casting automatico int)
            scelta = input.nextInt();

            // SWITCH per gestire le opzioni
            switch (scelta) {

                case 1:
                    // Visualizzazione saldo
                    System.out.println("Saldo attuale: " + saldo + " euro");
                    break;

                case 2:
                    // Prelievo
                    System.out.print("Inserisci importo da prelevare: ");
                    double prelievo = input.nextDouble();

                    // Controllo fondi sufficienti
                    if (prelievo > saldo) {
                        System.out.println("Fondi insufficienti");
                    } else {
                        saldo = saldo - prelievo; // aggiornamento saldo
                        System.out.println("Prelievo effettuato");
                        System.out.println("Nuovo saldo: " + saldo + " euro");
                    }
                    break;

                case 3:
                    // Deposito
                    System.out.print("Inserisci importo da depositare: ");
                    double deposito = input.nextDouble();

                    saldo = saldo + deposito; // aggiornamento saldo
                    System.out.println("Deposito effettuato");
                    System.out.println("Nuovo saldo: " + saldo + " euro");
                    break;

                case 4:
                    // Uscita dal programma
                    System.out.println("Arrivederci!");
                    continua = false; // interrompe il while
                    break;

                default:
                    // Gestione scelta non valida
                    System.out.println("Scelta non valida");
            }
        }

        // Chiusura scanner (buona pratica)
        input.close();
    }
}
