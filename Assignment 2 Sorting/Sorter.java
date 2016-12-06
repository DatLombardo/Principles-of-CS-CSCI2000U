/**
* Assignment 2 - Part 1
* @author Michael Lombardo 100588642
*/

/**
* Abstract definition for Sorter, implemented in Bubble sort or Merge Sort
*
*/
public abstract class Sorter {
  private long opCount;
  /**
  * Genereal Constructor of Sorter class
  */
  public Sorter(){
    opCount = 0L;
  }
  public long getOpCount() {
    return this.opCount;
  }
  protected void resetOpCount() {
    this.opCount = 0L;
  }
  protected void countOp() {
    this.opCount++;
  }
  public abstract double[] sort(double[] list);
}
