/*
    ESEMPIO DI PATTERN DECORATOR IN JAVA

    Concetto:
    - Aggiungere funzionalità a un oggetto SENZA modificarlo
    - Si usa composizione invece di ereditarietà

    Esempio: Caffè con ingredienti aggiuntivi
*/

public class DecoratorExample {

    public static void main(String[] args) {

        // base
        Bevanda bevanda = new Caffe();

        // aggiunta decoratori
        bevanda = new Latte(bevanda);
        bevanda = new Zucchero(bevanda);

        System.out.println(bevanda.getDescrizione());
        System.out.println("Costo: " + bevanda.getCosto());

    }
}


/*
    INTERFACCIA BASE
*/
interface Bevanda {

    String getDescrizione();
    double getCosto();

}


/*
    CLASSE BASE CONCRETA
*/
class Caffe implements Bevanda {

    public String getDescrizione() {
        return "Caffè";
    }

    public double getCosto() {
        return 1.0;
    }

}


/*
    DECORATOR ASTRATTO
*/
abstract class Decoratore implements Bevanda {

    protected Bevanda bevanda;

    public Decoratore(Bevanda bevanda) {
        this.bevanda = bevanda;
    }

}


/*
    DECORATORE: LATTE
*/
class Latte extends Decoratore {

    public Latte(Bevanda bevanda) {
        super(bevanda);
    }

    public String getDescrizione() {
        return bevanda.getDescrizione() + " + Latte";
    }

    public double getCosto() {
        return bevanda.getCosto() + 0.5;
    }

}


/*
    DECORATORE: ZUCCHERO
*/
class Zucchero extends Decoratore {

    public Zucchero(Bevanda bevanda) {
        super(bevanda);
    }

    public String getDescrizione() {
        return bevanda.getDescrizione() + " + Zucchero";
    }

    public double getCosto() {
        return bevanda.getCosto() + 0.2;
    }

}
