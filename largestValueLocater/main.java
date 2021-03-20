import java.util.Scanner;
//Created by Matthew Knight - 02/16/2021
//The purpose of this program is to determine the largest value in an array of values. The program is designed for numerical values only. Cuuld be modified for strings by using the string length function or by coverting the strings to cahracter arrays.

public class Main{

 public static void main(String[] args) {
      Scanner get = new Scanner (System.in);
      int numRow = 0;
      int numCol = 0;


      System.out.println("Enter the number of rows and columns in the array: ");

      numRow = get.nextInt();
      numCol = get.nextInt();

      double [][] arr = new double [numRow][numCol];

    System.out.println("Enter the array: ");

    for (int row = 0; row < numRow; row++){
      for (int col = 0; col < numCol; col ++){
        arr [row][col] = get.nextDouble();
      }
    }


    System.out.println("The location of the largest value is: " + locateTarget(arr).getMaxValue() + " at (" + locateTarget(arr).getRow() + ", " + locateTarget(arr).getCol() + ")");

  }

   public static Location locateTarget(double [][] a){
    double maxValue = 0.0;
    int rowMax = 0;
    int colMax = 0;
  for ( int row = 0; row < a.length; row++){
    for ( int col = 0; col < a[row].length; col++){
      if (maxValue < a[row][col]){
        maxValue = a[row][col];
        rowMax = row;
        colMax = col;
      }
    }
  }
  Location location = new Location (maxValue, rowMax,colMax);
  return location;

  }
}
