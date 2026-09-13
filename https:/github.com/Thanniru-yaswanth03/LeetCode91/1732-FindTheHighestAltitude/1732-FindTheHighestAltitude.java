// Last updated: 9/13/2026, 7:13:18 PM
class Solution {
    public int largestAltitude(int[] gain) {
        //here what i did is created two vars alt and high and initialised them with 0 
        int highest=0;
        int altitude=0;
        //and ran a for loop and added  altitude with every ele till loop ends and then 
        for(int i=0;i<gain.length;i++){
            altitude+=gain[i];
            //here i checked whether my curr altitude is higher than the highest variable if it is then store it to return it later and its done 
            if(altitude>highest){
                highest=altitude;
            }
        }return highest;
    }
}