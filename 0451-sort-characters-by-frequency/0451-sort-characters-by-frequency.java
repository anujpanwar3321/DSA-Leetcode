class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        
        while(!map.isEmpty()){
            int maxval = Integer.MIN_VALUE;
            char maxkey = ' ';
          for(char key : map.keySet()){
            if(map.get(key)>maxval){
                maxval = map.get(key);
                maxkey = key;
            }
          }
          for(int j=0;j<maxval;j++){
           sb.append(maxkey);
          }
          map.remove(maxkey);
      
        }
        return sb.toString();

    }
}