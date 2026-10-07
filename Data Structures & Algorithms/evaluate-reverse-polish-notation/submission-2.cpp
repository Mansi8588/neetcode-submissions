class Solution {
public:
    int evalRPN(vector<string>& tokens) {
        stack<int> st;
        int n=tokens.size();

        st.push(stoi(tokens[0]));
          int i=1;
        while(i<n){
            if(tokens[i]=="+"){
                int x=st.top();
                st.pop();
                int y=st.top();
                st.pop();
                st.push(x+y);
            }
            else if(tokens[i]=="-"){
                int x=st.top();
                st.pop();
                int y=st.top();
                st.pop();
                st.push(y-x);

            }
            else if(tokens[i]=="*")
            {
                int x=st.top();
                st.pop();
                int y=st.top();
                st.pop();
                st.push(x*y);
            }
            else if(tokens[i]=="/"){
                 int x=st.top();
                st.pop();
                int y=st.top();
                st.pop();
                st.push(y/x);
            }
            else{
                st.push(stoi(tokens[i]));
            }
            i++;

        }
        return st.top();
        
    }
};
