import java.util.*;
import java.util.Arrays;
public class Input {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr= new int[5];
        //taking input for arrays
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        //printing the array
        // System.out.println(Arrays.toString(arr));

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ "  ");
        }
    }
}
