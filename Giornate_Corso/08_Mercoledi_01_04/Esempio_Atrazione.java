/*
    ESEMPIO COMPLETO: ASTRATTA + INTERFACCIA INSIEME

    Combiniamo:
    - classe astratta (cosa sei)
    - interfaccia (cosa sai fare)

    Pattern mentale:
    - abstract → struttura base
    - interface → comportamento aggiuntivo
*/

import java.util.ArrayList;

public class AstrazioneInterfacceExample {

    public static void main(String[] args) {

        ArrayList<Personaggio> lista = new ArrayList<>();

        lista.add(new Guerriero("Kratos", 100));
        lista.add(new Mago("Merlino", 80));

        // ----------------------------------------------------
        // USO POLIMORFICO COMPLETO
        // ----------------------------------------------------
        for (int i = 0; i < lista.size(); i++) {

            Personaggio p = lista.get(i);

            p.descrivi(); // metodo concreto (astrazione)
            p.attacca();  // metodo astratto

            // cast per usare l'interfaccia
            if (p instanceof Curabile) {
                ((Curabile) p).cura();
            }

            System.out.println("-------------------");
        }

    }
}


/*
    INTERFACCIA
*/
interface Curabile {
    void cura();
}


/*
    CLASSE ASTRATTA
*/
abstract class Personaggio {

    protected String nome;
    protected int vita;

    public Personaggio(String nome, int vita) {
        this.nome = nome;
        this.vita = vita;
    }

    public void descrivi() {
        System.out.println("Nome: " + nome + " - Vita: " + vita);
    }

    // metodo astratto
    public abstract void attacca();
}


/*
    CLASSE FIGLIA: GUERRIERO
*/
class Guerriero extends Personaggio implements Curabile {

    public Guerriero(String nome, int vita) {
        super(nome, vita);
    }

    @Override
    public void attacca() {
        System.out.println(nome + " attacca con la spada!");
    }

    @Override
    public void cura() {
        System.out.println(nome + " usa una pozione!");
    }

}


/*
    CLASSE FIGLIA: MAGO
*/
class Mago extends Personaggio implements Curabile {

    public Mago(String nome, int vita) {
        super(nome, vita);
    }

    @Override
    public void attacca() {
        System.out.println(nome + " lancia una magia!");
    }

    @Override
    public void cura() {
        System.out.println(nome + " lancia una cura magica!");
    }

}
