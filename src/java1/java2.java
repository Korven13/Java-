package java1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;



public class java2 {

    static String[] namnli = {"Herman", "Thor", "Edwin", "Wincent", "Calle", "Lukas", "Mert", "Pouyan", "Kenan", "Kevan", "Vincent", "Usukh", "Sebastina", "Kevin", "Alex", "Benjamin", "Tobias", "Hadi", "Kasper", "Mohamed", "Jennifer", "Tim", "Valter", "Roe", "Axel", "Denise", "Jesper"};

    static String bracketstreck(String längd) {
        String streck = "";
        for (int i = 0; i < (9-längd.length()); i++) {
          streck = streck + '_';
        }
        return(streck);
      }
      
      static void bracket(String[] bracket1,String[] bracket2,String[] bracket3,String bracket4, int runda) {
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

        System.out.println("          \\_" + bracket2[0] + bracketstreck(bracket2[0]) );

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

        System.out.println("          \\_" + bracket2[0] + bracketstreck(bracket2[0]) );

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

        System.out.println("          \\_" + bracket2[0] + bracketstreck(bracket2[0]) );

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

    public static void main(String[] args) {

        String[] bracket = {"spelare", "spelare2", "spelare3", "spelare4", "spelare5", "spelare6", "spelare7", "Johan"};
        String[] a = {"spelare", "spelare4", "spelare5", "Johan"};
        String[] b = {"spelare", "Johan"};
        String vinnare = "Johan";
        bracket(bracket, a, b, vinnare, 4);
        System.out.print("\033[H\033[2J");  
        bracket(bracket, a, b, vinnare, 4);
    }
    
}

