import java.util.Arrays;
 class SmallestElementArray{
    public static int sortArr (int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }
}

public class SmallestElementInArray {
    public static void main(String[] args){
        int[] arr= {5,2,9,1,5,6};
    System.out.println(SmallestElementArray.sortArr(arr));
    }
    
    
}
