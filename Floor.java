public class Floor {
    public static void main (String[] args){
        int[] arr= {1,2,8,10,11,12,19};
        int target= -2;
        int ans= floor(arr, target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        //but what if the target element is smaller than the smallest number in the array
        if(target<arr[0]){
            return -1;
        }
        int start= 0;
        int end= arr.length-1;
        while(start<=end){
            int mid= start+ (end-start)/2;
            if(arr[mid]== target){
                return mid;
            }else if(arr[mid]>target){
                end= mid-1;
            }else {
                start= mid+1;
            }
            
        }
        return end;
    }
}
