/**
* Assignment 2 - Part 3
* @author Michael Lombardo 100588642
*/

/**
* Root class of Expression Tree
*/
public class ExpressionTree{
  public OpNode expression;
  public ExpressionTree(OpNode expression_){
    this.expression = expression_;
  }
  /**
  * Evaluate whole expression, broken down by the OpNode
  * @return double final result of whole expression
  */
  public double evaluate(){
    double result = 0.0;
    result = this.expression.evaluate();
    return result;
  }
  /**
  * Recursively prints out tree
  */
  public void print(){
    this.expression.print(0);
  }
}
