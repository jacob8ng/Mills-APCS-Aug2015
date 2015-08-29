/*
 * Jacob Ng
 * APCS
 * Aug. 29, 2015
 * Mississippi (revised)
 * spell Mississippi using static methods
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
        middleI();
        middleI();
        middleI();
        middleI();
        middleI();
        fiveI();
    }
    public static void fiveI(){
        System.out.println(" IIIII");
    }
    public static void middleI(){
        System.out.println("   I");
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
        singleP();
        singleP();
        singleP();
    }
    public static void sixP(){
        System.out.println("PPPPPP");
    }
    public static void twoP(){
        System.out.println("P     P");
    }
    public static void singleP(){
        System.out.println("P");
    }
}