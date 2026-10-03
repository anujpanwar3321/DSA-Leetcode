class Solution {
    public int findComplement(int num) {
        StringBuilder sb = new StringBuilder();
        while(num>0){
            int ex = num%2;
            sb.append(ex);
            num=num/2;
        }
        sb.reverse();
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='1'){
                sb.setCharAt(i,'0');
            }
            else{
                sb.setCharAt(i,'1');
            }
        }
        int ans = Integer.parseInt(sb.toString(),2);
        return ans;
    }
}