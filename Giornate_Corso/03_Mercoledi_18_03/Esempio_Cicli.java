/*
    ESEMPI DI CICLI IN JAVA
    Questo file mostra:
    - for
    - while
    - do-while
    - cicli annidati
    - uso con condizioni e contatori
*/

public class CicliJavaExamples {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. CICLO FOR BASE
        // ----------------------------------------------------
        for (int i = 0; i < 5; i++) {
            System.out.println("For i: " + i);
        }


        // ----------------------------------------------------
        // 2. FOR CON CONDIZIONE PERSONALIZZATA
        // ----------------------------------------------------
        for (int i = 1; i <= 10; i++) {
            System.out.println("Numero: " + i);
        }


        // ----------------------------------------------------
        // 3. FOR CON PASSO DIVERSO
        // ----------------------------------------------------
        for (int i = 0; i <= 10; i += 2) {
            System.out.println("Pari: " + i);
        }


        // ----------------------------------------------------
        // 4. CICLO WHILE
        // Esegue finché la condizione è vera
        // ----------------------------------------------------
        int x = 0;

        while (x < 5) {
            System.out.println("While x: " + x);
            x++;
        }


        // ----------------------------------------------------
        // 5. CICLO DO-WHILE
        // Esegue almeno una volta
        // ----------------------------------------------------
        int y = 0;

        do {
            System.out.println("Do-While y: " + y);
            y++;
        } while (y < 5);


        // ----------------------------------------------------
        // 6. CICLO CON BREAK
        // Interrompe il ciclo
        // ----------------------------------------------------
        for (int i = 0; i < 10; i++) {

            if (i == 5) {
                break; // esce dal ciclo
            }

            System.out.println("Break i: " + i);
        }


        // ----------------------------------------------------
        // 7. CICLO CON CONTINUE
        // Salta un'iterazione
        // ----------------------------------------------------
        for (int i = 0; i < 5; i++) {

            if (i == 2) {
                continue; // salta il 2
            }

            System.out.println("Continue i: " + i);
        }


        // ----------------------------------------------------
        // 8. CICLI ANNIDATI
        // ----------------------------------------------------
        for (int i = 1; i <= 3; i++) {

            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + " j: " + j);
            }

        }


        // ----------------------------------------------------
        // 9. SOMMA CON CICLO
        // ----------------------------------------------------
        int somma = 0;

        for (int i = 1; i <= 5; i++) {
            somma = somma + i;
        }

        System.out.println("Somma totale: " + somma);


        // ----------------------------------------------------
        // 10. CONTROLLO CON IF DENTRO CICLO
        // ----------------------------------------------------
        for (int i = 1; i <= 10; i++) {

            if (i % 2 == 0) {
                System.out.println("Numero pari: " + i);
            }

        }


        // ----------------------------------------------------
        // 11. CICLO INFINITO (ATTENZIONE)
        // ----------------------------------------------------
        /*
        while (true) {
            System.out.println("Loop infinito");
        }
        */


        // ----------------------------------------------------
        // 12. ESEMPIO COMPLETO
        // ----------------------------------------------------
        int contatore = 0;

        while (contatore < 10) {

            if (contatore % 2 == 0) {
                System.out.println("Pari: " + contatore);
            } else {
                System.out.println("Dispari: " + contatore);
            }

            contatore++;
        }

    }
}
