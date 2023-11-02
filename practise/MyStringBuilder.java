//StringBuilder is a class for manipulation in strings  in java String are immutable however using StringBuilder class we can mutate them easily .

import java.util.*;

public class MyStringBuilder
{
    public static void main(String args[])
    {
      StringBuilder sc = new StringBuilder("Hassam");


      System.out.println(sc.charAt(0));
// 1
      sc.setCharAt(0, 'P');
      System.out.println(sc);
// 2
      sc.insert(0,'H');
      System.out.println(sc);
// 3
      sc.delete(1,2);  // second index not cout
      System.out.println(sc);

//4
    sc.append("k");
    sc.append("h");
    sc.append("a");
    sc.append("n");

    System.out.println(sc);
    }   
}