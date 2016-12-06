package monsterBattle;
public class Move{
  protected String name, type;
  protected int power;
  protected float accuracy;
  /**
  * General Constructor of Move class, instantiates all abilities / names
  * @param name name of move
  * @param type type of move
  * @param power integer of power of the move
  * @param accuarcy float value of accuracy perecentage of move
  */
  public Move(String name, String type, int power, float accuracy){
    this.name = name;
    this.type = type;
    this.power = power;
    this.accuracy = accuracy;
  }
}
