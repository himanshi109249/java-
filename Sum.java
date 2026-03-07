import java.util.*;
public class Sum {
    public static void main ( String[] args){
        // sum();
        int result = sum2();
        System.out.println(result);
    }

    static int sum2(){
         Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int sum= num1 + num2;
        return sum;

    }

    static void sum(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2 = sc.nextInt();
        int sum= num1 + num2;
        System.out.println("Sum of two numbers is : " + sum);

    }
}
