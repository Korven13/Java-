package java1;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.Random;
import java.util.Scanner;



public class java2 {

    static String[] namnli = {"Herman", "Thor", "Edwin", "Wincent", "Calle", "Lukas", "Mert", "Pouyan", "Kenan", "Kevan", "Vincent", "Usukh", "Sebastina", "Kevin", "Alex", "Benjamin", "Tobias", "Hadi", "Kasper", "Mohamed", "Jennifer", "Tim", "Valter", "Roe", "Axel", "Denise", "Jesper"};
    static String[] menu = { "1 - Starta runda ", "2 - Shop ", "3 - Inventory ", "4 - Stats ", "5 - Avsluta" };
    static String[] val = { "1 - Atackera ", "2 - Inventory ", "3 - Ducka "};

    static void list(String[] li) {
      for (String i : li) {
        System.out.println(i);
      }
    }

    public static void main(String[] args) {
      Scanner tangentbord = new Scanner(System.in);

      while (true) {
        int atk = (int)(Math.random() * 3) + 1;
        System.out.println(atk);
      }
    }
    
}

