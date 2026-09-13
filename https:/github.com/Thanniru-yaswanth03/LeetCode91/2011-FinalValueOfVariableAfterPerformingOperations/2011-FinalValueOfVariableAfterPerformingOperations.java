// Last updated: 9/13/2026, 7:13:13 PM
// class Solution {
//     public int finalValueAfterOperations(String[] operations) {
//         int val = 0;
//         for(int i =0; i<operations.length;i++){
//             if(operations[i].contains("+")){
//                 val+=1;
//             }else{
//                 val-=1;
//             }
//         }return val;
//     }
// }
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for (String op : operations) 
        {
            if (op.charAt(1) == '+') 
            {
                x++;
            } else
            {
                x--;
            }
        }
        
        return x;
    }
}
