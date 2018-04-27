import java.util.Random;

public class Practice {
    
   

    

   
    
    // test client, described below
    public static void main(String[] args) 
    {
        Random rand = new Random();

    
        for (int i = 0; i < 10; i++) {
            System.out.printf(rand.nextInt(6)+"\n");
        }
    }
}