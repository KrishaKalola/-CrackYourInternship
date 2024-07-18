class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> h=new HashMap<>();
        int max=0;
        int result=0;
        for(int i=0;i<nums.length;i++){
            h.put(nums[i],1+h.getOrDefault(nums[i],0));
            if(h.get(nums[i])>max){
                result=nums[i];
                max=h.get(nums[i]);
            }
        } 
        return result;
    }
}