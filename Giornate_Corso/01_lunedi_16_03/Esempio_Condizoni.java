/*
    ESEMPI DI UTILIZZO DEGLI IF IN JAVA
    Questo file mostra diversi modi di utilizzare le condizioni IF
    senza usare oggetti o OOP, solo logica di base.
*/

public class IfJavaExamples {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. IF SEMPLICE
        // Esegue il blocco solo se la condizione è vera
        // ----------------------------------------------------
        int numero = 10;

        if (numero > 5) {
            System.out.println("Il numero è maggiore di 5");
        }


        // ----------------------------------------------------
        // 2. IF - ELSE
        // Se la condizione è falsa viene eseguito l'else
        // ----------------------------------------------------
        int eta = 16;

        if (eta >= 18) {
            System.out.println("Sei maggiorenne");
        } else {
            System.out.println("Sei minorenne");
        }


        // ----------------------------------------------------
        // 3. IF - ELSE IF - ELSE
        // Permette di gestire più condizioni
        // ----------------------------------------------------
        int voto = 75;

        if (voto >= 90) {
            System.out.println("Ottimo");
        } else if (voto >= 70) {
            System.out.println("Buono");
        } else if (voto >= 60) {
            System.out.println("Sufficiente");
        } else {
            System.out.println("Insufficiente");
        }


        // ----------------------------------------------------
        // 4. CONFRONTO TRA DUE VARIABILI
        // ----------------------------------------------------
        int a = 10;
        int b = 20;

        if (a < b) {
            System.out.println("a è minore di b");
        }


        // ----------------------------------------------------
        // 5. UTILIZZO DI OPERATORI LOGICI (AND)
        // La condizione è vera solo se entrambe sono vere
        // ----------------------------------------------------
        int temperatura = 28;
        boolean sole = true;

        if (temperatura > 25 && sole == true) {
            System.out.println("Giornata perfetta per andare al mare");
        }


        // ----------------------------------------------------
        // 6. UTILIZZO DI OPERATORI LOGICI (OR)
        // Basta che una delle condizioni sia vera
        // ----------------------------------------------------
        int soldi = 50;
        boolean invito = false;

        if (soldi > 30 || invito == true) {
            System.out.println("Puoi entrare alla festa");
        }


        // ----------------------------------------------------
        // 7. UTILIZZO DI NOT (!)
        // Inverte il valore booleano
        // ----------------------------------------------------
        boolean negozioAperto = false;

        if (!negozioAperto) {
            System.out.println("Il negozio è chiuso");
        }


        // ----------------------------------------------------
        // 8. IF ANNIDATI (IF DENTRO IF)
        // ----------------------------------------------------
        int energia = 70;
        int livello = 5;

        if (energia > 50) {

            if (livello >= 5) {
                System.out.println("Puoi combattere il boss");
            }

        }


        // ----------------------------------------------------
        // 9. CONTROLLO DI PARI O DISPARI
        // ----------------------------------------------------
        int numeroControllo = 12;

        if (numeroControllo % 2 == 0) {
            System.out.println("Numero pari");
        } else {
            System.out.println("Numero dispari");
        }


        // ----------------------------------------------------
        // 10. UTILIZZO DI UNA VARIABILE BOOLEAN
        // ----------------------------------------------------
        boolean login = true;

        if (login) {
            System.out.println("Accesso consentito");
        } else {
            System.out.println("Accesso negato");
        }


        // ----------------------------------------------------
        // 11. IF CON PIÙ CONDIZIONI
        // ----------------------------------------------------
        int punteggio = 85;
        int vite = 2;

        if (punteggio > 80 && vite > 0) {
            System.out.println("Livello superato");
        } else {
            System.out.println("Riprova il livello");
        }


        // ----------------------------------------------------
        // 12. IF CON STRINGHE
        // ATTENZIONE: si usa .equals() per confrontare le stringhe
        // ----------------------------------------------------
        String comando = "start";

        if (comando.equals("start")) {
            System.out.println("Il gioco inizia");
        } else {
            System.out.println("Comando non valido");
        }

    }
}
