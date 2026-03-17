/*
    ESEMPI DI OPERATORI IN JAVA
    In questo file trovi:
    - operatori aritmetici
    - operatori relazionali
    - operatori logici
    - operatori di assegnazione
    - operatori di incremento/decremento
*/

public class OperatoriJavaExamples {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. OPERATORI ARITMETICI
        // ----------------------------------------------------
        int a = 10;
        int b = 3;

        System.out.println("Somma: " + (a + b));        // +
        System.out.println("Sottrazione: " + (a - b));  // -
        System.out.println("Moltiplicazione: " + (a * b)); // *
        System.out.println("Divisione: " + (a / b));    // /
        System.out.println("Modulo: " + (a % b));       // resto divisione


        // ----------------------------------------------------
        // 2. OPERATORI RELAZIONALI (restituiscono boolean)
        // ----------------------------------------------------
        System.out.println("a > b: " + (a > b));   // maggiore
        System.out.println("a < b: " + (a < b));   // minore
        System.out.println("a >= b: " + (a >= b)); // maggiore uguale
        System.out.println("a <= b: " + (a <= b)); // minore uguale
        System.out.println("a == b: " + (a == b)); // uguale
        System.out.println("a != b: " + (a != b)); // diverso


        // ----------------------------------------------------
        // 3. OPERATORI LOGICI
        // ----------------------------------------------------
        boolean condizione1 = true;
        boolean condizione2 = false;

        // AND (&&) → vero solo se entrambe sono vere
        System.out.println("AND: " + (condizione1 && condizione2));

        // OR (||) → vero se almeno una è vera
        System.out.println("OR: " + (condizione1 || condizione2));

        // NOT (!) → inverte il valore
        System.out.println("NOT condizione1: " + (!condizione1));


        // ----------------------------------------------------
        // 4. COMBINAZIONE OPERATORI LOGICI + RELAZIONALI
        // ----------------------------------------------------
        int eta = 20;
        int soldi = 50;

        if (eta >= 18 && soldi > 20) {
            System.out.println("Puoi entrare e comprare");
        }


        // ----------------------------------------------------
        // 5. OPERATORI DI ASSEGNAZIONE
        // ----------------------------------------------------
        int x = 5;

        x += 3; // x = x + 3
        System.out.println("x += 3: " + x);

        x -= 2; // x = x - 2
        System.out.println("x -= 2: " + x);

        x *= 2; // x = x * 2
        System.out.println("x *= 2: " + x);

        x /= 2; // x = x / 2
        System.out.println("x /= 2: " + x);

        x %= 3; // x = x % 3
        System.out.println("x %= 3: " + x);


        // ----------------------------------------------------
        // 6. INCREMENTO E DECREMENTO
        // ----------------------------------------------------
        int contatore = 0;

        contatore++; // +1
        System.out.println("Incremento: " + contatore);

        contatore--; // -1
        System.out.println("Decremento: " + contatore);


        // ----------------------------------------------------
        // 7. PRE E POST INCREMENTO
        // ----------------------------------------------------
        int y = 5;

        System.out.println("Post incremento: " + (y++)); // usa y poi incrementa
        System.out.println("Valore dopo post: " + y);

        System.out.println("Pre incremento: " + (++y)); // incrementa prima
        System.out.println("Valore dopo pre: " + y);


        // ----------------------------------------------------
        // 8. OPERATORE TERNARIO
        // alternativa compatta all'if
        // ----------------------------------------------------
        int numero = 10;

        String risultato = (numero % 2 == 0) ? "Pari" : "Dispari";

        System.out.println("Risultato ternario: " + risultato);


        // ----------------------------------------------------
        // 9. SHORT CIRCUIT (IMPORTANTISSIMO)
        // ----------------------------------------------------
        int z = 0;

        // la seconda condizione NON viene valutata se la prima è falsa
        if (z != 0 && (10 / z > 1)) {
            System.out.println("Non entra mai qui");
        }


        // ----------------------------------------------------
        // 10. ESEMPIO COMPLETO
        // ----------------------------------------------------
        int voto = 85;
        boolean presenza = true;

        if ((voto >= 60 && presenza) || voto > 90) {
            System.out.println("Esame superato");
        } else {
            System.out.println("Esame non superato");
        }

    }
}
