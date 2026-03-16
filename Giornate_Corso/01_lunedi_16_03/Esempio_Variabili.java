/*
    ESEMPI DI UTILIZZO DELLE VARIABILI IN JAVA
    Questo file mostra diversi modi di utilizzare le variabili
    senza usare oggetti o programmazione OOP avanzata.
*/

public class VariabiliJava {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. DICHIARAZIONE DI UNA VARIABILE
        // tipo nomeVariabile;
        // ----------------------------------------------------
        int numero;

        // assegnazione del valore
        numero = 10;

        System.out.println("Valore della variabile numero: " + numero);


        // ----------------------------------------------------
        // 2. DICHIARAZIONE E INIZIALIZZAZIONE INSIEME
        // tipo nome = valore;
        // ----------------------------------------------------
        int eta = 25;

        System.out.println("Eta: " + eta);


        // ----------------------------------------------------
        // 3. VARIABILI DI TIPI PRIMITIVI
        // Java ha diversi tipi di variabili primitive
        // ----------------------------------------------------
        int intero = 100;          // numeri interi
        double decimale = 12.5;    // numeri con virgola
        char lettera = 'A';        // singolo carattere
        boolean attivo = true;     // valore logico
        float prezzo = 19.99f;     // numero decimale più leggero
        long grandeNumero = 1000000000L; // numeri molto grandi

        System.out.println(intero);
        System.out.println(decimale);
        System.out.println(lettera);
        System.out.println(attivo);
        System.out.println(prezzo);
        System.out.println(grandeNumero);


        // ----------------------------------------------------
        // 4. MODIFICA DEL VALORE DI UNA VARIABILE
        // Le variabili possono cambiare valore durante il programma
        // ----------------------------------------------------
        int punteggio = 50;

        System.out.println("Punteggio iniziale: " + punteggio);

        punteggio = 80; // modifica del valore

        System.out.println("Punteggio modificato: " + punteggio);


        // ----------------------------------------------------
        // 5. USO DELLE VARIABILI NEI CALCOLI
        // Le variabili possono essere usate nelle operazioni matematiche
        // ----------------------------------------------------
        int a = 10;
        int b = 5;

        int somma = a + b;
        int differenza = a - b;
        int prodotto = a * b;
        int divisione = a / b;

        System.out.println("Somma: " + somma);
        System.out.println("Differenza: " + differenza);
        System.out.println("Prodotto: " + prodotto);
        System.out.println("Divisione: " + divisione);


        // ----------------------------------------------------
        // 6. VARIABILI CHE DIPENDONO DA ALTRE VARIABILI
        // ----------------------------------------------------
        int base = 10;
        int altezza = 5;

        int area = base * altezza;

        System.out.println("Area del rettangolo: " + area);


        // ----------------------------------------------------
        // 7. INCREMENTO E DECREMENTO DI VARIABILI
        // ----------------------------------------------------
        int contatore = 0;

        contatore++; // incremento di 1
        contatore++;

        System.out.println("Contatore dopo incrementi: " + contatore);

        contatore--; // decremento

        System.out.println("Contatore dopo decremento: " + contatore);


        // ----------------------------------------------------
        // 8. UTILIZZO DELLE VARIABILI NELLE CONDIZIONI
        // ----------------------------------------------------
        int temperatura = 30;

        if (temperatura > 25) {
            System.out.println("Fa caldo");
        } else {
            System.out.println("Temperatura normale");
        }


        // ----------------------------------------------------
        // 9. UTILIZZO DELLE VARIABILI NEI CICLI
        // ----------------------------------------------------
        int i;

        for (i = 0; i < 5; i++) {
            System.out.println("Valore di i: " + i);
        }


        // ----------------------------------------------------
        // 10. COSTANTI CON FINAL
        // Le variabili dichiarate final non possono cambiare valore
        // ----------------------------------------------------
        final double PI = 3.14159;

        System.out.println("Valore della costante PI: " + PI);

        // PI = 3.14; // questo genererebbe errore


        // ----------------------------------------------------
        // 11. VARIABILI TEMPORANEE PER SCAMBIARE VALORI
        // ----------------------------------------------------
        int x = 5;
        int y = 10;

        System.out.println("Prima dello scambio: x=" + x + " y=" + y);

        int temp = x;
        x = y;
        y = temp;

        System.out.println("Dopo lo scambio: x=" + x + " y=" + y);


        // ----------------------------------------------------
        // 12. CONCATENAZIONE DI STRINGHE CON VARIABILI
        // ----------------------------------------------------
        String nome = "Mario";
        int anni = 30;

        System.out.println("Nome: " + nome + " - Eta: " + anni);

    }
}
