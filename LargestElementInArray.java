import java.util.Arrays;
class Solution{
    public static int sortArr (int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
}
public class LargestElementInArray {
    public static void main(String[] args){
        int[] arr= {5,2,7,9,4,1};
    System.out.println(Solution.sortArr(arr));   
}
}
