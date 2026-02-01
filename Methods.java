class Calculator
{
    public void playMusic()
    {
        System.out.println("Playing Music...");
    }

    public String getMeAPen(int cost)
    {
        if(cost>=10)
        {
            return "pen";
        }else{
            return "Nothing";
        }
        
    }
}

public class Methods {
    public static void main(String args[])
    {
        Calculator obj= new Calculator();
        obj.playMusic();
        String str= obj.getMeAPen(5);
        System.out.println(str);
    }
}
