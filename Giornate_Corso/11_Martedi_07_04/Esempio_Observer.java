/*
    ESEMPIO DI PATTERN OBSERVER IN JAVA

    Concetto:
    - Un oggetto (Subject) notifica altri oggetti (Observer)
    - Gli observer reagiscono automaticamente ai cambiamenti

    Esempio: Sistema notifiche
*/

import java.util.ArrayList;

public class ObserverExample {

    public static void main(String[] args) {

        // Subject
        CanaleYouTube canale = new CanaleYouTube();

        // Observer
        Utente u1 = new Utente("Mario");
        Utente u2 = new Utente("Anna");

        // iscrizione
        canale.aggiungiIscritto(u1);
        canale.aggiungiIscritto(u2);

        // evento
        canale.caricaVideo("Nuovo video su Java!");

    }
}


/*
    INTERFACCIA OBSERVER
*/
interface Observer {
    void aggiorna(String messaggio);
}


/*
    CLASSE OBSERVER (utente)
*/
class Utente implements Observer {

    private String nome;

    public Utente(String nome) {
        this.nome = nome;
    }

    @Override
    public void aggiorna(String messaggio) {
        System.out.println(nome + " ha ricevuto: " + messaggio);
    }

}


/*
    SUBJECT (OSSERVATO)
*/
class CanaleYouTube {

    private ArrayList<Observer> iscritti = new ArrayList<>();

    // aggiunge observer
    public void aggiungiIscritto(Observer o) {
        iscritti.add(o);
    }

    // notifica tutti
    public void notifica(String messaggio) {

        for (int i = 0; i < iscritti.size(); i++) {
            iscritti.get(i).aggiorna(messaggio);
        }

    }

    // evento
    public void caricaVideo(String titolo) {
        System.out.println("Nuovo video caricato: " + titolo);
        notifica(titolo);
    }

}
