import java.util.Scanner;

/*
    ESEMPI DI UTILIZZO DELLO SCANNER IN JAVA
    Questo file mostra diversi modi di usare Scanner
    per leggere dati da tastiera.
*/

public class ScannerJavaExamples {

    public static void main(String[] args) {

        // creazione dello Scanner per leggere da tastiera
        Scanner scanner = new Scanner(System.in);

        // ----------------------------------------------------
        // 1. LETTURA DI UNA STRINGA SINGOLA
        // next() legge una sola parola fino allo spazio
        // ----------------------------------------------------
        System.out.print("Inserisci il tuo nome: ");
        String nome = scanner.next();
        System.out.println("Ciao " + nome);

        // ----------------------------------------------------
        // 2. LETTURA DI UNA RIGA INTERA
        // nextLine() legge tutta la riga, inclusi gli spazi
        // ----------------------------------------------------
        scanner.nextLine(); // pulisce il buffer dopo next()
        System.out.print("Inserisci il tuo cognome e un commento: ");
        String riga = scanner.nextLine();
        System.out.println("Hai scritto: " + riga);

        // ----------------------------------------------------
        // 3. LETTURA DI UN INTERO
        // ----------------------------------------------------
        System.out.print("Inserisci la tua età: ");
        int eta = scanner.nextInt();
        System.out.println("Età inserita: " + eta);

        // ----------------------------------------------------
        // 4. LETTURA DI UN DOUBLE
        // ----------------------------------------------------
        System.out.print("Inserisci la tua altezza (es. 1.75): ");
        double altezza = scanner.nextDouble();
        System.out.println("Altezza: " + altezza);

        // ----------------------------------------------------
        // 5. LETTURA DI UN BOOLEAN
        // l'utente deve scrivere true oppure false
        // ----------------------------------------------------
        System.out.print("Sei maggiorenne? true/false: ");
        boolean maggiorenne = scanner.nextBoolean();
        System.out.println("Valore boolean letto: " + maggiorenne);

        // ----------------------------------------------------
        // 6. USO DEL VALORE LETTO IN UN IF
        // ----------------------------------------------------
        if (eta >= 18) {
            System.out.println("Puoi entrare");
        } else {
            System.out.println("Non puoi entrare");
        }

        // ----------------------------------------------------
        // 7. LETTURA DI DUE NUMERI E SOMMA
        // ----------------------------------------------------
        System.out.print("Inserisci il primo numero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Inserisci il secondo numero: ");
        int numero2 = scanner.nextInt();

        int somma = numero1 + numero2;
        System.out.println("La somma è: " + somma);

        // ----------------------------------------------------
        // 8. USO DELLO SCANNER IN UN CICLO
        // ----------------------------------------------------
        System.out.print("Quanti numeri vuoi inserire? ");
        int quantita = scanner.nextInt();

        int totale = 0;

        for (int i = 1; i <= quantita; i++) {
            System.out.print("Inserisci il numero " + i + ": ");
            int numero = scanner.nextInt();
            totale = totale + numero;
        }

        System.out.println("Totale finale: " + totale);

        // ----------------------------------------------------
        // 9. LETTURA DI UN CARATTERE
        // si legge una stringa e si prende il primo carattere
        // ----------------------------------------------------
        System.out.print("Inserisci una lettera: ");
        String testo = scanner.next();
        char lettera = testo.charAt(0);
        System.out.println("La lettera inserita è: " + lettera);

        // ----------------------------------------------------
        // 10. PICCOLO MENU CON SCANNER
        // ----------------------------------------------------
        System.out.println("Scegli un'opzione:");
        System.out.println("1 - Saluta");
        System.out.println("2 - Mostra età");
        System.out.println("3 - Esci");
        System.out.print("Scelta: ");

        int scelta = scanner.nextInt();

        if (scelta == 1) {
            System.out.println("Ciao utente!");
        } else if (scelta == 2) {
            System.out.println("La tua età è: " + eta);
        } else if (scelta == 3) {
            System.out.println("Uscita dal programma");
        } else {
            System.out.println("Scelta non valida");
        }

        // ----------------------------------------------------
        // 11. ATTENZIONE A nextLine() DOPO nextInt()
        // dopo nextInt resta il carattere invio nel buffer
        // ----------------------------------------------------
        scanner.nextLine(); // pulizia del buffer
        System.out.print("Inserisci una frase completa: ");
        String frase = scanner.nextLine();
        System.out.println("Frase inserita: " + frase);

        // ----------------------------------------------------
        // 12. CHIUSURA DELLO SCANNER
        // si chiude alla fine del programma
        // ----------------------------------------------------
        scanner.close();
    }
}
