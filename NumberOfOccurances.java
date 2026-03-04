import java.util.*;
public class NumberOfOccurances {
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number : " );
        int num= sc.nextInt();
        System.out.println("Enter a digit to find its occurances : ");
        int digit= sc.nextInt();
        int count=0;
        while(num !=0){
            int temp= num%10;
            if(temp == digit){
                count++;
            }
            int temp2= num/10;
            num=temp2;
        }
        System.out.println(count);
    }
}
