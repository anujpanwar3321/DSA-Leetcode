class Solution {
    public boolean isAnagram(String s, String t) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            int index = ch-'a';
            arr1[index]++;
        }
        for(int j =0;j<t.length();j++){
            char ch2 = t.charAt(j);
            int index2 = ch2-'a';
            arr2[index2]++;
        }
        for(int k=0;k<arr1.length;k++){
            if(arr1[k]!=arr2[k]){
                return false;
            }
        }
        return true;   
    }
}