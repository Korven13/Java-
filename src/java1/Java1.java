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
  static int runda = 1;
  static String[] inventory = { "händer ", "unkown key " };
  static String[] inventoryf;
  static String[] vapen = { "infinity gauntlet", "svärd", "AK47", "kniv", "händer" };
  static String[] menu = { "1 - Starta runda ", "2 - Shop ", "3 - Inventory ", "4 - Stats ", "5 - Avsluta" };
  static String[] val = { "1 - Atackera ", "2 - Inventory ", "3 - Ducka " };
  static String[] attackc = { "1 - Simpel attack 75% ", "2 - Standard attack 50% ", "3 - Avancerad attack 33% ",
      "4 - Super attack 10% " };
  static String[] store_items = { "healing 20 ", "infinity gauntlet 199999 ", "svärd 100 ", "kniv 300 ", "AK47 1500 " };
  static String currentWeapon = "infinity gauntlet";

  static String[] namnli = { "Herman", "Thor", "Edwin", "Wincent", "Calle", "Lukas", "Mert", "Pouyan", "Kenan", "Kevan",
      "Vincent", "Usukh", "Sebastina", "Kevin", "Alex", "Benjamin", "Tobias", "Hadi", "Kasper", "Mohamed", "Jennifer",
      "Tim", "Valter", "Roe", "Axel", "Denise", "Jesper" };

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

  static int attack(float chans) {
    if ((int) (Math.random() * 100) < chans) {
      if ((enemyhp - Math.round(attackdmg() / (chans / 100))) > 0) {
        enemyhp = enemyhp - Math.round(attackdmg() / (chans / 100));
        System.out.println("Du gjorde " + Math.round(attackdmg() / (chans / 100)) + " skada på motståndaren");
        System.out.println("Motståndarens nya hp: " + enemyhp);
        return runda;
      } else {
        System.out.println("Du gjorde " + Math.round(attackdmg() / (chans / 100)) + " skada på motståndaren");
        System.out.println("Du besegrade motsåndaren");
        enemyhp = 100;
        return runda++;
      }
    } else {
      System.out.println("Attacken missade");
      return runda;
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

  static String bracketstreck(String längd) {
    String streck = "";
    for (int i = 0; i < (9 - längd.length()); i++) {
      streck = streck + '_';
    }
    return (streck);
  }

  static String[] bracket2;
  static String[] bracket3;
  static String vinnare;

  static void bracket(String[] bracket1, String[] bracket2, String[] bracket3, String bracket4, int runda) {
    if (runda == 1) {
      System.out.print("_" + bracket1[0]);
      System.out.println(bracketstreck(bracket1[0]));

      System.out.println("          \\____");

      System.out.print("_" + bracket1[1]);
      System.out.print(bracketstreck(bracket1[1]));
      System.out.println("/    \\");

      System.out.println("                \\____");

      System.out.print("_" + bracket1[2]);
      System.out.print(bracketstreck(bracket1[2]));
      System.out.println("      /    \\");

      System.out.println("          \\____/      \\");

      System.out.print("_" + bracket1[3]);
      System.out.print(bracketstreck(bracket1[3]));
      System.out.println("/            \\");

      System.out.println("                        \\_____");

      System.out.print("_" + bracket1[4]);
      System.out.print(bracketstreck(bracket1[4]));
      System.out.println("              /");

      System.out.println("          \\____        /");

      System.out.print("_" + bracket1[5]);
      System.out.print(bracketstreck(bracket1[5]));
      System.out.println("/    \\      /");

      System.out.println("                \\____/");

      System.out.print("_" + bracket1[6]);
      System.out.print(bracketstreck(bracket1[6]));
      System.out.println("      /");

      System.out.println("          \\____/");

      System.out.print("_" + bracket1[7]);
      System.out.print(bracketstreck(bracket1[7]));
      System.out.println("/");
    }

    else if (runda == 2) {
      System.out.print("_" + bracket1[0]);
      System.out.println(bracketstreck(bracket1[0]));

      System.out.println("          \\_" + bracket2[0] + bracketstreck(bracket2[0]));

      System.out.print("_" + bracket1[1]);
      System.out.print(bracketstreck(bracket1[1]));
      System.out.println("/          \\");

      System.out.println("                      \\____");

      System.out.print("_" + bracket1[2]);
      System.out.print(bracketstreck(bracket1[2]));
      System.out.println("            /    \\");

      System.out.println("          \\_" + bracket2[1] + bracketstreck(bracket2[1]) + "/      \\");

      System.out.print("_" + bracket1[3]);
      System.out.print(bracketstreck(bracket1[3]));
      System.out.println("/                  \\");

      System.out.println("                              \\_____");

      System.out.print("_" + bracket1[4]);
      System.out.print(bracketstreck(bracket1[4]));
      System.out.println("                    /");

      System.out.println("          \\_" + bracket2[2] + bracketstreck(bracket2[2]) + "        /");

      System.out.print("_" + bracket1[5]);
      System.out.print(bracketstreck(bracket1[5]));
      System.out.println("/          \\      /");

      System.out.println("                      \\____/");

      System.out.print("_" + bracket1[6]);
      System.out.print(bracketstreck(bracket1[6]));
      System.out.println("            /");

      System.out.println("          \\_" + bracket2[3] + bracketstreck(bracket2[3]) + "/");

      System.out.print("_" + bracket1[7]);
      System.out.print(bracketstreck(bracket1[7]));
      System.out.println("/");
    }

    else if (runda == 3) {
      System.out.print("_" + bracket1[0]);
      System.out.println(bracketstreck(bracket1[0]));

      System.out.println("          \\_" + bracket2[0] + bracketstreck(bracket2[0]));

      System.out.print("_" + bracket1[1]);
      System.out.print(bracketstreck(bracket1[1]));
      System.out.println("/          \\");

      System.out.println("                      \\_" + bracket3[0] + bracketstreck(bracket3[0]));

      System.out.print("_" + bracket1[2]);
      System.out.print(bracketstreck(bracket1[2]));
      System.out.println("            /          \\");

      System.out.println("          \\_" + bracket2[1] + bracketstreck(bracket2[1]) + "/            \\");

      System.out.print("_" + bracket1[3]);
      System.out.print(bracketstreck(bracket1[3]));
      System.out.println("/                        \\");

      System.out.println("                                    \\_____");

      System.out.print("_" + bracket1[4]);
      System.out.print(bracketstreck(bracket1[4]));
      System.out.println("                          /");

      System.out.println("          \\_" + bracket2[2] + bracketstreck(bracket2[2]) + "              /");

      System.out.print("_" + bracket1[5]);
      System.out.print(bracketstreck(bracket1[5]));
      System.out.println("/          \\            /");

      System.out.println("                      \\_" + bracket3[1] + bracketstreck(bracket3[1]) + "/");

      System.out.print("_" + bracket1[6]);
      System.out.print(bracketstreck(bracket1[6]));
      System.out.println("            /");

      System.out.println("          \\_" + bracket2[3] + bracketstreck(bracket2[3]) + "/");

      System.out.print("_" + bracket1[7]);
      System.out.print(bracketstreck(bracket1[7]));
      System.out.println("/");
    }

    else if (runda == 4) {
      System.out.print("_" + bracket1[0]);
      System.out.println(bracketstreck(bracket1[0]));

      System.out.println("          \\_" + bracket2[0] + bracketstreck(bracket2[0]));

      System.out.print("_" + bracket1[1]);
      System.out.print(bracketstreck(bracket1[1]));
      System.out.println("/          \\");

      System.out.println("                      \\_" + bracket3[0] + bracketstreck(bracket3[0]));

      System.out.print("_" + bracket1[2]);
      System.out.print(bracketstreck(bracket1[2]));
      System.out.println("            /          \\");

      System.out.println("          \\_" + bracket2[1] + bracketstreck(bracket2[1]) + "/            \\");

      System.out.print("_" + bracket1[3]);
      System.out.print(bracketstreck(bracket1[3]));
      System.out.println("/                        \\");

      System.out.println("                                    \\_" + bracket4 + "_");

      System.out.print("_" + bracket1[4]);
      System.out.print(bracketstreck(bracket1[4]));
      System.out.println("                          /");

      System.out.println("          \\_" + bracket2[2] + bracketstreck(bracket2[2]) + "              /");

      System.out.print("_" + bracket1[5]);
      System.out.print(bracketstreck(bracket1[5]));
      System.out.println("/          \\            /");

      System.out.println("                      \\_" + bracket3[1] + bracketstreck(bracket3[1]) + "/");

      System.out.print("_" + bracket1[6]);
      System.out.print(bracketstreck(bracket1[6]));
      System.out.println("            /");

      System.out.println("          \\_" + bracket2[3] + bracketstreck(bracket2[3]) + "/");

      System.out.print("_" + bracket1[7]);
      System.out.print(bracketstreck(bracket1[7]));
      System.out.println("/");
    }
  }

  static String[] brackets(String spelare) {
    String brackets[] = new String[6];
    for (int i = 0; i < 6; i++) {
      while (true) {
        String namn = namnli[(int) (Math.random() * namnli.length)];
        if (Arrays.stream(brackets).anyMatch(namn::equals) || namn.equalsIgnoreCase(spelare)) {
        } else {
          brackets[i] = namn;
          break;
        }
      }
      System.out.println(brackets[2]);
    }
    return brackets;
  }

  static void fight(Scanner tangentbord, String[] brackets, String motst) {
    System.out.println("Runda " + runda + " har börjat!");
    System.out.println("Du möter " + motst);
    int runda1 = runda;
    while (runda1 == runda) {

        System.out.println("Vad vill du göra?");
        list(val);
        int val1 = tangentbord.nextInt();
        if (val1 == 1) {
          list(attackc);
          int val2 = tangentbord.nextInt();
          if (val2 == 1) {
            attack(75);
          } else if (val2 == 2) {
            attack(50);
          } else if (val2 == 3) {
            attack(33);
          } else if (val2 == 4) {
            attack(10);
          }
        } else if (val1 == 2) {
          System.out.println("Pallar inte fixa");
        } else if (val1 == 3) {
          System.out.println("Pallar inte fixa");
        } else {
          System.out.println("Välj från alternativen");
        }
      }
    System.out.println("Slut på runda");
  }

  static String namn(Scanner tangentbord) {
    while (true) {
      String spelaretest = tangentbord.nextLine();
      if (spelaretest.length() > 10) {
        System.out.println("Namnet får max vara 10 tecken");
        System.out.print("Välj ett nytt namn: ");
      } else {
        return spelaretest;
      }
    }
  }

  static void runda(Scanner tangentbord, String[] brackets, String motst) {
 
    System.out.println("Vad vill du göra?");
        list(menu);
        int val0 = tangentbord.nextInt();
        if (val0 == 1) {
          fight(tangentbord, brackets, motst);
        }
        else if (val0 == 2) {
          System.out.println("pallar inte fixa");
        } 
        else if (val0 == 3) {
          System.out.println("pallar inte fixa");
        } 
        else if (val0 == 4) {
          System.out.println("pallar inte fixa");
        } 
        else if (val0 == 5) {
          System.out.println("Rundan avslutas");
        } 
        else {
        System.out.println("välj rimligt nummer");
      }
  }


  static String[] brackrand (String[] brackets, String spelare) {
    Random random = new Random();
    String[] bracket2 = {spelare, "2", "3", "Johan"};
    if (random.nextBoolean() == true) {
      bracket2[1] = brackets[1];
      if (random.nextBoolean() == true) {
        bracket2[2] = brackets[3];
      }
      else {
        bracket2[2] = brackets[4];
      }
    }

    else {
      bracket2[1] = brackets[2];
      if (random.nextBoolean() == true) {
        bracket2[2] = brackets[3];
      }
      else {
        bracket2[2] = brackets[4];
      }
    }
      return bracket2;
  }

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    Scanner tangentbord = new Scanner(System.in);

    while (true) {
      System.out.print("Välj läge:");
      System.out.println("Turnering, Oändlig");
      if (tangentbord.nextLine().equalsIgnoreCase("Turnering")) {
        System.out.println("Du valde turnering");
        System.out.print("Välj  namn: ");
        String spelare = namn(tangentbord);
        String[] brackets = brackets(spelare);
        String[] bracket1 = {spelare, brackets[0], brackets[1], brackets[2], brackets[3], brackets[4], brackets[5],
            "Johan"};
        String motst = brackets[0];
        System.out.print("\033[H\033[2J");
        System.out.println("Turneringen har börjat!");
        bracket(bracket1, bracket2, bracket3, vinnare, runda);

        runda(tangentbord, brackets, motst);
        bracket2 = (brackrand(brackets, spelare));

        System.out.println("Runda 2:");
        motst = bracket2[1];

        bracket(bracket1, bracket2, bracket3, vinnare, runda);
        runda(tangentbord, brackets, motst);

        System.out.println("Runda 3:");
        motst = "Johan";
        String[] bracket3 = {spelare, "Johan"};
        bracket(bracket1, bracket2, bracket3, vinnare, runda);
        runda(tangentbord, brackets, motst);

      System.out.print(runda);
    }

  }
  }
}