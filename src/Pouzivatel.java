import javax.swing.*;



public class Pouzivatel {

    /*

    meno, heslo, prihlaseny/neprihlaseny

    minimálna dĺžka hesla, počet pouzívateľov

     */



    private String aMeno;

    private String aHeslo;

    private boolean aPrihlaseny;

    private int aID;



    private static int aMinimalnaDlzkaHesla;

    private static int aPocetPouzivatelov;



    static {

        aMinimalnaDlzkaHesla = 8;

        aPocetPouzivatelov = 0;

    }



    public Pouzivatel(String aMeno, String aHeslo) {

        this.aMeno = aMeno;

        this.aHeslo = aHeslo;

        this.aPrihlaseny = false;

        if(!overDlzkuHesla()){

            JOptionPane.showMessageDialog(null, "Heslo musí mať aspoň 8 znakov");

            this.aHeslo = JOptionPane.showInputDialog("Zadaj nové heslo!");

        }

        aPocetPouzivatelov++;

        System.out.println("Heslo je " + aHeslo);

        this.aID = aPocetPouzivatelov;

        System.out.println("Používateľ má ID " + aID);

    }

    private boolean overDlzkuHesla() {

        if(aHeslo.length() >= aMinimalnaDlzkaHesla){

            return true;

        }

        return false;

    }

}