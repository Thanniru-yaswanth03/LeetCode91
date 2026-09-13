// Last updated: 9/13/2026, 7:13:40 PM
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //create a List called ans 
        List<Boolean> ans = new ArrayList<>();  
        //find max ele in the arr
        int max =candies[0];
        for(int i=1;i<candies.length;i++){
            if(candies[i]>max){
                max= candies[i];
            }
        }
        //check condition if true then add true to ans array else false 
        for(int i =0; i<candies.length;i++){
            if(candies[i]+extraCandies >= max){
                ans.add(true);
            }else{
                ans.add(false);
            }
        }return ans;
        
    }
}