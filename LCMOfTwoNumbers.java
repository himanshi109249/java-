import java.util.*;
public class LCMOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a= sc.nextInt();
        System.out.println("Enter the second number: ");
        int b= sc.nextInt();
        int num1= a, num2=b;
        while(num2 != 0){
            int rem= num1 % num2;
            num1= num2;
            num2= rem;
        }
        int gcd= num1;
        int lcm= (a*b)/gcd;
        System.out.println(lcm);
    }
}
