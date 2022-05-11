public class DVD {

    /*

    DVD

    - nazovFilmu, farbaObalu

    - všetky majú rovnakú veľkosť (v GB) a zančku

    - konštruktor, gettery, settery, toString

     */



    private String aNazovFilmu;

    private String aFarbaObalu;



    private static double aVelkost; //= 4.7;

    private static String aZnacka; //= "Verbatin";



    //Blok pre statické atribúty

    static {

        aVelkost = 4.7;

        aZnacka = "Verbatin";

        System.out.println("Teraz sa vykonal statický blok");

    }



    public DVD(String aNazovFilmu, String aFarbaObalu) {

        this.aNazovFilmu = aNazovFilmu;

        this.aFarbaObalu = aFarbaObalu;

    }



    public String getaNazovFilmu() {

        return aNazovFilmu;

    }



    public void setaNazovFilmu(String aNazovFilmu) {

        this.aNazovFilmu = aNazovFilmu;

    }



    public String getaFarbaObalu() {

        return aFarbaObalu;

    }



    public void setaFarbaObalu(String aFarbaObalu) {

        this.aFarbaObalu = aFarbaObalu;

    }



    public static double getaVelkost() {

        return aVelkost;

    }



    public static void setaVelkost(int aVelkost) {

        DVD.aVelkost = aVelkost;

    }



    public static String getaZnacka() {

        return aZnacka;

    }



    public static void setaZnacka(String aZnacka) {

        DVD.aZnacka = aZnacka;

    }



    @Override

    public String toString() {

        return "Názov filmu: " + aNazovFilmu + ", farba obalu: " + aFarbaObalu + " o veľkosti "

                + DVD.aVelkost + "GB značky " + DVD.aZnacka;

    }



    /*

    statické metóda: vypisVelkostAZnacku

     */



    public static void VypisVelkostAZnacku (){

        System.out.println("Veľkosť DVD je " + DVD.aVelkost + "GB");

        System.out.println("Značka je "+ DVD.aZnacka);

    }

}