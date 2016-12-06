package monsterBattle;

public class Monster{
  protected String name, type;
  protected int hp, speed, attack, defense;
  protected Move move1, move2, move3, move4;
  public Monster(String name, String type, int hp, int speed, int attack,
                int defense, Move move1, Move move2, Move move3, Move move4){
    this.name = name;
    this.type = type;
    this.hp = hp;
    this.speed = speed;
    this.attack = attack;
    this.defense = defense;
    this.move1 = move1;
    this.move2 = move2;
    this.move3 = move3;
    this.move4 = move4;
  }
  public String getName(){
    return this.name;
  }
  public int getHP(){
    return this.hp;
  }
}
