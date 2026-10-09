class Solution {
    public boolean containsDuplicate(int[] nums) {
        // 1 
        // 2
        // 3 
        // 1
        Set<Integer> set=new HashSet<>();
        for(int num:nums){
            if(set.contains(num)){
            return true;
            }
            set.add(num);

        }
        return false;
    }
}