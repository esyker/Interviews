import java.util.HashMap;

//OFFICIAL
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> indexMap = new HashMap<Integer,Integer>();
        for(int i = 0; i < numbers.length; i++){
            Integer requiredNum = (Integer)(target - numbers[i]);
            if(indexMap.containsKey(requiredNum)){
                int toReturn[] = {indexMap.get(requiredNum), i};
                return toReturn;
            }

            indexMap.put(numbers[i], i);
        }
        return null;
    }
}

//BRUTE FORCE
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] idxs = new int[2];
    
        
        for(int i = 0; i< nums.length -1; i++)
        {   
            int numb = nums[i];
            int desired = target - numb;
            idxs[0] = i;
            boolean found = false;
            
            for(int j = i+1 ; j < nums.length ; j++)
            {
                if(nums[j]==desired)
                {
                    idxs[1] = j;
                    found = true;
                    break;
                }
            }
            if(found)
                break;
        }
        return idxs;
    }
}

//HASHMAP
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int [] idxs = new int[2];
        
        HashMap<Integer, Integer> twoSum = new HashMap<Integer, Integer>();
        
        
        for(int i = 0; i< nums.length; i++){
            twoSum.put(nums[i],i);    
        }
        
        /*for (Integer name: twoSum.keySet()) {
            String key = String.valueOf(name);
            String value = String.valueOf(twoSum.get(name));
            System.out.println(key + " " + value);
        }*/
        
        for(int i = 0; i< nums.length; i++)
        {   
            Integer myTarget = target-nums[i];
            Integer desired = twoSum.get(myTarget);
            /*
            System.out.println("myTarget"+" "+myTarget.toString());
            
            System.out.println("desired"+" "+desired.toString());*/
            if(desired!=null & desired != Integer.valueOf(i))
            {   
                idxs[0]=i;
                idxs[1]=desired;
                break;
            }
        }
        
        return idxs;
    }
}