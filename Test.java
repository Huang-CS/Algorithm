import java.util.ArrayList;

public class Test
{
    public static void main (String[] args)
    {
        Permutation input = new Permutation("abcd");
        ArrayList<String> result = input.permutate();
        
        for(String s:result)
        {
            System.out.println(s);
        }
        
    }
}
