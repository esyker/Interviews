import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  public static String reverseStringArray(String s){
    int len = s.length();
    char [] sarray = s.toCharArray();
    for(int i = 0; i<len/2;i++)
    {
      System.out.println(i);
      char aux = sarray[i];
      sarray[i]=sarray[len-i-1];
      sarray[len-i-1]= aux;
    }
    return new String(sarray);
  }

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());

    for (String string : strings) {
      System.out.println(string);
      System.out.println(string.length());
      System.out.println(reverseStringArray(string));
      //System.out.println(reverseStringStringBuffer(string));
    }

  }
}
