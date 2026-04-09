/*
    ESEMPIO DI PATTERN FACADE IN JAVA

    Concetto:
    - La Facade offre un'interfaccia semplice
      per usare un sistema complesso
    - Nasconde i dettagli interni
    - Il client usa un solo oggetto invece di tanti

    Esempio:
    Sistema Home Theater
*/

public class FacadeExample {

    public static void main(String[] args) {

        // creo la facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        // uso semplice
        homeTheater.guardaFilm();
        System.out.println("--------------------");
        homeTheater.spegniTutto();
    }
}


/*
    SOTTOSISTEMA 1
*/
class TV {

    public void accendi() {
        System.out.println("TV accesa");
    }

    public void spegni() {
        System.out.println("TV spenta");
    }

    public void impostaCanaleHDMI() {
        System.out.println("TV impostata su HDMI");
    }

}


/*
    SOTTOSISTEMA 2
*/
class LettoreDVD {

    public void accendi() {
        System.out.println("Lettore DVD acceso");
    }

    public void spegni() {
        System.out.println("Lettore DVD spento");
    }

    public void play() {
        System.out.println("Film avviato");
    }

}


/*
    SOTTOSISTEMA 3
*/
class AudioSystem {

    public void accendi() {
        System.out.println("Sistema audio acceso");
    }

    public void spegni() {
        System.out.println("Sistema audio spento");
    }

    public void impostaVolume(int volume) {
        System.out.println("Volume impostato a: " + volume);
    }

}


/*
    FACADE
    Nasconde tutta la complessità del sistema
*/
class HomeTheaterFacade {

    private TV tv;
    private LettoreDVD dvd;
    private AudioSystem audio;

    public HomeTheaterFacade() {
        tv = new TV();
        dvd = new LettoreDVD();
        audio = new AudioSystem();
    }

    // metodo semplice che usa molti oggetti interni
    public void guardaFilm() {
        System.out.println("Preparazione Home Theater...");
        tv.accendi();
        tv.impostaCanaleHDMI();
        audio.accendi();
        audio.impostaVolume(20);
        dvd.accendi();
        dvd.play();
    }

    public void spegniTutto() {
        System.out.println("Spegnimento Home Theater...");
        dvd.spegni();
        audio.spegni();
        tv.spegni();
    }

}
