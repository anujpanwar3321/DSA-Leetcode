class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
     HashMap<Character,Integer>  map=new HashMap<>();
     for(int i =0;i<magazine.length();i++){
        char ch = magazine.charAt(i);
        map.put(ch,map.getOrDefault(ch,0)+1);
     }   
     for(int j =0;j<ransomNote.length();j++){
        char ch1 = ransomNote.charAt(j);
        if(map.containsKey(ch1)==false){
            return false;
        }
        else{
            map.put(ch1,map.get(ch1)-1);
        }
     }
     for(Character key:map.keySet()){
        if(map.get(key)<0){
            return false;
        }
     }
     return true;
    }
}