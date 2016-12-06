package monsterBattle;
import javax.swing.JOptionPane;

public class HumanPlayer extends Player{
  /**
  * Genereal constructor for human player class, passes monster back to Player
  * for instantiation
  * @param monster current monster instance
  */
  public HumanPlayer(Monster monster){
    super(monster);
  }
  /**
  * Displays availiable options for player to select desired move / potion.
  * @return int Number between 1-5 for move selected; if user closes
  *         JOptionPane, move will be considred null, and registered as a miss.
  */
  public int chooseMove(){
    int selMove = 0;
    String[] moveList = {monster.move1.name, monster.move2.name,
                        monster.move3.name, monster.move4.name,
                        "Use Healing Potion"};

    Object moveChoice = JOptionPane.showInputDialog(null, "Select your move",
              "Move Selector", JOptionPane.QUESTION_MESSAGE, null, moveList, moveList[0]);
    if(moveChoice == monster.move1.name){
          selMove = 1;
    }
    else if(moveChoice == monster.move2.name){
          selMove = 2;
    }
    else if(moveChoice == monster.move3.name){
          selMove = 3;
    }
    else if(moveChoice == monster.move4.name){
          selMove = 4;
    }
    else if(moveChoice == "Use Healing Potion"){
          selMove = 5;
    }
  return selMove;
  }


}
