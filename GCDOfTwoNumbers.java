import java.util.*;
public class GCDOfTwoNumbers {

    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the first number: ");
        int a= sc.nextInt();
        System.out.println("enter the second number: ");
        int b= sc.nextInt();
        while(b!=0){
            int rem= a%b;
            a=b;
            b=rem;
        }
        System.out.println(a);
    }
}
