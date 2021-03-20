
//Created by Matthew Knight - 02/16/2021
//class used by the program to locate the position of the largest value of an array with several functions


public class Location{

  private int row;
  private int column;
  private double maxValue;

  public Location(double a, int rowPos, int colPos){
    maxValue = a;
    row = rowPos;
    column = colPos;

  }

  public double getMaxValue(){
    return this.maxValue;
  }

  public int getRow(){
    return row;

  }

  public int getCol(){
    return column;
  }


}
