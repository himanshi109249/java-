import java.util.*;
public class StringExample {
    public static void main ( String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter your name : ");
        String naam = sc.next();
        String personalised = myGreet(naam);
        System.out.println(personalised);
    }

    static String myGreet(String name){
        String message= "Hello " + name;
        return message;
    }
}
