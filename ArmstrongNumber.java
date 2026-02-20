import java.util.*;
public class ArmstrongNumber {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num= sc.nextInt();
        int originalNum= num;
        //count digits
        int count=0;
        int temp=num;
        while (temp !=0){
            temp=temp /10;
            count++;
        }

        //calculate sum of digits to the power of count
       
        int sum=0;
        temp=num;
        while(temp !=0){
            int digit= temp % 10;
            sum += Math.pow(digit, count);
            temp= temp/10;


        }
        if(originalNum== sum){
            System.out.println("Armstrong number");;
        }
        else{
            System.out.println("Not an armstrong number");;
        }
    }
}
