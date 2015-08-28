/*
 * Jacob Ng
 * APCS
 * The Twelve Days of Christmas
 * Aug. 27, 2015
 */
public class Christmas{
    public static void main(String[] args){
        firstDay();
        secondDay();
        thirdDay();
        fourthDay();
        fifthDay();
        sixthDay();
        seventhDay();
        eighthDay();
        ninthDay();
        tenthDay();
        eleventhDay();
        twelfthDay();
    }
    public static void firstDay(){
        System.out.println("On the first day of Christmas,");
        trueLove();
        partridge();
    }
    public static void secondDay(){
        System.out.println("On the second day of Christmas,");
        trueLove();
        turtleDoves();
    }
    public static void thirdDay(){
        System.out.println("On the third day of Christmas,");
        trueLove();
        frenchHens();
    }
    public static void fourthDay(){
        System.out.println("On the fourth day of Christmas,");
        trueLove();
        callingBirds();
    }
    public static void fifthDay(){
        System.out.println("On the fifth day of Christmas,");
        trueLove();
        goldenRings();
    }
    public static void sixthDay(){
        System.out.println("On the sixth day of Christmas,");
        trueLove();
        geeseALaying();
    }
    public static void seventhDay(){
        System.out.println("On the seventh day of Christmas,");
        trueLove();
        swansASwimming();
    }
    public static void eighthDay(){
        System.out.println("On the eighth day of Christmas,");
        trueLove();
        maidsAMilking();
    }
    public static void ninthDay(){
        System.out.println("On the ninth day of Christmas,");
        trueLove();
        ladiesDancing();
    }
    public static void tenthDay(){
        System.out.println("On the tenth day of Christmas,");
        trueLove();
        lordsALeaping();
    }
    public static void eleventhDay(){
        System.out.println("On the eleventh day of Christmas,");
        trueLove();
        pipersPiping();
    }
    public static void twelfthDay(){
        System.out.println("On the twelfth day of Christmas,");
        trueLove();
        drummersDrumming();
    }
    public static void trueLove(){
        System.out.println("my true love sent to me");
    }
    public static void partridge(){
        System.out.println("a partridge in a pear tree.\n");
    }
    public static void turtleDoves(){
        System.out.println("two turtle doves, and");
        partridge();
    }
    public static void frenchHens(){
        System.out.println("three French hens,");
        turtleDoves();
    }
    public static void callingBirds(){
        System.out.println("four calling birds,");
        frenchHens();
    }
    public static void goldenRings(){
        System.out.println("five golden rings,");
        callingBirds();
    }
    public static void geeseALaying(){
        System.out.println("six geese a-laying,");
        goldenRings();
    }
    public static void swansASwimming(){
        System.out.println("seven swans a-swimming,");
        geeseALaying();
    }
    public static void maidsAMilking(){
        System.out.println("eight maids a-milking,");
        swansASwimming();
    }
    public static void ladiesDancing(){
        System.out.println("nine ladies dancing,");
        maidsAMilking();
    }
    public static void lordsALeaping(){
        System.out.println("ten lords a-leaping,");
        ladiesDancing();
    }
    public static void pipersPiping(){
        System.out.println("eleven pipers piping,");
        lordsALeaping();
    }
    public static void drummersDrumming(){
        System.out.println("Twelve drummers drumming,");
        pipersPiping();
    }
}