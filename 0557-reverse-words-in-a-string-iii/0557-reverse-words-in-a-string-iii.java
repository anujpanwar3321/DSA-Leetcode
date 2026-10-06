class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int i =0;
        while(i<s.length()){
            int j=i;
            while( j<s.length() && s.charAt(j)!=' '){
                j++;
            }
            sb.append(s.substring(i,j));
            sb.reverse();
            ans.append(sb);
            sb.setLength(0);
           if(j < s.length()) {
            ans.append(' ');
           }
            i=j+1;

        }
        return ans.toString();
    }
}