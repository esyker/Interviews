import java.io.*;
import java.util.*;


class Solution {

  public static int calculateFibonnaci(int n)
  {
    if(n<2)
      return n;
    
    return calculateFibonnaci(n-1)+calculateFibonnaci(n-2);
  }

  public static void main(String[] args) {
    
    int value = calculateFibonnaci(30);
    System.out.println(value);
    
  }
}

//Tabulation Bottom-up
class Fibonacci {

    public int CalculateFibonacci(int n) {
      if (n==0) return 0;
      int dp[] = new int[n+1];
  
      //base cases
      dp[0] = 0;
      dp[1] = 1;
  
      for(int i=2; i<=n; i++)
        dp[i] = dp[i-1] + dp[i-2];
  
      return dp[n];
    }
  
    public static void main(String[] args) {
      Fibonacci fib = new Fibonacci();
      System.out.println("5th Fibonacci is ---> " + fib.CalculateFibonacci(5));
      System.out.println("6th Fibonacci is ---> " + fib.CalculateFibonacci(6));
      System.out.println("7th Fibonacci is ---> " + fib.CalculateFibonacci(7));
    }
}

//Memoization Top-Down
class Solution {

    public static int calculateFibonnaci(int n) {
      int memoize[] = new int[n+1];
      return CalculateFibonacciRecursive(memoize, n);
    }
  
    public static int CalculateFibonacciRecursive(int[] memoize, int n) {
      if(n < 2)
        return n;
  
      // if we have already solved this subproblem, simply return the result from the cache
      if(memoize[n] != 0)
        return memoize[n];
  
      memoize[n] = CalculateFibonacciRecursive(memoize, n-1) + CalculateFibonacciRecursive(memoize, n-2);
      return memoize[n];
    }
  
    public static void main(String[] args) {
      
      int value = calculateFibonnaci(30);
      System.out.println(value);
      
    }
  }