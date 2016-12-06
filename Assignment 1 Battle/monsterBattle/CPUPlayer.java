package monsterBattle;
import java.util.*;
public class CPUPlayer extends Player{
  /**
  * Genereal constructor for CPU player class, passes monster back to Player
  * for instantiation
  * @param monster current monster instance
  */
  public CPUPlayer(Monster monster){
    super(monster);
  }
  /**
  * Determines move selection using RNG.
  * @return int Selected move by CPU (RNG)
  */
  public int chooseMove(){
    Random randNum = new Random();
    //Random from 5 moves to consider potion healing.
    int selMove = randNum.nextInt((5 - 1) + 1) + 1;
    return selMove;
  }
}
