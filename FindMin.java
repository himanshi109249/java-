public class FindMin {
    public static void main (String[] args){
        int[] arr= {2,6,1,9,-1,-10,4,5};
        System.out.println(minValue(arr));
        
    }
    static int minValue(int[] arr){
        int min= arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        return min;
        }

}
