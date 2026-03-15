public class LargeInArray {
    public static void main (String[] args){
        int[] nums= {1,2,3,99,5,6,7};
        int ans= largestNumber(nums);
        System.out.println(ans);
    }
    static int largestNumber(int[] arr){
        int maximum=arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]> maximum){
                maximum=arr[i];
            }
        }
        return maximum;
    }
}
