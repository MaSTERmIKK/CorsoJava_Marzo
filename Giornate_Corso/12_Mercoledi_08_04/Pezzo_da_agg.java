// CLASSE FORNITA - DA MODIFICARE
class MagazzinoEsterno {

    private int mozzarellaExtra = 5;
    private int salame = 4;
    private int funghi = 3;
    private int olive = 6;

    public boolean disponibile(String ingrediente) {
        switch (ingrediente.toLowerCase()) {
            case "mozzarella":
                return mozzarellaExtra > 0;
            case "salame":
                return salame > 0;
            case "funghi":
                return funghi > 0;
            case "olive":
                return olive > 0;
            default:
                return false;
        }
    }

    public void consumaIngrediente(String ingrediente) {
        switch (ingrediente.toLowerCase()) {
            case "mozzarella":
                if (mozzarellaExtra > 0) {
                    mozzarellaExtra--;
                }
                break;
            case "salame":
                if (salame > 0) {
                    salame--;
                }
                break;
            case "funghi":
                if (funghi > 0) {
                    funghi--;
                }
                break;
            case "olive":
                if (olive > 0) {
                    olive--;
                }
                break;
        }
    }

    public void stampaDisponibilita() {
        System.out.println("--- MAGAZZINO ---");
        System.out.println("Mozzarella extra: " + mozzarellaExtra);
        System.out.println("Salame: " + salame);
        System.out.println("Funghi: " + funghi);
        System.out.println("Olive: " + olive);
    }
}
