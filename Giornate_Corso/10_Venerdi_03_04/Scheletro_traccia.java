import java.util.ArrayList;
import java.util.Scanner;

// ======================
// CLASSE ASTRATTA
// ======================
abstract class Persona {
    private String nome;
    private int eta;

    public Persona(String nome, int eta) {
        this.nome = nome;
        this.eta = eta;
    }

    public String getNome() { return nome; }
    public int getEta() { return eta; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEta(int eta) { this.eta = eta; }

    public abstract void descriviRuolo();
}

// ======================
// INTERFACCIA
// ======================
interface Registrabile {
    void registrazione();
}

// ======================
// STUDENTE
// ======================
class Studente extends Persona implements Registrabile {
    private String classeFrequentata;
    private ArrayList<Integer> voti = new ArrayList<>();

    public Studente(String nome, int eta, String classeFrequentata) {
        super(nome, eta);
        this.classeFrequentata = classeFrequentata;
    }

    public void aggiungiVoto(int voto) {
        voti.add(voto);
    }

    public void stampaVoti() {
        System.out.println("Voti: " + voti);
    }

    @Override
    public void descriviRuolo() {
        System.out.println("Sono uno studente della classe " + classeFrequentata);
    }

    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite modulo online");
    }
}

// ======================
// DOCENTE
// ======================
class Docente extends Persona implements Registrabile {
    private String materia;
    private ArrayList<Studente> studenti = new ArrayList<>();

    public Docente(String nome, int eta, String materia) {
        super(nome, eta);
        this.materia = materia;
    }

    public void aggiungiStudente(Studente s) {
        studenti.add(s);
    }

    public void assegnaVoto(Studente s, int voto) {
        s.aggiungiVoto(voto);
    }

    @Override
    public void descriviRuolo() {
        System.out.println("Sono un docente di " + materia);
    }

    @Override
    public void registrazione() {
        System.out.println("Registrazione tramite segreteria didattica");
    }
}

// ======================
// MAIN + MENU SEMPLICE
// ======================
public class GestioneScuola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Studente> studenti = new ArrayList<>();
        ArrayList<Docente> docenti = new ArrayList<>();

        int scelta;

        do {
            System.out.println("\n1. Crea Studente");
            System.out.println("2. Crea Docente");
            System.out.println("3. Assegna voto");
            System.out.println("4. Stampa voti studente");
            System.out.println("0. Esci");

            scelta = sc.nextInt();
            sc.nextLine();

            switch (scelta) {

                case 1:
                    System.out.print("Nome: ");
                    String nomeS = sc.nextLine();
                    System.out.print("Età: ");
                    int etaS = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Classe: ");
                    String classe = sc.nextLine();

                    studenti.add(new Studente(nomeS, etaS, classe));
                    break;

                case 2:
                    System.out.print("Nome: ");
                    String nomeD = sc.nextLine();
                    System.out.print("Età: ");
                    int etaD = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Materia: ");
                    String materia = sc.nextLine();

                    docenti.add(new Docente(nomeD, etaD, materia));
                    break;

                case 3:
                    if (docenti.size() == 0 || studenti.size() == 0) break;

                    System.out.println("Seleziona docente (indice):");
                    for (int i = 0; i < docenti.size(); i++) {
                        System.out.println(i + " - " + docenti.get(i).getNome());
                    }
                    int d = sc.nextInt();

                    System.out.println("Seleziona studente (indice):");
                    for (int i = 0; i < studenti.size(); i++) {
                        System.out.println(i + " - " + studenti.get(i).getNome());
                    }
                    int s = sc.nextInt();

                    System.out.print("Voto: ");
                    int voto = sc.nextInt();

                    docenti.get(d).assegnaVoto(studenti.get(s), voto);
                    break;

                case 4:
                    if (studenti.size() == 0) break;

                    System.out.println("Seleziona studente:");
                    for (int i = 0; i < studenti.size(); i++) {
                        System.out.println(i + " - " + studenti.get(i).getNome());
                    }
                    int index = sc.nextInt();

                    studenti.get(index).stampaVoti();
                    break;
            }

        } while (scelta != 0);

        sc.close();
    }
}
