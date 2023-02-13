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
  static int attackdmgnpc = 15;
  static String[] inventory = { "händer ", "unkown key " };
  static String[] inventoryf;
  static String[] vapen = { "Fat man", "svärd", "AK47", "kniv", "händer" };
  static String[] menu = { "1 - Starta runda ", "2 - Shop ", "3 - Inventory ", "4 - Stats "};
  static String[] val = { "1 - Atackera ", "2 - Inventory ", "3 - Ducka " };
  static String[] attackc = { "1 - Simpel attack 75% ", "2 - Standard attack 50% ", "3 - Avancerad attack 33% ",
      "4 - Super attack 10% " };
  static String[] store_items = { "healing 20 ", "Fat man 199999 ", "svärd 100 ", "kniv 300 ", "AK47 1500 " };
  static String currentWeapon = "svärd";
  static String[] namnli = { "Herman", "Thor", "Edwin", "Wincent", "Calle", "Lukas", "Mert", "Pouyan", "Kenan", "Kevan",
      "Vincent", "Usukh", "Sebastina", "Kevin", "Alex", "Benjamin", "Tobias", "Hadi", "Kasper", "Mohamed", "Jennifer",
      "Tim", "Valter", "Roe", "Axel", "Denise", "Jesper" };

  static int attackdmg() {
    if (currentWeapon == vapen[0]) {
      return 2000;
    } else if (currentWeapon == vapen[1]) {
      return 20;
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

  static int attack(float chans, String motst) {
    if ((int) (Math.random() * 100) < chans) {
      if ((enemyhp - Math.round(attackdmg() / (chans / 100))) > 0) {
        enemyhp = enemyhp - Math.round(attackdmg() / (chans / 100));
        System.out.print("\033[H\033[2J");
        System.out.println("Du gjorde " + Math.round(attackdmg() / (chans / 100)) + " skada på " + motst);
        System.out.println(motst + "s nya hp: " + enemyhp);
        System.out.println();
        return enemyhp;
      } else {
        enemyhp = enemyhp - Math.round(attackdmg() / (chans / 100));
        System.out.print("\033[H\033[2J");
        System.out.println("Du gjorde " + Math.round(attackdmg() / (chans / 100)) + " skada på " + motst);
        System.out.println("Du besegrade " + motst);
        return enemyhp;
      }
    } else {
      System.out.print("\033[H\033[2J");
      System.out.println("Attacken missade");
      System.out.println();
      return enemyhp;
    }
  }


  static int attacknpc(String motst) {
    float chans  = (int)(Math.random() * 100)+1;
    System.out.println(motst+" attackerar");
    vänta();
    if ((int) (Math.random() * 100) < chans) {
      if ((hp - Math.round(attackdmgnpc / (chans / 100))) > 0) {
        hp = hp - Math.round(attackdmgnpc / (chans / 100));
        System.out.println(motst + " gjorde " + Math.round(attackdmgnpc / (chans / 100)) + " skada på dig");
        System.out.println("Ditt nya hp: " + hp);
        System.out.println();
        return hp;
      } else {
        hp = hp - Math.round(attackdmgnpc / (chans / 100));
        System.out.println(motst + " gjorde " + Math.round(attackdmgnpc / (chans / 100)) + " skada på dig");
        System.out.println(motst + " besegrade dig");
        return hp;
      }
    } else {
      System.out.println("Attacken missade");
      System.out.println();
      return hp;
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

  static void bracket(String[] bracket1, String[] bracket2, String[] bracket3, String vinnare, int runda) {
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

      System.out.println("                                    \\_" + vinnare + "_");

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

  static void fight(Scanner tangentbord, String[] brackets, String motst, int runda) {
    System.out.print("\033[H\033[2J");
    System.out.println("Runda " + runda + " har börjat!");
    System.out.println("Du möter " + motst);
    while (enemyhp > 0 && hp > 0) {

        System.out.println("Vad vill du göra?");
        list(val);
        int val1 = tangentbord.nextInt();
        if (val1 == 1) {
          System.out.print("\033[H\033[2J");
          list(attackc);
          int val2 = tangentbord.nextInt();
          if (val2 == 1) {
            attack(75, motst);
            if (enemyhp <= 0) {
              continue;
            }
            attacknpc(motst);
          } else if (val2 == 2) {
            attack(50, motst);
            if (enemyhp <= 0) {
              continue;
            }
            attacknpc(motst);
          } else if (val2 == 3) {
            attack(33, motst);
            if (enemyhp <= 0) {
              continue;
            }
            attacknpc(motst);
          } else if (val2 == 4) {
            attack(10, motst);
            if (enemyhp <= 0) {
              continue;
            }
            attacknpc(motst);
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
    System.out.println();
    enemyhp = 100;
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

  static void runda(Scanner tangentbord, String[] brackets, String motst, int runda) {
    while (true) {
    System.out.println("Vad vill du göra?");
      list(menu);
        int val0 = tangentbord.nextInt();
        if (val0 == 1) {
          fight(tangentbord, brackets, motst, runda);
          break;
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
        else {
        System.out.println("välj rimligt nummer");
      }
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

  static void vänta1() {
    try
    {
        Thread.sleep(1000);
    }
    catch(InterruptedException ex)
    {
        Thread.currentThread().interrupt();
    }
  }

  static void vänta () {
    vänta1();
    for (int i = 0; i < 3; i++) {
    System.out.print(".");
    vänta1();
    }
    System.out.println();
  }  

  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    Scanner tangentbord = new Scanner(System.in);
    while (true) {
      int runda = 1;
      hp=100;
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

        runda(tangentbord, brackets, motst, runda);
        bracket2 = (brackrand(brackets, spelare));
          if (hp <= 0) {
            System.out.println("Du åkte ut ur första rundan");
            tangentbord.nextLine();
            continue;
          }
        runda=2;
        System.out.println("Runda 2:");
        hp = 100;
        motst = bracket2[1];

        bracket(bracket1, bracket2, bracket3, vinnare, runda);
        runda(tangentbord, brackets, motst, runda);
        if (hp <= 0) {
          System.out.println("Du kom till andra rundan");
          tangentbord.nextLine();
          continue;
        }
        runda=3;
        System.out.println("Runda 3:");
        hp = 100;
        attackdmgnpc = 1000;
        enemyhp = 1000;
        motst = "Johan";
        String[] bracket3 = {spelare, "Johan"};
        bracket(bracket1, bracket2, bracket3, vinnare, runda);
        runda(tangentbord, brackets, motst, runda);
        if (hp <= 0) {
          System.out.println("Du åkte ut i finalen");
          tangentbord.nextLine();
          attackdmgnpc = 15;
          enemyhp = 100;
          continue;
        }
        runda=4;
        vinnare = spelare;
        bracket(bracket1, bracket2, bracket3, vinnare, runda);
        System.out.println("Grattis du vann!");
        System.out.println();
        tangentbord.nextLine();
        attackdmgnpc = 15;
        enemyhp = 100;
    }
    else {
      System.out.println("Turnering är det edna läget som finns ¯\\_(o.o)_/¯");
    }
  }
  }
}