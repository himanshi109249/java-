import java.util.*;
public class Switch {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a fruit name : ");
        String fruit = sc.next();
        switch(fruit){
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("A sweet red fruit");
            case "orange" -> System.out.println("round fruit");
            case "grapes" -> System.out.println("small round fruit");
            default -> System.out.println("Please enter a valid fruit name");
        }
    }
}
