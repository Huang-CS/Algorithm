import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test
{
    public static void main (String[] args)
    {
            sortArray();
    }
    
    private static void sortArray()
    {
        int a[] = randomIntArray(20,100);
        System.out.println(Arrays.toString(a));
            
    }
    
    
    public static int[] randomIntArray(int length, int n)
   {  
      Random generator = new Random();
        int[] a = new int[length];      
      for (int i = 0; i < a.length; i++)
      {
         a[i] = generator.nextInt(n);//between 0 and n-1
      }
      
      return a;
   }
    
    
    
    private static void permutation()
    {
        Permutation input = new Permutation("abcd");
        ArrayList<String> result = input.permutate();
        
        for(String s:result)
        {
            System.out.println(s);
        }   
    }
    
    
}
