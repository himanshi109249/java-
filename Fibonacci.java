import java.util.*;
public class Fibonacci{
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int sum=0;
        for(int i=1; i<=n; i++){
            sum=a+b;
            a=b;
            b=sum;
            System.out.println(sum);
        }
        System.out.println("Fibonacci of" + n+ " is : " + sum);
    }
}