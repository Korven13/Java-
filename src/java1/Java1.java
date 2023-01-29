package java1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;

public class Java1 {

  static int enemyhp = 100;
  static int hp = 100;
  static int level = 1;
  static int kills = 0;
  static int money = 0;
  static String[] inventory = { "händer ", "unkown key " };
  static String[] vapen = { "infinity gauntlet", "svärd", "AK47", "kniv", "händer" };
  static String[] menu = { "1 - Attack ", "2 - Uppgraderingar ", "3 - Inventory ", "4 - Stats ", "5 - Avsluta" };
  static String[] store_items = { "healing 20 ", "infinity gauntlet 199999 ", "svärd 100 ", "kniv 300 ", "AK47 1500 " };
  static String currentWeapon = "kniv";
  static String[] namnli = {"Herman", "Thor", "Edwin", "Wincent", "Calle", "Lukas", "Mert", "Pouyan", "Kenan", "Kevan", "Vincent", "Usukh", "Sebastina", "Kevin", "Alex", "Benjamin", "Tobias", "Hadi", "Kasper", "Mohamed", "Jennifer", "Tim", "Valter", "Roe", "Axel", "Denise", "Jesper"};

  static int attackdmg() {
    if (currentWeapon == vapen[0]) {
      return 2000;
    } else if (currentWeapon == vapen[1]) {
      return 5;
    } else if (currentWeapon == vapen[2]) {
      return 10;
    } else if (currentWeapon == vapen[3]) {
      return 15;
    } else if (currentWeapon == vapen[4]) {
      return 3;
    } else {
      System.out.println("error");
    }
    return 0;
  }

  static void uppgraderingar() {
  }

  static void attack(float chans) {
      if ( (int)(Math.random() * 100) < chans ){
          System.out.println(enemyhp);
          System.out.println(enemyhp = enemyhp - Math.round(attackdmg()/(chans/100)));
          System.out.println(attackdmg());
      }
      else{
          System.out.println("Attacken missade");
      }
  }

  static void list(String[] li) {
    for (String i : li) {
      System.out.println(i);
    }
  }

  static void stats() {
    System.out.println("HP: " + hp);
    System.out.println("Attack: " + attackdmg());
    System.out.println("Motståndarens HP: " + enemyhp);
    System.out.println("Level: " + level);
    System.out.println("Kills: " + kills);
    System.out.println("Pengar: " + money);
}

  static void bracket1(String längd) {
    for (int i = 0; i < (9-längd.length()); i++) {
      System.out.print("_");
    }
  }
  
  static void bracket(String[] bracket) {
    System.out.println("_" + bracket[0]);
    bracket1(bracket[0]);
  }



  public static void main(String[] args) {
     Scanner tangentbord = new Scanner(System.in);
      while (true){
        System.out.println(namnli.length);
        System.out.println((int)(Math.random() * namnli.length));
        




      System.out.print("Välj läge:");
      System.out.println("Turnering, Oändlig");
      if (tangentbord.nextLine().equalsIgnoreCase("Turnering")){
        System.out.println("Du valde turnering");
        System.out.println("Välj  namn: ");
          String spelare  = new String();
          while (true) {
              String spelaretest = tangentbord.nextLine();
              if (spelaretest.length() > 10) {
                  System.out.println("Namnet får max vara 10 tecken");
                  System.out.print("Välj ett nytt namn: ");
              }
              else {
                  spelare = spelaretest;
                  break;
              }
          }
        String brackets[]  = new String[6];
          for (int i = 0; i < 6; i++) {
          while (true) {
            String namn = namnli[(int)(Math.random() * namnli.length)];
            if (Arrays.stream(brackets).anyMatch(namn::equals) || namn.equalsIgnoreCase(spelare)) {}
            else {
              brackets[i] = namn;
              break; }
            }
            System.out.println(brackets[2]);
          }
          System.out.println("Turneringen har börjat!");
          String[] bracket = {spelare, brackets[0], brackets[1], brackets[2], brackets[3], brackets[4], brackets[5], "Johan"};
          bracket(bracket);



          System.out.println("Vad vill du göra?");
          list(menu);
          if (tangentbord.nextInt()==1) {
                
          }
            
        }
        else {
            System.out.println("välj rimligt nummer");
        continue;
         }
        }
   


    }
  } 