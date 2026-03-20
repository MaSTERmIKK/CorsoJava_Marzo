import java.util.ArrayList;
import java.util.Scanner;

public class GestioneVotiArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Creazione ArrayList per salvare i voti
        ArrayList<Integer> voti = new ArrayList<>();

        // Inserimento numero voti
        System.out.print("Quanti voti vuoi inserire? ");
        int n = input.nextInt();

        // Inserimento voti nella lista
        for (int i = 0; i < n; i++) {
            System.out.print("Inserisci voto: ");
            int voto = input.nextInt();
            voti.add(voto); // aggiunta alla lista
        }

        boolean continua = true;

        // Menu principale
        while (continua) {

            System.out.println("\n--- MENU ---");
            System.out.println("1 - Calcola media");
            System.out.println("2 - Voto più alto");
            System.out.println("3 - Voto più basso");
            System.out.println("4 - Verifica promozione");
            System.out.println("5 - Esci");
            System.out.print("Scelta: ");

            int scelta = input.nextInt();

            switch (scelta) {

                case 1:
                    double media = calcolaMedia(voti);
                    System.out.println("Media: " + media);
                    break;

                case 2:
                    System.out.println("Voto più alto: " + trovaMax(voti));
                    break;

                case 3:
                    System.out.println("Voto più basso: " + trovaMin(voti));
                    break;

                case 4:
                    double mediaPromo = calcolaMedia(voti);
                    verificaPromozione(mediaPromo);
                    break;

                case 5:
                    System.out.println("Arrivederci!");
                    continua = false;
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }

        input.close();
    }

    // Funzione per calcolare la media
    public static double calcolaMedia(ArrayList<Integer> voti) {

        int somma = 0;

        // Ciclo per sommare tutti i voti
        for (int i = 0; i < voti.size(); i++) {
            somma += voti.get(i);
        }

        return (double) somma / voti.size();
    }

    // Funzione per trovare il massimo
    public static int trovaMax(ArrayList<Integer> voti) {

        int max = voti.get(0); // primo elemento come riferimento

        for (int i = 1; i < voti.size(); i++) {
            if (voti.get(i) > max) {
                max = voti.get(i);
            }
        }

        return max;
    }

    // Funzione per trovare il minimo
    public static int trovaMin(ArrayList<Integer> voti) {

        int min = voti.get(0); // primo elemento come riferimento

        for (int i = 1; i < voti.size(); i++) {
            if (voti.get(i) < min) {
                min = voti.get(i);
            }
        }

        return min;
    }

    // Funzione per verificare promozione
    public static void verificaPromozione(double media) {

        if (media >= 6) {
            System.out.println("Promosso");
        } else {
            System.out.println("Bocciato");
        }
    }
}
