public class Ceiling {
    public static void main (String[] args){
        int[] arr= {1,2,8,10,11,12,19};
        int target= 5;
        int ans= ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling (int[] arr, int target){
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
