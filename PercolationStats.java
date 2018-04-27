import java.util.Random;

public class PercolationStats {
    
    private double[]    threshold;

    // perform T independent computational experiments on an N-by-N grid
    public PercolationStats(int N, int T) 
    {
        Random rand = new Random();

        int openCount, row, column;

        if (N <= 0 || T <= 0)
            throw new IllegalArgumentException("Arguments out of bound");

        threshold = new double[T];
        
        openCount = 0;
        for (int i = 0; i < T; i++) {
            Percolation pl = new Percolation(N);
            do {
                row     = rand.nextInt(N) + 1;
                column  = rand.nextInt(N) + 1;
                if (pl.isOpen(row, column))
                    continue;
                pl.open(row, column);
                openCount++;
            } while (!pl.percolates());

            threshold[i] = (double) openCount / (N * N);
            openCount = 0;
            System.out.printf("threshold[%03d] = %f\n", i, threshold[i]);
        }
    }

    // sample mean of percolation threshold
    public double mean() {
        int length = threshold.length;
        double sum=0;
        
        for(int i =0; i<length; i++)
        {
          sum += threshold[i];
        }
        return sum/length;
    }


    

   
    
    // test client, described below
    public static void main(String[] args) {
        PercolationStats pls = new PercolationStats(Integer.parseInt(args[0]),
                    Integer.parseInt(args[1]));

        System.out.printf("mean                     = %f\n", pls.mean());

    }
}