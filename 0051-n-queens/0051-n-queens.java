class Solution {
    public static boolean issafetoplace(int rowidx,int colidx,char mat[][],int n){
        int newcolidx = colidx;
        while(newcolidx>=0){
            if(mat[rowidx][newcolidx]=='Q'){
                return false;
            }
            newcolidx--;
        }
        int newrowidx = rowidx;
         newcolidx = colidx;
         while(newrowidx<n && newcolidx>=0){
            if(mat[newrowidx][newcolidx]=='Q'){
                return false;
            }
            newrowidx++;
            newcolidx--;
         }        
         newrowidx = rowidx;
         newcolidx = colidx;
        while(newrowidx>=0 && newcolidx>=0){
            if(mat[newrowidx][newcolidx]=='Q'){
                return false;
            }
            newrowidx--;
            newcolidx--;
        }
        
        return true;

    }
    public static void solve(int n,char mat[][],List<List<String>> ans,int colidx){
       
       if(colidx>=n){
        List<String> temp = new ArrayList<>();
        for(int i=0;i<n;i++){
            temp.add(new String (mat[i]));

        }
        ans.add(temp);
        return;
       }
       for(int rowidx=0;rowidx<n;rowidx++){
         if(issafetoplace(rowidx,colidx,mat,n)){
           mat[rowidx][colidx]='Q';
           solve(n,mat,ans,colidx+1);
           mat[rowidx][colidx]='.';
         }
       }
    }
    public List<List<String>> solveNQueens(int n) {
        char mat[][]=new char[n][n];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                mat[i][j]='.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        
        
        int colidx=0;
        solve(n,mat,ans,colidx);
        return ans;

    }
}