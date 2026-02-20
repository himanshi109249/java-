import java.util.*;
public class CountVowelsProgram {
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        int vowels=0, consonents=0, spaces=0;
        for(int i=0; i<str.length(); i++){
            char ch=str.charAt(i);
            if(ch == ' '){
                spaces++;
            }else if(ch>='a' && ch<='z'){
                if(ch=='a'|| ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                    vowels++;
                }else{
                    consonents++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonents);
        System.out.println(spaces);
    }
}
