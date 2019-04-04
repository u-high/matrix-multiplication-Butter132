public class MatrixMult
{

  //int temp1= 0;
 // int temp2= 0;
  public static int[][] calculate(int[][] m1, int[][] m2)
  {
    int sum = 0;
    int[][] ans = new int[m1.length][m2.length];
    for(int n = 0; n < m1.length; n++)
    {
      for(int m = 0; m < m1.length; m++)
      {
        for(int o = 0; o < m1.length; o++)
        {
          sum += m1[o][m] * m2[m][o];
          System.out.println("" + sum);
        }
        ans[n][m] = sum;
        sum = 0;
      }
    }
    return ans;
  }
}
    