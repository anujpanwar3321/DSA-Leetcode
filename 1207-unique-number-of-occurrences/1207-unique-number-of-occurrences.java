class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> map1 = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key1 = arr[i];
            map1.put(key1,map1.getOrDefault(key1,0)+1);
        }
        for(Integer key: new ArrayList<>(map1.keySet())){
            int var = map1.get(key);
            map1.remove(key);
            if(map1.containsValue(var)){
                return false;
            }
        }
        return true;
    }

}