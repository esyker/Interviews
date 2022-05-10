/*Given a string s, find the length of the longest substring without repeating characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.*/

//Brute Force Solution
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)
            return s.length();
        char [] sarray = s.toCharArray();
        int currlen=0;
        int maxlen = -1;
		HashSet<Character> valid = new HashSet<>();
        for(int i = 0; i<s.length();i++)
        {   
            currlen = 0;
            valid.clear();//clear the hashset
            for(int j = i; j<s.length(); j++)
            {
                if(!valid.contains(sarray[j])){
                    valid.add(sarray[j]);
                    currlen++;
                }
                else{
                    break;
                }
            }
            if(currlen>maxlen)
                maxlen = currlen;//Check at the end of the trasversal if the maximum length was exceeded
        }
        return maxlen;
    }
}

//Skip repeated characters
class Solution {
    private int compareChars(char c1, char c2)
    {
        return c1-c2;
    }
    
    private int getLastPosAfterIndex(String s, int index)
    {   

        int i = index+1;
        char comp =s.charAt(index);//Get the char at the position
        for(;i<s.length()-1;i++)
        {   
            //System.out.println(comp+" "+s.charAt(i)+" "+s.charAt(i+1));
            if(compareChars(comp,s.charAt(i+1))!=0 || compareChars(comp,s.charAt(i))!=0)
            {   
               break;
            }
        }
        return i;
    }
    
    public int lengthOfLongestSubstring(String s) {
        if(s.length()==0 || s.length()==1)
            return s.length();
        char [] sarray = s.toCharArray();
        int i=0, j=0;
        int currlen=0;
        int maxlen = -1;
        HashSet<Character> valid = new HashSet<>();
        for(i = 0; i<s.length();)
        {   
            currlen = 0;
            valid.clear();
            //System.out.println(i+" "+maxlen);
            for(j = i; j<s.length(); j++)
            {
                if(!valid.contains(sarray[j])){
                    valid.add(sarray[j]);
                    currlen++;
                }
                else{
                    break;
                }
            }
            if(currlen>maxlen)
                maxlen = currlen;
            i=getLastPosAfterIndex(s,i);
            
        }
        
        return maxlen;
    }
}

//Sliding Window