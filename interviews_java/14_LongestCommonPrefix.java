class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null )
            return "";
        if(strs.length==1)
            return strs[0];
        for(int i =0;i<strs.length;i++)
            if(strs[i].isEmpty())
                return "";
        
        int count = 0;
        boolean end = false;
        for(int i = 0; ;i++){
            if(count>strs[0].length()-1)
            {
                break;
            }
            Character character = strs[0].charAt(count);
            for(int j=1;j<strs.length;j++)
            {
                if(count>strs[j].length()-1)
                {
                    end = true;
                    break;
                }
                if(Character.compare(strs[j].charAt(count),character)!=0)
                {
                    end = true;
                    break;
                }
            }
            if(end == true)
                break;
            else
                count+=1;
        }
        if(count==0)
            return "";
        else
            return strs[0].substring(0, count);   
    }
}