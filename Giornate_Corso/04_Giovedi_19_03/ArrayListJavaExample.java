import java.util.ArrayList;
import java.util.Scanner;

/*
    ESEMPI DI ARRAYLIST IN JAVA
    ArrayList è una lista dinamica (può crescere e ridursi).
    Non ha dimensione fissa come gli array.
*/

public class ArrayListJavaExample {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. CREAZIONE ARRAYLIST
        // ----------------------------------------------------
        ArrayList<Integer> numeri = new ArrayList<>();


        // ----------------------------------------------------
        // 2. AGGIUNTA ELEMENTI
        // ----------------------------------------------------
        numeri.add(10);
        numeri.add(20);
        numeri.add(30);

        System.out.println("Lista: " + numeri);


        // ----------------------------------------------------
        // 3. ACCESSO AGLI ELEMENTI
        // ----------------------------------------------------
        int primo = numeri.get(0);
        System.out.println("Primo elemento: " + primo);


        // ----------------------------------------------------
        // 4. MODIFICA ELEMENTI
        // ----------------------------------------------------
        numeri.set(1, 99); // cambia il secondo elemento
        System.out.println("Dopo modifica: " + numeri);


        // ----------------------------------------------------
        // 5. DIMENSIONE LISTA
        // ----------------------------------------------------
        System.out.println("Dimensione: " + numeri.size());


        // ----------------------------------------------------
        // 6. CICLO FOR
        // ----------------------------------------------------
        for (int i = 0; i < numeri.size(); i++) {
            System.out.println("Elemento " + i + ": " + numeri.get(i));
        }


        // ----------------------------------------------------
        // 7. RIMOZIONE ELEMENTI
        // ----------------------------------------------------
        numeri.remove(0); // rimuove per indice
        System.out.println("Dopo rimozione: " + numeri);


        // ----------------------------------------------------
        // 8. VERIFICA PRESENZA
        // ----------------------------------------------------
        boolean contiene = numeri.contains(99);
        System.out.println("Contiene 99: " + contiene);


        // ----------------------------------------------------
        // 9. INPUT UTENTE IN ARRAYLIST
        // ----------------------------------------------------
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> listaInput = new ArrayList<>();

        System.out.print("Quanti numeri vuoi inserire? ");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci numero: ");
            int valore = scanner.nextInt();
            listaInput.add(valore);
        }

        System.out.println("Lista inserita: " + listaInput);


        // ----------------------------------------------------
        // 10. TROVARE IL MASSIMO
        // ----------------------------------------------------
        int max = listaInput.get(0);

        for (int i = 1; i < listaInput.size(); i++) {
            if (listaInput.get(i) > max) {
                max = listaInput.get(i);
            }
        }

        System.out.println("Massimo: " + max);


        // ----------------------------------------------------
        // 11. SOMMA DEGLI ELEMENTI
        // ----------------------------------------------------
        int somma = 0;

        for (int i = 0; i < listaInput.size(); i++) {
            somma += listaInput.get(i);
        }

        System.out.println("Somma: " + somma);


        // ----------------------------------------------------
        // 12. ESEMPIO COMPLETO CON WHILE
        // ----------------------------------------------------
        ArrayList<Integer> lista = new ArrayList<>();

        boolean continua = true;

        while (continua) {

            System.out.println("\nMENU:");
            System.out.println("1 - Aggiungi numero");
            System.out.println("2 - Stampa lista");
            System.out.println("3 - Esci");
            System.out.print("Scelta: ");

            int scelta = scanner.nextInt();

            if (scelta == 1) {
                System.out.print("Numero da aggiungere: ");
                int num = scanner.nextInt();
                lista.add(num);
            } else if (scelta == 2) {
                System.out.println("Lista: " + lista);
            } else if (scelta == 3) {
                continua = false;
            } else {
                System.out.println("Scelta non valida");
            }

        }

        scanner.close();
    }

}

