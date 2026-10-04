class Solution {
public:

   bool safe(int r,int c,vector<string>& q){
     
     for(int i=0;i<c;i++){
        if(q[r][i]=='Q') return false;
     }

     for(int i=r-1,j=c-1;i>=0 && j>=0 ; i--,j-- ){
        if(q[i][j]=='Q'){
            return false;
        }

     }

     for(int i=r+1,j=c-1;i<q.size()&& j>=0 ; i++,j--){
       if(q[i][j]=='Q'){
        return false;
       }
     }
     return true;

   }
    vector<vector<string>> solveNQueens(int n) {
        
        vector<vector<string>> ans ;
        vector<string> board(n,string(n,'.'));
        solve(0,ans,board);
        return ans;
    }

    void solve(int c,vector<vector<string>>& ans,vector<string>& board){
      if(c==board.size()){
        ans.push_back(board);
        return;
      }
        

        for(int r=0;r<board.size();r++){
            if(safe(r,c,board)){
            board[r][c]='Q';
            solve(c+1,ans,board);
            board[r][c]='.';
            }
        }

    }
};








