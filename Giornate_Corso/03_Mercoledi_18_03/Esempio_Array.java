import java.util.Scanner;

/*
    ESEMPIO DI ARRAY IN JAVA
    Questo file mostra i principali utilizzi degli array:
    - dichiarazione
    - inizializzazione
    - accesso
    - ciclo
    - input da utente
*/

public class ArrayJavaExample {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. DICHIARAZIONE E CREAZIONE ARRAY
        // ----------------------------------------------------
        int[] numeri = new int[5]; // array di 5 elementi

        // assegnazione manuale
        numeri[0] = 10;
        numeri[1] = 20;
        numeri[2] = 30;
        numeri[3] = 40;
        numeri[4] = 50;

        System.out.println("Primo elemento: " + numeri[0]);


        // ----------------------------------------------------
        // 2. INIZIALIZZAZIONE DIRETTA
        // ----------------------------------------------------
        int[] valori = {1, 2, 3, 4, 5};

        System.out.println("Secondo elemento: " + valori[1]);


        // ----------------------------------------------------
        // 3. LUNGHEZZA ARRAY
        // ----------------------------------------------------
        System.out.println("Lunghezza array: " + valori.length);


        // ----------------------------------------------------
        // 4. CICLO FOR PER STAMPARE ARRAY
        // ----------------------------------------------------
        for (int i = 0; i < valori.length; i++) {
            System.out.println("Elemento " + i + ": " + valori[i]);
        }


        // ----------------------------------------------------
        // 5. SOMMA DEGLI ELEMENTI
        // ----------------------------------------------------
        int somma = 0;

        for (int i = 0; i < valori.length; i++) {
            somma += valori[i];
        }

        System.out.println("Somma: " + somma);


        // ----------------------------------------------------
        // 6. INPUT UTENTE IN ARRAY
        // ----------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        int[] inputArray = new int[3];

        for (int i = 0; i < inputArray.length; i++) {
            System.out.print("Inserisci numero " + i + ": ");
            inputArray[i] = scanner.nextInt();
        }


        // stampa valori inseriti
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println("Hai inserito: " + inputArray[i]);
        }


        // ----------------------------------------------------
        // 7. TROVARE IL MASSIMO
        // ----------------------------------------------------
        int max = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] > max) {
                max = inputArray[i];
            }
        }

        System.out.println("Valore massimo: " + max);


        // ----------------------------------------------------
        // 8. TROVARE IL MINIMO
        // ----------------------------------------------------
        int min = inputArray[0];

        for (int i = 1; i < inputArray.length; i++) {
            if (inputArray[i] < min) {
                min = inputArray[i];
            }
        }

        System.out.println("Valore minimo: " + min);


        // ----------------------------------------------------
        // 9. CERCA UN VALORE
        // ----------------------------------------------------
        System.out.print("Numero da cercare: ");
        int cerca = scanner.nextInt();

        boolean trovato = false;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == cerca) {
                trovato = true;
            }
        }

        if (trovato) {
            System.out.println("Numero trovato!");
        } else {
            System.out.println("Numero NON trovato!");
        }


        // ----------------------------------------------------
        // 10. ESEMPIO COMPLETO
        // ----------------------------------------------------
        int[] esempio = {2, 4, 6, 8};

        for (int i = 0; i < esempio.length; i++) {

            if (esempio[i] % 2 == 0) {
                System.out.println("Pari: " + esempio[i]);
            }

        }

        scanner.close();
    }
}
