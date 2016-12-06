/**
* Assignment 2 - Part 1
* @author Michael Lombardo 100588642
*/


/**
* Bubble sort definition
*/
public class BubbleSort extends Sorter{
  /**
  * Genereal Constructor of Bubblesort class
  */
  public BubbleSort(){
    super();
  }
  /**
  * Sorts the list using bubble sort
  * @param data unsorted list of data
  * @return double[] sorted list
  */
  public double[] sort(double[] data) {
  for (int pass = 1; pass < data.length; pass++) {
    for (int element=0;element<data.length-1;element++) {
      if (data[element] > data[element + 1]){
        double hold = data[element];
        this.countOp();
        data[element] = data[element + 1];
        this.countOp();
        data[element + 1] = hold;
        this.countOp();
      }
    }
   }
   return data;
  }
}
