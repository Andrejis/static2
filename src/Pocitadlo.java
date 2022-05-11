public class Pocitadlo {

    /*

    nestatické číslo

    statické číslo

    obidve nastavíme najskôr na 0

    v koštruktore zvyšujeme obidve o +1  a vypíšeme obe

     */



    private int aCislo1 = 0;

    private static int aCislo2;



    static {

        aCislo2 = 0;

    }



    public Pocitadlo() {

        aCislo1++;

        Pocitadlo.aCislo2++;

        System.out.println("Nestatické: " + aCislo1);

        System.out.println("Statické: " + Pocitadlo.aCislo2);

    }

    /*

    statická metóda: vypíše celou vetou, aké je statické číslo

     */



    public static void vypisStatickeCislo(){

        System.out.println("Statické číslo je: " + Pocitadlo.aCislo2);

    }

}