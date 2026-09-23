class Solution {
    public static boolean comparefreq(int arr1[],int arr2[]){
        for(int i =0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }
        int arr1[]=new int[26];
        
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            int index = ch-'a';
            arr1[index]++;
        }
       int j =0;
        int windowlength = s1.length();
        int arr2[]=new int[26];
        for( j=0;j<windowlength;j++){
            char ch2 = s2.charAt(j);
            int newindex = ch2 - 'a';
            arr2[newindex]++;
        }
        if(comparefreq(arr1,arr2)==true){
            return true;
        }
        while(j<s2.length()){
            char newchar = s2.charAt(j);
            int newcharindex = newchar-'a';
            arr2[newcharindex]++;
            int oldcharindex = j-windowlength;
            char ch3 = s2.charAt(oldcharindex);
            int newindex = ch3-'a';
            arr2[newindex]--;        
            if(comparefreq(arr1,arr2)==true){
                return true;
            }
            j++;
        }
        return false;
    }
}