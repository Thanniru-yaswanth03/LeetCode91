// Last updated: 8/31/2026, 3:02:52 PM
1class Solution {
2    public int findNumbers(int[] nums) {
3        //initialise count 
4        int count =0;
5        //use for loop to loop through the nums array 
6        for(int i =0;i<nums.length;i++){
7            //took length var and n equals to the index of nums arr  at each interation 
8            int length=0;
9            int n = nums[i];
10            //if and only if the value is greater than 0 then while condition executes and i count length by keep dividing it with 10 and divide the lenght with 2 later on and increment the count if its even then i return the count
11            while(n>0){
12                n/=10;
13                length++;
14            }
15            if(length %2 ==0){
16                count++;
17            }
18        }return count;
19        
20    }
21}