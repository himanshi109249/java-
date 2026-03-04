import java.util.*;
public class Typecasting {
    public static void main(String[] args){
        //left side should be greater than the right side
        //float is greater than int as float can store int value and decimal value
        //while int can only store whole number
        Scanner sc= new Scanner(System.in);
        // System.out.println("Enter a number: ");
        // float num= sc.nextFloat();
        // System.out.println(num);

        //type casting
        // int num= (int)(67.56f);
        // System.out.println(num);

        //automatic type promotion in expression
        int a=257;
        byte b=(byte)(a);//it's giving modulo of 257 % 256=1
        System.out.println(b);

        //all the byte, short and char values are promoted to integers
        
    }
}
