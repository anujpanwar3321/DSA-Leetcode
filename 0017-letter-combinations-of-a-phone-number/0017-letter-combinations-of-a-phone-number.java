class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        String mobile[] = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        int index=0;
       
        StringBuilder sb =new StringBuilder();
         solve(digits,index,mobile,sb,ans);
        return ans;
    }
    public static void solve(String digits,int index,String mobile[],StringBuilder sb,List<String> ans){
          if(index>=digits.length()){
            ans.add(sb.toString());
            return;
          }
          int value = digits.charAt(index)-'0';
          String currans = mobile[value];
          for(int j=0;j<currans.length();j++){
            char currchar = currans.charAt(j);
            sb.append(currchar);
            solve(digits,index+1,mobile,sb,ans);
            sb.deleteCharAt(sb.length()-1);
          }

        }
        
    }
