/**
* Assignment 2 - Part 1
* @author Michael Lombardo 100588642
*/

/**
* Merge sort definition
*/
public class MergeSort extends Sorter{
	/**
  * Genereal Constructor of MergeSort class
  */
	public MergeSort(){
    super();
  }
	/**
  * Uses merge sort to sort the list, continuously splits the list
  * @param a left side list of data
	* @param b right side list of data
  * @return double[] sorted list
  */
	private double[] merge(double[] a, double[] b) {
        double[] c = new double[a.length + b.length];
        int i = 0;
				this.countOp();
				int j = 0;
				this.countOp();
        for (int k = 0; k < c.length; k++) {
            if (i >= a.length){
							c[k] = b[j++];
							this.countOp();
						}else if (j >= b.length){
							c[k] = a[i++];
							this.countOp();
						}else if (a[i] <= b[j]){
							c[k] = a[i++];
							this.countOp();
						}else{
							c[k] = b[j++];
							this.countOp();
						}
        }
        return c;
    }
		/**
		* Initiates the computation of merge sort
		* @param input unsorted list
		* @return double[] sorted list
		*/
    public double[] sort(double[] input) {
        int len = input.length;
				this.countOp();
        if (len <= 1){
					return input;
				}
        double[] a = new double[len/2];
        double[] b = new double[len - len/2];
        for (int i = 0; i < a.length; i++){
            a[i] = input[i];
						this.countOp();
				}
        for (int i = 0; i < b.length; i++)
            b[i] = input[i + len/2];
						this.countOp();
        return merge(sort(a), sort(b));
    }
}
