public class Floare {
    public String denumire;
    public int nrPetale;
    public String zonaClima = "-";

    // Constructor 1
    public Floare(String denum, int nrP) {
        denumire = denum;
        nrPetale = nrP;
    }

    // Constructor 2
    public Floare(String denum, int nrP, String zona) {
        denumire = denum;
        nrPetale = nrP;
        zonaClima = zona;
    }

    public void afisare() {
        System.out.println("Denumire: " + denumire);
        System.out.println("Numar petale: " + nrPetale);
        System.out.println("Zona climatica: " + zonaClima + "\n");
    }

    public static void main(String args[]) {
        Floare floare1=new Floare("narcisa",7);
        Floare floare2=new Floare("orhidee",30,"tropicala");
        floare1.afisare();
        floare2.afisare();
    }
}
