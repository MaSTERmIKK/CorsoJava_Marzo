/*
    ESEMPI DEI PRINCIPALI METODI DELLE STRINGHE IN JAVA
    Tutto in un unico file, senza OOP avanzato.

    NOTA: le stringhe in Java sono IMMUTABILI,
    quindi ogni operazione crea una nuova stringa.
*/

public class StringMethodsJava {

    public static void main(String[] args) {

        // ----------------------------------------------------
        // 1. CREAZIONE DI UNA STRINGA
        // ----------------------------------------------------
        String testo = "Ciao Mondo";

        System.out.println("Testo originale: " + testo);


        // ----------------------------------------------------
        // 2. LENGTH() → lunghezza della stringa
        // ----------------------------------------------------
        int lunghezza = testo.length();
        System.out.println("Lunghezza: " + lunghezza);


        // ----------------------------------------------------
        // 3. TOUPPERCASE() E TOLOWERCASE()
        // ----------------------------------------------------
        System.out.println("Maiuscolo: " + testo.toUpperCase());
        System.out.println("Minuscolo: " + testo.toLowerCase());


        // ----------------------------------------------------
        // 4. CHARAT() → prende un carattere per indice
        // ----------------------------------------------------
        char primo = testo.charAt(0);
        System.out.println("Primo carattere: " + primo);


        // ----------------------------------------------------
        // 5. INDEXOF() → posizione di un carattere o parola
        // ----------------------------------------------------
        int posizione = testo.indexOf("Mondo");
        System.out.println("Posizione di 'Mondo': " + posizione);


        // ----------------------------------------------------
        // 6. SUBSTRING() → estrazione di una parte
        // ----------------------------------------------------
        String parte = testo.substring(5);
        System.out.println("Substring da indice 5: " + parte);

        String parte2 = testo.substring(0, 4);
        System.out.println("Substring da 0 a 4: " + parte2);


        // ----------------------------------------------------
        // 7. EQUALS() → confronto tra stringhe
        // ----------------------------------------------------
        String parola1 = "Java";
        String parola2 = "java";

        System.out.println("Equals: " + parola1.equals(parola2));
        System.out.println("EqualsIgnoreCase: " + parola1.equalsIgnoreCase(parola2));


        // ----------------------------------------------------
        // 8. CONTAINS() → verifica se contiene testo
        // ----------------------------------------------------
        boolean contiene = testo.contains("Ciao");
        System.out.println("Contiene 'Ciao': " + contiene);


        // ----------------------------------------------------
        // 9. REPLACE() → sostituisce caratteri o parole
        // ----------------------------------------------------
        String sostituito = testo.replace("Mondo", "Mirko");
        System.out.println("Sostituito: " + sostituito);


        // ----------------------------------------------------
        // 10. TRIM() → rimuove spazi iniziali e finali
        // ----------------------------------------------------
        String conSpazi = "   Hello World   ";
        String pulito = conSpazi.trim();
        System.out.println("Prima: '" + conSpazi + "'");
        System.out.println("Dopo trim: '" + pulito + "'");


        // ----------------------------------------------------
        // 11. STARTSWITH() E ENDSWITH()
        // ----------------------------------------------------
        System.out.println("Inizia con 'Ciao': " + testo.startsWith("Ciao"));
        System.out.println("Finisce con 'Mondo': " + testo.endsWith("Mondo"));


        // ----------------------------------------------------
        // 12. CONCATENAZIONE
        // ----------------------------------------------------
        String nome = "Mirko";
        String frase = "Ciao " + nome;

        System.out.println("Concatenazione: " + frase);


        // ----------------------------------------------------
        // 13. SPLIT() → divide una stringa
        // ----------------------------------------------------
        String dati = "Mario,Rossi,30";

        String[] parti = dati.split(",");

        System.out.println("Nome: " + parti[0]);
        System.out.println("Cognome: " + parti[1]);
        System.out.println("Eta: " + parti[2]);


        // ----------------------------------------------------
        // 14. VALUEOF() → conversione in stringa
        // ----------------------------------------------------
        int numero = 100;

        String numeroStringa = String.valueOf(numero);

        System.out.println("Numero come stringa: " + numeroStringa);


        // ----------------------------------------------------
        // 15. PARSE (STRING → NUMERO)
        // ----------------------------------------------------
        String numeroTesto = "50";

        int numeroConvertito = Integer.parseInt(numeroTesto);

        System.out.println("Stringa convertita in int: " + numeroConvertito);


        // ----------------------------------------------------
        // 16. ESEMPIO COMPLETO
        // ----------------------------------------------------
        String input = "   java programming   ";

        String risultato = input.trim().toUpperCase();

        if (risultato.contains("JAVA")) {
            System.out.println("Contiene JAVA dopo pulizia: " + risultato);
        }

    }
}
