public class SearchInRange {
    public static void main (String[] args){
        int[] arr= {18,24,1,3,98,67};
        int target= 1;
        int ans= searchRange(arr, 1, 4, target);
        System.out.println(ans);
    }
    static int searchRange(int[] arr, int start, int end, int target){
        if(arr.length== 0){
            return -1;
        }
        for(int i=start; i<=end; i++){
            if(arr[i]== target){
                return i;
            }
        }
        return -1;
    }
}
