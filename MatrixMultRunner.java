//matrix multiplication
//By bsimps3... so don't try to sell it and make money off of it.


public class MatrixMultRunner{
     
     public static void main(String[] args){
          int[][] matrix1 = new int[10][10];
          int[][] matrix2 = new int[10][10];
          int[][] product;
          
          //setup matrix1 and matrix2 with loops
          //the elements of matrix1 should be the sum of the values of row and col (the top left element is 0,0)
          //the elements of matrix2 should be the product of the values of row and col
          
          for(int n = 0; n < matrix1.length; n++)
          {
            for(int m = 0; m < matrix1.length; m++)
              matrix1[n][m] = n + m;
          }
          for(int n = 0; n < matrix2.length; n++)
          {
            for(int m = 0; m < matrix2.length; m++)
              matrix2[n][m] = n * m;
          }
          
          product = MatrixMult.calculate(matrix1, matrix2);  //you must write a class MatrixMult with a method calculate() which returns the product of the matrices
          
          //print out the product matrix to check it by hand
       for(int[] n : matrix1)
       {
         for(int m : n)
           System.out.print( m + " ");
         System.out.println();
       }
                System.out.println();
          
       for(int[] n : matrix2)
       {
         for(int m : n)
           System.out.print( m + " ");
         System.out.println();
       }
                System.out.println();
          
       for(int[] n : product)
       {
         for(int m : n)
           System.out.print( m + " ");
         System.out.println();
       }
     }
}