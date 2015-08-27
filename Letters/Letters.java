/*
 * Jacob Ng
 * APCS
 * Letters
 * Aug. 27, 2015
 */
public class Letters{
    public static void main(String[] args){
        mom();
        System.out.println();
        dad();
        System.out.println();
        sibling();
    }
    public static void mom(){
        System.out.println("Dear Mom,");
        bodyParagraph();
        salutation();
    }
    public static void dad(){
        System.out.println("Dear Dad,");
        bodyParagraph();
        salutation();
    }
    public static void sibling(){
        System.out.println("Dear Sibling,");
        bodyParagraph();
        salutation();
    }
    public static void bodyParagraph(){
        System.out.println("\tHow are you? School is very fun and I am excited to to return home.");
        System.out.println("France is such a culture shock, but the food is amazing.");
    }
    public static void salutation(){
        System.out.println("Love,\nJacob and Nathan");
    }
}