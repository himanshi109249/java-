public class Ceiling {
    public static void main (String[] args){
        int[] arr= {1,2,8,10,11,12,19};
        int target= 20;
        int ans= ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling (int[] arr, int target){
        //but what if the target is greater than the greatest number in the array
        if(target> arr[arr.length-1]){
            return -1;
        }
        int start=0;
        int end= arr.length-1;
        while(start<= end){
            int mid= start + (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]> target){
                end= mid-1;
            }
            else{
                start= mid+1;
            }
        }
        return start;
    }
}
