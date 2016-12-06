/**
* Assignment 2 - Part 1
* @author Michael Lombardo 100588642
*/


public class SortingDriver {
  public static double[] generateRandomArray(int size) {
    double[] array = new double[size];
    for (int i = 0; i < array.length; i++) {
      array[i] = Math.random() * 100.0;
    }
    return array;
  }
  public static void main(String[] args) {
    int size = 100000;
    double[] array1 = generateRandomArray(size);
    double[] array2 = array1.clone();
    // algorithm #1
    Sorter bSorter = new BubbleSort();
    bSorter.sort(array1);
    System.out.println("Bubble Sort Operations: " + bSorter.getOpCount());
    // algorithm #2
    Sorter mSorter = new MergeSort();
    mSorter.sort(array2);
    System.out.println("Merge Sort Operations: " + mSorter.getOpCount());
  }
}
