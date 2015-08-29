/*
 * Jacob Ng
 * APCS
 * Letters (revised)
 * write multiple letters using static methods
 * Aug. 29, 2015
 */
public class Letters{
    public static void main(String[] args){
        mom();
        dad();
        sibling();
    }
    public static void mom(){
        System.out.println("Dear Mom,");
        bodyParagraphAndSalutation();
    }
    public static void dad(){
        System.out.println("Dear Dad,");
        bodyParagraphAndSalutation();
    }
    public static void sibling(){
        System.out.println("Dear Sibling,");
        bodyParagraphAndSalutation();
    }
    public static void bodyParagraphAndSalutation(){
        System.out.println("\tHow are you? School is very fun and I am excited to to return home.");
        System.out.println("France is such a culture shock, but the food is amazing.");
        System.out.println("Love,\nJacob\n");
    }
}