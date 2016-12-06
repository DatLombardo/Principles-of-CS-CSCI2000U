import monsterBattle.*;
import javax.swing.JOptionPane;

public class GameDriver{
  public static void main(String[] args){
    Move move1 = new Move("Vine Whip", "Grass", 45, 1.0f);
    Move move2 = new Move("Tackle", "Normal", 50, 1.0f);
    Move move3 = new Move("Take Down", "Normal", 90, 0.85f);
    Move move4 = new Move("Razor Leaf", "Grass", 55, 0.95f);
    Monster monster = new Monster("Bulbasaur", "Grass",
                                  240, 45, 49,49,
                                  move1, move2, move3, move4);
    Player player = new HumanPlayer(monster);

    move1 = new Move("Scratch", "Fire", 40, 1.0f);
    move2 = new Move("Ember", "Fire", 40, 1.0f);
    move3 = new Move("Peck", "Flying", 35, 1.0f);
    move4 = new Move("Fire Spin", "Fire", 35, 0.85f);
    monster = new Monster("Torchic", "Fire",
                                  240, 45, 60,40,
                                  move1, move2, move3, move4);
    Player enemy = new CPUPlayer(monster);
    JOptionPane.showMessageDialog(null, "Player: " +
            player.getMonster().getName() + ".. I choose you!\nEnemy: " +
            enemy.getMonster().getName() + ".. I choose you!");

    while((!player.hasLost()) && (!enemy.hasLost())){
      JOptionPane.showMessageDialog(null, " " + player.getMonster().getName()
                          + " has " + player.getMonster().getHP() + " HP\n" +
                          enemy.getMonster().getName() + " has " +
                          enemy.getMonster().getHP() + " HP\n");

      int playerMove = player.chooseMove();
      int enemyMove = enemy.chooseMove();

      if (player.isFasterThan(enemy)){
        player.attack(enemy, playerMove);
        if (!enemy.hasLost()){
          enemy.attack(player, enemyMove);
        }
      } else{
        enemy.attack(player, enemyMove);
        if(!player.hasLost()){
          player.attack(enemy, playerMove);
        }
      }
    }
    if (player.hasLost()){
      JOptionPane.showMessageDialog(null,player.getMonster().getName()
                        + " has fainted!");
      JOptionPane.showMessageDialog(null, "You and " +   player.getMonster().getName()
                        + " has lost the battle. \n");

    }else{
      JOptionPane.showMessageDialog(null, enemy.getMonster().getName()
                        + " has fainted!");
      JOptionPane.showMessageDialog(null, "You and " + player.getMonster().getName()
                        + " are victorious!\n");

    }
  }
}
