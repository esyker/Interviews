class Solution {
    
    private boolean contains(char c, char[] array) {
        for (char x : array) {
            if (x == c) {
                return true;
            }
        }
        return false;
    }
    
    public boolean isValid(String s) {
        if(s.length()==1)
            return false;
        HashMap<Character,Character> stringmap = new HashMap<>();
        stringmap.put(')','(');
        stringmap.put('}','{');
        stringmap.put(']','[');
        
        char [] opening = {'{','(','['};

        
        char [] sarray = s.toCharArray();
        Stack <Character> inputstack = new Stack<>();

        for(char c : sarray){
            if(contains(c,opening))
            {
                inputstack.push(c);
            }
            else
            {   
                if(inputstack.empty())
                    return false;
                char expected = stringmap.get(c);
                char last = inputstack.pop();
                if(expected!=last)
                {
                    return false;
                }
            }
        }
        if(!inputstack.empty())
            return false;
        return true;
    }
}