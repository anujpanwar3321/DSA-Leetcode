class Solution {
    public char findTheDifference(String s, String t) {
        int arr[]=new int[26];
        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            int index = ch-'a';
            arr[index]++;
        }
        for(int j=0;j<s.length();j++){
            char ch1 = s.charAt(j);
            int index1 = ch1-'a';
            arr[index1]--;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]==1){
                char ans = (char)('a'+k);
                return ans;
            }
        }
        return ' ';
      
    }
}