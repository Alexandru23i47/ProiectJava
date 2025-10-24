public class Vehicul {
    public String categoria;
    public String marca;
    public int nrRoti;
    public boolean aerCond;
    public boolean volan;

    public Vehicul (String nume, boolean aerCond) {
        categoria = "automobil";
        marca = nume;
        nrRoti = 4;
        this.aerCond = aerCond;
        volan = true;
    }
    public Vehicul(String nume) {
        categoria = "bicicleta ";
        marca = nume;
        nrRoti = 2;
        aerCond = false;
        volan = false;
    }
    public void afisare(){
        System.out.println("Categoria vehicul " + categoria);
        System.out.println("Denumire " + categoria + ": " + marca);
        System.out.println("Nr roti: " + nrRoti);
        System.out.print("Aer conditionat: ");
        if(aerCond)
            System.out.println("da");
        else
            System.out.println("nu");
        System.out.print("Volan: ");
        if(volan)
            System.out.println("da");
        else
            System.out.println("nu");
        System.out.print("\n");
    }
    public static void main(String args[]){
        Vehicul b1,m1,m2;
        b1=new Vehicul("Pegas");
        m1=new Vehicul("Dacia",false);
        m2=new Vehicul("Cielo", true);
        b1.afisare();
        m1.afisare();
        m2.afisare();
    }
}
