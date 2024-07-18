class Solution {
    public int subarraySum(int[] nums, int k) {
        int a=0;
  for(int x=0;x<nums.length;x++){
      int sum=0;
      for(int y=x;y<nums.length;y++){
       sum=sum+nums[y];
      if(sum==k){
         a++;
      }}
  }   
  return a;   
    }
}