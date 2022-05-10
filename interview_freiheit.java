import java.io.*;
import java.util.*;

// Reverse a sentence
// 
// Input: „TODAY IS FRIDAY"
           012345678901234
// Output: "FRIDAY IS TODAY“
//
// Rules:
// - no execution of the code
// - no reallocation of memory
// - no strings / lists, only arrays of chars

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */


 // "" "A" "AA" "AAA" "A A" "AA A"
 // "Today  is Today" "   Today is Friday"


class Solution {

  public static void copyToNewArray(char [] inputarray, int arraylen, char [] newArray ,int left, int right, int increment)
  { 
    int sequencelen = right-left; // -7
    for(int i = 0; i<sequencelen; i++) left = 15; newArray[9]= inputarray[]
    {
      newArray[arraylen+1-left+i-increment]= inputarray[left+i-1-increment];
    }
  }

  //newArray
  //TODAY -> left = 0; right = 6     15-0+0
  //FRIDAY -> left = 15; right = 8     
  0123456789012345
             TODAY
  public static String reverseString(String input){
    char [] inputarray = input.toCharArray();
    char [] newArray = new char[inputarray.length];
    int len = inputarray.length; // 15
    int left = 0;
    int right = len; // 15
    int leftlimit = left+1; // 1
    int rightlimit = right-1; // 14
    boolean foundLeft = false;
    boolean foundRight = false;
    int finalRight=len;
    int finalLeft = 0;

    while(left<right & leftlimit<len/2)
    {
      if(inputarray[leftlimit]!=' ') O
      { 
        while(inputarray[leflimit+1]<len&& inputarray[leflimit+1]!=' ')
          leftlimit++;
      }
      else
        foundLeft = true;
      if(inputarray[rightlimit]!=' ')y
      {
        rightlimit--;8
      }
      else
        foundRight = true;
      if(foundLeft & foundRight)
      { 
        copyToNewArray(inputarray, len, newArray, left, leftlimit,-1);0, 6, len = 15
        copyToNewArray(inputarray, len, newArray, right, rightlimit,+1);
        left = leftlimit+1;
        right = rightlimit-1;
        finalRight = rightlimit;
        finalLeft = leftlimit;
      }
      
    }
    copyToNewArray(inputarray, len, newArray, finalLef,finalRight,+1;
    return new String(newArray);
}
    
  

  public static void main(String[] args) {
    String input = "Today is Friday";
    System.out.println(reverseString(input));
  }
}
