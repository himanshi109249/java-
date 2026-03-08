import java.util.Arrays;
public class SearchIn2DArray {
    public static void main (String[] args){
        int[][] arr={
            {1,2,3,4},
            {5,6,8},
            {7,43,30}
        };
        int target= 21;
        int[] ans= search(arr, target);
        System.out.println(Arrays.toString(ans));
        System.out.println(maxValue(arr));
    }
    static int[] search(int[][] arr, int target){
        for(int row=0; row<arr.length; row++){
            for(int col=0; col<arr[row].length; col++){
                if(arr[row][col]== target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int maxValue(int[][] arr){
        int max= arr[0][0];
        // for(int row=0; row<arr.length; row++){
        //     for(int col=0; col<arr[row].length; col++){
        //         if(arr[row][col]>max){
        //             max= arr[row][col];
        //         }
        //     }
        // }
        // return max;

        //using inhanced for loop
        for(int[] row: arr){
            for(int col: row){
                if(col>max){
                    max=col;
                }
            }
        }
        return max;
    }
}
