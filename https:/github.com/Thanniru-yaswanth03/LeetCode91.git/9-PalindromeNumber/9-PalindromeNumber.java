// Last updated: 8/4/2026, 11:49:40 AM
class Solution {
    public boolean isPalindrome(int x) {
        int og=x;
        int rev=0;
        while(x>0){
            int dig=x%10;
            rev=rev*10+dig;
            x/=10;
        }
        if(og==rev){
            return true;
        }else{
            return false;
        }     
    }
}