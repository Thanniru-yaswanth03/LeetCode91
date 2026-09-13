// Last updated: 9/13/2026, 7:13:43 PM
class Solution {
    public int findNumbers(int[] nums) {
        //initialise count 
        int count =0;
        //use for loop to loop through the nums array 
        for(int i =0;i<nums.length;i++){
            //took length var and n equals to the index of nums arr  at each interation 
            int length=0;
            int n = nums[i];
            //if and only if the value is greater than 0 then while condition executes and i count length by keep dividing it with 10 and divide the lenght with 2 later on and increment the count if its even then i return the count
            while(n>0){
                n/=10;
                length++;
            }
            if(length %2 ==0){
                count++;
            }
        }return count;
        
    }
}