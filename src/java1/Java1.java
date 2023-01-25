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

  static int attack(int chans) {
    if (currentWeapon == vapen[0]) {
      if (  (int)(Math.random() * 100) < chans ){
          System.out.println(enemyhp);
          int enemyhp = enemyhp-100/(chans/100);
      }
      else{
          System.out.println("Attacken missade");
      }
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
    return 9592;
  }

  static String list(String[] li) {
    for (String i : li) {
      System.out.println(i);
    }
    return "";
    }

  static String stats() {
    System.out.println("HP: " + hp);
    System.out.println("Attack: " + attack());
    System.out.println("Motståndarens HP: " + enemyhp);
    System.out.println("Level: " + level);
    System.out.println("Kills: " + kills);
    System.out.println("Pengar: " + money);
    return "";
}
  
  
  public static void main(String[] args) {
     Scanner tangentbord = new Scanner(System.in);
     int chans = 33;
      if (  (int)(Math.random() * 100) < chans ){
          System.out.println(enemyhp);
          int enemyhp = enemyhp - 100/(chans/100);
      }
      else{
          System.out.println("Attacken missade");
     
  }
}
     (tangentbord.nextInt()==1) {
          System.out.println((int)(Math.random() * 10));
                System.out.println(attack(30));
            } 
      
      
      while (true){
    System.out.print("Välj läge:");
    System.out.println("Turnering, Oändlig");
    String hink1 = tangentbord.nextLine();
      if (hink1.equalsIgnoreCase("Turnering")){
        System.out.println("Du valde turnering");
        System.out.println("Välj ditt namn");
        String hink2 = tangentbord.nextLine();
        String[] namn = {"James", "Robert", "John", "Michael", "David","William","Joseph","Thomas","Charles","Christopher","Matthew","Anthony","Mark","Donald"};
        System.out.println("Välj hur många lag(jämt)");
        int hink3 = tangentbord.nextInt();
        if (hink3%2 == 0){
        String bracket[]  = new String[hink3*2];
            for (int i = (hink3*2-2); i >= 0; i--) {
            double num = (Math.round(Math.random()*10));
            int value1 = (int)Math.round(num);
            bracket[i] = namn[value1];
                System.out.println(bracket[i]);

            }
            
            
            System.out.println("Turneringen har börjat!");
            System.out.println("Vad vill du göra?");
            System.out.println(list(menu));
            if (tangentbord.nextInt()==1) {
                int enemyhp = enemyhp-
            }
            
        }
        else {
            System.out.println("välj rimligt nummer");
        continue;
         }
        }
   


    }
  } 
}