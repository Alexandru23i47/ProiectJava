public class Film {
    static int pretBilet = 30;
    static String cinematograf = "Patria";
    public String nume;
    public int durata; // in minute
    public boolean luatOscar;

    public Film(String num, int nrMin, boolean oscar) {
        nume = num;
        durata = nrMin;
        luatOscar = oscar;
    }

    static int getPretBilet() {
        return pretBilet;
    }

    static void printCinema(Film f) {
        System.out.println("Filmul " + f.nume + " este difuzat la cinematograful " + cinematograf);
    }

    public void afisare() {
        System.out.println("Nume: " + nume);
        System.out.println("Durata (in minute): " + durata);
        if (luatOscar)
            System.out.println("Filmul a primit premiul Oscar \n");
        else
            System.out.println("Filmul nu a primit premiul Oscar \n");
    }

    public static void main(String args[]) {
        System.out.println("Pretul unui bilet este: " + Film.getPretBilet() + " lei");
        Film f1 = new Film("The good, the bad and the ugly", 180, false);
        f1.afisare();
        Film.printCinema(f1);
    }
}
