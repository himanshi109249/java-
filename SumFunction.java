import java.util.*;
public class SumFunction {
    public static void main (String[] args){
        // int ans= sum(10,20);
        // System.out.println(ans);

        int result = sum2();
        System.out.println(result);
    }

    static int sum(int a ,  int b){
        int sum= a +b;
        return sum;
    }

    static int sum2(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter first number : ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number : ");
        int num2= sc.nextInt();
        int sum=num1+ num2;
        return sum;
    }
}
