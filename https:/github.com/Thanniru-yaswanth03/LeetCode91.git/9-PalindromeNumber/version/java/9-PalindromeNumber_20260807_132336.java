// Last updated: 8/7/2026, 1:23:36 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3       int og =x;
4       int rev=0;
5       while(x>0){
6        int digit = x%10;
7        rev=rev*10+digit;
8        x/=10;
9       }if(og==rev){
10        return true;
11       }else{
12        return false;
13       }
14    }
15}
16