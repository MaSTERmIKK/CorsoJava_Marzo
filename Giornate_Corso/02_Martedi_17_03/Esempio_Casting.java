/*
    ESEMPI DI CASTING IN JAVA
    Il casting serve per convertire un tipo di dato in un altro.
    Esistono due tipi principali:
    - Casting implicito (automatico)
    - Casting esplicito (forzato)
*/

public class CastingJavaExamples {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. CASTING IMPLICITO (WIDENING)
        // Da tipo più piccolo a tipo più grande
        // avviene automaticamente
        // ----------------------------------------------------
        int numeroInt = 10;

        double numeroDouble = numeroInt; // conversione automatica

        System.out.println("Int: " + numeroInt);
        System.out.println("Double (da int): " + numeroDouble);


        // ----------------------------------------------------
        // 2. CASTING ESPLICITO (NARROWING)
        // Da tipo più grande a tipo più piccolo
        // serve forzare con (tipo)
        // ----------------------------------------------------
        double valoreDouble = 9.78;

        int valoreInt = (int) valoreDouble; // perde la parte decimale

        System.out.println("Double originale: " + valoreDouble);
        System.out.println("Int convertito: " + valoreInt);


        // ----------------------------------------------------
        // 3. PERDITA DI INFORMAZIONE
        // ----------------------------------------------------
        double prezzo = 19.99;

        int prezzoIntero = (int) prezzo; // diventa 19

        System.out.println("Prezzo reale: " + prezzo);
        System.out.println("Prezzo intero: " + prezzoIntero);


        // ----------------------------------------------------
        // 4. CASTING TRA TIPI NUMERICI
        // ----------------------------------------------------
        long numeroGrande = 100000L;

        int numeroPiccolo = (int) numeroGrande;

        System.out.println("Long: " + numeroGrande);
        System.out.println("Int: " + numeroPiccolo);


        // ----------------------------------------------------
        // 5. CASTING CON CALCOLI
        // ----------------------------------------------------
        int a = 5;
        int b = 2;

        double risultato = (double) a / b; // forza divisione decimale

        System.out.println("Divisione con casting: " + risultato);


        // ----------------------------------------------------
        // 6. SENZA CASTING (DIVISIONE INTERA)
        // ----------------------------------------------------
        int divisioneIntera = a / b; // risultato = 2

        System.out.println("Divisione senza casting: " + divisioneIntera);


        // ----------------------------------------------------
        // 7. CASTING DI CHAR IN INT
        // restituisce il valore ASCII
        // ----------------------------------------------------
        char lettera = 'A';

        int valoreAscii = (int) lettera;

        System.out.println("Char: " + lettera);
        System.out.println("ASCII: " + valoreAscii);


        // ----------------------------------------------------
        // 8. CASTING DI INT IN CHAR
        // ----------------------------------------------------
        int codice = 66;

        char simbolo = (char) codice;

        System.out.println("Codice: " + codice);
        System.out.println("Char: " + simbolo);


        // ----------------------------------------------------
        // 9. CASTING IN ESPRESSIONI COMPLESSE
        // ----------------------------------------------------
        int x = 7;
        int y = 3;

        double risultato2 = (double) (x + y) / 2;

        System.out.println("Media: " + risultato2);


        // ----------------------------------------------------
        // 10. CASTING CON FLOAT
        // ----------------------------------------------------
        float valoreFloat = 5.5f;

        int valoreInt2 = (int) valoreFloat;

        System.out.println("Float: " + valoreFloat);
        System.out.println("Int: " + valoreInt2);


        // ----------------------------------------------------
        // 11. OVERFLOW (ATTENZIONE)
        // quando il valore supera il limite del tipo
        // ----------------------------------------------------
        int max = 130;

        byte piccolo = (byte) max; // overflow

        System.out.println("Int: " + max);
        System.out.println("Byte (overflow): " + piccolo);


        // ----------------------------------------------------
        // 12. CASTING MULTIPLO
        // ----------------------------------------------------
        double num = 100.25;

        int intero = (int) num;
        float decimale = (float) num;

        System.out.println("Double: " + num);
        System.out.println("Int: " + intero);
        System.out.println("Float: " + decimale);

    }
}
