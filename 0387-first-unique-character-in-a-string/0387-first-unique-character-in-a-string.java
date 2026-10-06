class Solution {
    public int firstUniqChar(String s) {
        int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = ch-'a';
            arr[index]++;
        }
        for(int j=0;j<s.length();j++){
            char ch1 = s.charAt(j);
            int index1 = ch1-'a';
            if(arr[index1]==1){
                return j;
            }
        }
        return -1;
    }
}