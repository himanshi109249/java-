import java.util.*;
import java.util.ArrayList;
public class ArrayListExample {
    public static void main (String[] args){
        ArrayList<Integer> list = new ArrayList<>(5);
        //input
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<5; i++){
            list.add(sc.nextInt());
        }
        //output
        for(int i=0; i<5; i++){
            System.out.println(list.get(i));
            //pass index here, list[index] will not work
        }
        System.out.println(list);
    }
}
