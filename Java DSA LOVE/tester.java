import java.io.*;
import java.util.*;

public class tester {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.nextLine();
      System.out.print(s);
      Scanner scanner = new Scanner(s);
      System.out.println(scanner.nextLine());//it considers s as String as a whole without es. sequences
      System.out.println("");
      String p =" Rishabh \n kumar \n panthri";
      Scanner sc1 = new Scanner(p);
      while(sc1.hasNextLine())
      {
        System.out.println(sc1.nextLine());
      }
      System.out.println("");
      String t = "\n";
      Scanner sc2 = new Scanner(t);
      System.out.println(sc2.hasNextLine());
      System.out.println(sc2.hasNextLine());
      System.out.println(sc2.hasNextLine());
      System.out.println(sc2.hasNextLine());
      String k = "Rishabh\nkumar panthri";
      Scanner scf =new Scanner(k);
      System.out.print(scf.next());
      System.out.print(scf.next());
    }
  }