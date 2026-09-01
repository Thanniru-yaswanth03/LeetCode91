// Last updated: 9/1/2026, 11:54:29 AM
1class Solution {
2    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
3        //create a List called ans 
4        List<Boolean> ans = new ArrayList<>();  
5        //find max ele in the arr
6        int max =candies[0];
7        for(int i=1;i<candies.length;i++){
8            if(candies[i]>max){
9                max= candies[i];
10            }
11        }
12        //check condition if true then add true to ans array else false 
13        for(int i =0; i<candies.length;i++){
14            if(candies[i]+extraCandies >= max){
15                ans.add(true);
16            }else{
17                ans.add(false);
18            }
19        }return ans;
20        
21    }
22}