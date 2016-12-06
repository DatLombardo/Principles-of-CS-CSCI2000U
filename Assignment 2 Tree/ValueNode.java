/**
* Assignment 2 - Part 3
* @author Michael Lombardo 100588642
*/

/**
* Interface of ExpressionTree node for nodes with only values
*/
public class ValueNode implements TreeNode{
  public double value = 0.0;

  /**
  * Declares a new ValueNode
  * @param value_ numeric double value
  */
  public ValueNode(double value_){
    this.value = value_;
  }
  
  /**
  * Recursively prints out tree
  * @param depth current depth of tree, stored in the recursive trace
  */
  public void print(int depth){
    for (int i = 0; i <= depth-1; i++){
      System.out.print("\t");
    }
    System.out.print(this.value + "\n");
  }

  /**
  * Passes back value of node, no evaluation required
  * @return double value of node
  */
  public double evaluate(){
    return this.value;
  }
}
