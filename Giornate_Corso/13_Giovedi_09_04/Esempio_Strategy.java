/*
    ESEMPIO DI PATTERN STRATEGY IN JAVA

    Concetto:
    - Definisci una famiglia di algoritmi
    - Li separi in classi diverse
    - Puoi cambiarli a runtime

    Esempio: personaggio che può attaccare in modi diversi
*/

public class StrategyExample {

    public static void main(String[] args) {

        // creazione strategie
        StrategiaAttacco spada = new AttaccoSpada();
        StrategiaAttacco arco = new AttaccoArco();
        StrategiaAttacco magia = new AttaccoMagia();

        // personaggio con strategia iniziale
        Personaggio player = new Personaggio("Hero", spada);

        player.eseguiAttacco();

        // cambio strategia durante il gioco
        player.setStrategia(arco);
        player.eseguiAttacco();

        player.setStrategia(magia);
        player.eseguiAttacco();
    }
}


/*
    INTERFACCIA STRATEGY
*/
interface StrategiaAttacco {
    void attacca();
}


/*
    STRATEGIE CONCRETE
*/
class AttaccoSpada implements StrategiaAttacco {

    @Override
    public void attacca() {
        System.out.println("Attacco con la spada!");
    }

}

class AttaccoArco implements StrategiaAttacco {

    @Override
    public void attacca() {
        System.out.println("Attacco con l'arco!");
    }

}

class AttaccoMagia implements StrategiaAttacco {

    @Override
    public void attacca() {
        System.out.println("Attacco con la magia!");
    }

}


/*
    CONTEXT
*/
class Personaggio {

    private String nome;
    private StrategiaAttacco strategia;

    public Personaggio(String nome, StrategiaAttacco strategia) {
        this.nome = nome;
        this.strategia = strategia;
    }

    public void setStrategia(StrategiaAttacco strategia) {
        this.strategia = strategia;
    }

    public void eseguiAttacco() {
        System.out.print(nome + ": ");
        strategia.attacca();
    }

}
