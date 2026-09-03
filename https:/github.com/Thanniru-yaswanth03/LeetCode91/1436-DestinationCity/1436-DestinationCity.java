// Last updated: 9/3/2026, 2:36:45 PM
1class Solution {
2    public String destCity(List<List<String>> paths) {
3        //what i did here is created a hashset called sources and then using a loop i added sources means left side cities to the hashset 
4        HashSet<String> sources= new HashSet<>();
5        for(int i=0;i<paths.size();i++){
6            sources.add(paths.get(i).get(0));
7        }
8        //and using another loop i stored all my destinations like right side cities in a string called destination and then i compared them to souces like if my dest city is in the sources then it wont be my destination if it isnt there in the sources then that will be my final destinatin W bey 
9        for(int i=0;i<paths.size();i++){
10            String destination=paths.get(i).get(1);
11            if(!sources.contains(destination)){
12                return destination;
13            }
14        }
15        //here its the edge case like return an empty string atleast bro if u got nothing to return coz i need ts so return a empty "" string as an edge case 
16        return "";
17        
18    }
19}