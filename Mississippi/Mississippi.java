/*
 * Jacob Ng
 * APCS
 * Aug. 25, 2015
 * Mississippi
 */
public class Mississippi{
    public static void main(String[] args){
        m();
        i();
        s();
        s();
        i();
        s();
        s();
        i();
        p();
        p();
        i();
    }
    public static void m(){
        twoM();
        System.out.println("MM   MM");
        System.out.println("M M M M");
        System.out.println("M  M  M");
        twoM();
        twoM();
        twoM();
    }
    public static void twoM(){
        System.out.println("M     M");
    }
    public static void i(){
        fiveI();
        System.out.println("   I");
        System.out.println("   I");
        System.out.println("   I");
        System.out.println("   I");
        System.out.println("   I");
        fiveI();
    }
    public static void fiveI(){
        System.out.println(" IIIII");
    }
    public static void s(){
        fiveS();
        twoS();
        System.out.println("S");
        fiveS();
        System.out.println("      S");
        twoS();
        fiveS();
    }
    public static void fiveS(){
        System.out.println(" SSSSS");
    }
    public static void twoS(){
        System.out.println("S     S");
    }
    public static void p(){
        sixP();
        twoP();
        twoP();
        sixP();
        System.out.println("P");
        System.out.println("P");
        System.out.println("P");
    }
    public static void sixP(){
        System.out.println("PPPPPP");
    }
    public static void twoP(){
        System.out.println("P     P");
    }
}