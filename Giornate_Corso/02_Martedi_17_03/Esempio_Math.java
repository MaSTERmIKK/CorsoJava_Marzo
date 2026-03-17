/*
    ESEMPI DI UTILIZZO DELLA CLASSE MATH IN JAVA
    La classe Math contiene metodi statici per operazioni matematiche.
*/

public class MathJavaExamples {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. VALORE ASSOLUTO
        // ----------------------------------------------------
        int negativo = -10;
        int assoluto = Math.abs(negativo);

        System.out.println("Valore assoluto: " + assoluto);


        // ----------------------------------------------------
        // 2. POTENZA
        // ----------------------------------------------------
        double potenza = Math.pow(2, 3); // 2^3

        System.out.println("2 elevato a 3: " + potenza);


        // ----------------------------------------------------
        // 3. RADICE QUADRATA
        // ----------------------------------------------------
        double radice = Math.sqrt(25);

        System.out.println("Radice quadrata di 25: " + radice);


        // ----------------------------------------------------
        // 4. MASSIMO E MINIMO
        // ----------------------------------------------------
        int a = 10;
        int b = 20;

        System.out.println("Massimo: " + Math.max(a, b));
        System.out.println("Minimo: " + Math.min(a, b));


        // ----------------------------------------------------
        // 5. NUMERI CASUALI
        // Math.random() genera un numero tra 0.0 e 1.0
        // ----------------------------------------------------
        double casuale = Math.random();

        System.out.println("Numero casuale: " + casuale);

        // numero casuale tra 1 e 10
        int casualeInt = (int) (Math.random() * 10) + 1;

        System.out.println("Numero casuale tra 1 e 10: " + casualeInt);


        // ----------------------------------------------------
        // 6. ARROTONDAMENTI
        // ----------------------------------------------------
        double numero = 5.7;

        System.out.println("Arrotondato (round): " + Math.round(numero)); // più vicino
        System.out.println("Arrotondato per difetto (floor): " + Math.floor(numero));
        System.out.println("Arrotondato per eccesso (ceil): " + Math.ceil(numero));


        // ----------------------------------------------------
        // 7. COSTANTI
        // ----------------------------------------------------
        System.out.println("PI greco: " + Math.PI);
        System.out.println("Numero di Eulero: " + Math.E);


        // ----------------------------------------------------
        // 8. FUNZIONI TRIGONOMETRICHE
        // ATTENZIONE: usano radianti, non gradi
        // ----------------------------------------------------
        double angolo = Math.toRadians(90); // conversione gradi → radianti

        System.out.println("sin(90°): " + Math.sin(angolo));
        System.out.println("cos(90°): " + Math.cos(angolo));
        System.out.println("tan(90°): " + Math.tan(angolo));


        // ----------------------------------------------------
        // 9. LOGARITMI
        // ----------------------------------------------------
        double log = Math.log(10);      // log naturale
        double log10 = Math.log10(10); // log base 10

        System.out.println("Log naturale: " + log);
        System.out.println("Log base 10: " + log10);


        // ----------------------------------------------------
        // 10. VALORI CASUALI IN RANGE
        // ----------------------------------------------------
        int min = 5;
        int max = 15;

        int numeroRandom = (int) (Math.random() * (max - min + 1)) + min;

        System.out.println("Numero tra 5 e 15: " + numeroRandom);


        // ----------------------------------------------------
        // 11. SEGNO DI UN NUMERO
        // ----------------------------------------------------
        double valore = -3.5;

        System.out.println("Signum: " + Math.signum(valore)); // -1, 0, 1


        // ----------------------------------------------------
        // 12. ESEMPIO COMPLETO
        // ----------------------------------------------------
        int x = 4;
        int y = 7;

        double distanza = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("Distanza (pitagora): " + distanza);

    }
}
