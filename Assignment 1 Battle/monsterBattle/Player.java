
package monsterBattle;
import javax.swing.JOptionPane;
import java.util.*;

public abstract class Player{
  protected Monster monster;
  /**
  * Genereal Constructor for player class
  * @param Monster pass in current instance of monster to be
  *      called and manipulated
  */
  public Player(Monster monster){
    this.monster = monster;
  }
  /**
  * Determines if monster has been defeated depending on their hp
  * @return true monster is defeated (hp =< 0 )
  * @return false monster is alive (hp > 0)
  */
  public boolean hasLost(){
    if(monster.hp > 0){
      return false;
    }
    return true;
  }
  /**
  * Passes back current monster instance
  * @return Monster instance of monster
  */
  public Monster getMonster(){
    return this.monster;
  }
  /**
  * Abstract class to be overwritten depending on player type
  */
  public abstract int chooseMove();
  /**
  * Determines which player's monster is faster
  * @param Player opposing player's instance
  * @return true current player is faster than enemy
  * @return false enemy is faster than current player
  */
  public boolean isFasterThan (Player enemy){
      if (monster.speed >= enemy.monster.speed){
        return true;
      }else{
        //If Speed is equal, higher HP attacks first
        if (monster.hp >= enemy.monster.hp){
          return true;
        }
        return false;
      }
    }
  /**
  * Worker class for attacking simulation
  * Uses switch-case's to determine which attack/potion to use, ending
  * calculation using RNG to determine if attack is a special attack.
  *
  * @param enemy enemy player instance
  * @param enemyMove integer value of enemy move chosen
  *
  */
  public void attack(Player enemy, int enemyMove){
    float damageDealth = 0;
    boolean willAttack = false;
    float ifAttack = 0;
    float superEff = 0;
    float notEff = 0;
    Random randNum = new Random();
    String attackName = "";
    switch(enemyMove){
        case 1: damageDealth = (monster.attack + monster.move1.power - enemy.monster.defense);
          attackName = monster.move1.name;
          ifAttack = randNum.nextFloat() * 1.0f;
          if (monster.move1.accuracy > ifAttack){
            willAttack = true;
          }
          break;
        case 2: damageDealth = (monster.attack + monster.move2.power - enemy.monster.defense);
          attackName = monster.move2.name;
          ifAttack = randNum.nextFloat() * 1.0f;
          if (monster.move2.accuracy > ifAttack){
            willAttack = true;
          }
          break;
        case 3: damageDealth = (monster.attack + monster.move3.power - enemy.monster.defense);
          attackName = monster.move3.name;
          ifAttack = randNum.nextFloat() * 1.0f;
          if (monster.move3.accuracy > ifAttack){
            willAttack = true;
          }
          break;
        case 4: damageDealth = (monster.attack + monster.move4.power - enemy.monster.defense);
          attackName = monster.move4.name;
          ifAttack = randNum.nextFloat() * 1.0f;
          if (monster.move4.accuracy > ifAttack){
            willAttack = true;
          }
          break;
        case 5: willAttack = false;
          monster.hp += 50;
          JOptionPane.showMessageDialog(null, monster.name
                        + " was healed 50 HP by a healing potion!!");
      //Check if attack commits
      }
      if (willAttack){
        superEff = randNum.nextFloat() * 1.0f;
        notEff = randNum.nextFloat() * 1.0f;
        if (superEff < 0.1f){
          JOptionPane.showMessageDialog(null, monster.name + " uses " + attackName
                            + "! It is super effective!!!");
          enemy.monster.hp -= (damageDealth*1.5f);
        }else if(notEff > 0.9f && superEff >= 0.1f){
          //Not effective attack
          JOptionPane.showMessageDialog(null, monster.name + " uses " + attackName
                          + ".. It was not effective..");
          enemy.monster.hp -= (damageDealth*0.5f);
        }else{
          JOptionPane.showMessageDialog(null, monster.name + " uses " + attackName + "..!!");
          enemy.monster.hp -= damageDealth;
        }
      }else{
        JOptionPane.showMessageDialog(null, "No Attack Used.");
      }


  }

}
