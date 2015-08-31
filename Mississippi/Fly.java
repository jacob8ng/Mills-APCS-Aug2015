/*
 * Jacob Ng
 * APCS
 * Aug. 31, 2015
 * Fly (revised)
 */
public class Fly{
    public static void main(String[] args){
        fly();
        System.out.println();
        spider();
        System.out.println();
        bird();
        System.out.println();
        cat();
        System.out.println();
        horse();
    }
    public static void fly(){
        thereWas();
        System.out.println("fly,");
        die();
    }
    public static void spider(){
        thereWas();
        System.out.println("spider,");
        wriggled();
        die();
    }
    public static void bird(){
        thereWas();
        System.out.println("bird,");
        System.out.println("How absurd! to swallow a bird,");
        birdCatchSpider();
        wriggled();
        die();
    }
    public static void cat(){
        thereWas();
        System.out.println("cat,");
        System.out.println("Imagine that! to swallow a cat,");
        catCatchBird();
        birdCatchSpider();
        wriggled();
        die();
    }
    public static void horse(){
        thereWas();
        System.out.println("horse,");
        System.out.println("She's dead - of course!");
    }
    public static void thereWas(){
        System.out.print("There was an old woman who swallowed a ");
    }
    public static void catCatchBird(){
        System.out.println("She swallowed the cat to catch the bird,");
    }
    public static void birdCatchSpider(){
        System.out.println("She swallowed the bird to catch the spider,");
    }
    public static void wriggled(){
        System.out.println("That wriggled and jiggled and tickled inside her,");
        System.out.println("She swallowed the spider to catch the fly,");
    }
    public static void die(){
        System.out.println("I don't know why she swallowed a fly,");
        System.out.println("Perhaps she'll die.");
    }
}