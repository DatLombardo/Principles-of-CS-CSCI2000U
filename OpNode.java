/**
* Assignment 2 - Part 3
* @author Michael Lombardo 100588642
*/

/**
* Interface of ExpressionTree node for nodes with operations and values
*/
public class OpNode implements TreeNode{
  public String operation;
  public TreeNode left;
  public TreeNode right;
  /**
  * Declares a new OpNode
  * @param left_ left child of Operation
  * @param operation Required operation of two children, / * + -
  * @param right_ right child of Operation
  */
  public OpNode(TreeNode left_, String operation_, TreeNode right_){
    this.left = left_;
    this.operation = operation_;
    this.right = right_;
  }
  
  /**
  * Recursively prints out tree
  * @param depth current depth of tree, stored in the recursive trace
  */
  public void print(int depth){
    this.right.print(depth+1);
    for (int i = 0; i <= depth-1; i++){
      System.out.print("\t");
    }
    System.out.print(this.operation + "\n");
    this.left.print(depth+1);
  }

  /**
  * Evaluate OpNode expression, recursively computed through the tree
  * @return double final result of the expression
  */
  public double evaluate(){
    int op = 0;
    double result = 0.0;
    if (this.operation == "/"){op = 1;}
    else if (this.operation == "*"){op = 2;}
    else if (this.operation == "+"){op = 3;}
    else if (this.operation == "-"){op = 4;}
    switch (op) {
        case 1:
            result = this.left.evaluate() / this.right.evaluate();
            break;
        case 2:
            result = this.left.evaluate() * this.right.evaluate();
            break;
        case 3:
            result = this.left.evaluate() + this.right.evaluate();
            break;
        case 4:
            result = this.left.evaluate() - this.right.evaluate();
            break;
    }
    return result;
  }
}
