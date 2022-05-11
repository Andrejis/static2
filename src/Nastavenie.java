//statické trieda - class ....... {

class Nastavenie {

    private static String aJazyk = "Sk";

    private static String aFarebnaSchema = "Default";

    private static int aFontVelkost = 20;



    public Nastavenie(){



    }



    public static String getaJazyk() {

        return aJazyk;

    }



    public static void setaJazyk(String aJazyk) {

        Nastavenie.aJazyk = aJazyk;

    }



    public static String getaFarebnaSchema() {

        return aFarebnaSchema;

    }



    public static void setaFarebnaSchema(String aFarebnaSchema) {

        Nastavenie.aFarebnaSchema = aFarebnaSchema;

    }



    public static int getaFontVelkost() {

        return aFontVelkost;

    }



    public static void setaFontVelkost(int aFontVelkost) {

        Nastavenie.aFontVelkost = aFontVelkost;

    }

}