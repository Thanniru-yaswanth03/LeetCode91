// Last updated: 8/7/2026, 1:14:38 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        int rev=0;
4        int og=x;
5        while(x>0){
6            int digit = x%10;
7            rev=rev*10+digit;
8            x/=10;
9        }
10        if(og==rev){
11            return true;
12        }else{
13            return false;
14        }
15    }
16}
17
18
19