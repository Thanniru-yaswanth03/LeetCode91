// Last updated: 9/5/2026, 8:14:23 PM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        //here what i did is created two vars alt and high and initialised them with 0 
4        int highest=0;
5        int altitude=0;
6        //and ran a for loop and added  altitude with every ele till loop ends and then 
7        for(int i=0;i<gain.length;i++){
8            altitude+=gain[i];
9            //here i checked whether my curr altitude is higher than the highest variable if it is then store it to return it later and its done 
10            if(altitude>highest){
11                highest=altitude;
12            }
13        }return highest;
14    }
15}