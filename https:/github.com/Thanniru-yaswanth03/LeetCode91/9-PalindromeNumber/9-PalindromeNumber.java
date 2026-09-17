// Last updated: 9/17/2026, 3:16:06 PM
class Solution {
    public boolean isPalindrome(int x) {
       int og =x;
       int rev=0;
       while(x>0){
        int digit = x%10;
        rev=rev*10+digit;
        x/=10;
       }if(og==rev){
        return true;
       }else{
        return false;
       }
    }
}
