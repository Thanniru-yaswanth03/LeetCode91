// Last updated: 8/4/2026, 11:50:17 AM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int og=x;
4        int rev=0;
5        while(x>0){
6            int dig=x%10;
7            rev=rev*10+dig;
8            x/=10;
9        }
10        if(og==rev){
11            return true;
12        }else{
13            return false;
14        }     
15    }
16}