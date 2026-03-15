public class SmallInArray {
    public static void main (String[] args){
        int[] arr= {4,5,1,2,7,8};
        int ans= smallestNumber(arr);
        System.out.println(ans);
    }
    static int smallestNumber(int[] arr){
        int minimum= arr[0];
        for(int i=0; i<=arr.length-1; i++){
             
            if( minimum>arr[i]){
                minimum= arr[i];
                
            }
            
        }
        
        return minimum;
    }
}
