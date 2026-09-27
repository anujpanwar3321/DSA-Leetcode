class Solution {
    public boolean rotateString(String s, String goal) {
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(int i =0;i<s.length();i++){
            char last = sb.charAt(sb.length()-1);
            int index = sb.length()-2;
            while(index>=0){
             sb.setCharAt(index+1,sb.charAt(index));
             index--;   
            }
            sb.setCharAt(0,last);
            if(sb.toString().equals(goal)){
                return true;
            }
        }
        return false;
    }
}