class Solution {
public:
    int calPoints(vector<string>& operations) {

        stack<int> st;

        int i = 0;

        while (i < operations.size()) {

            if (operations[i] == "D") {

                int x = st.top();
                st.push(x * 2);

            }
            else if (operations[i] == "+") {

                int x = st.top();
                st.pop();

                int y = st.top();
                st.pop();

                int r = x + y;

                // Put the old values back
                st.push(y);
                st.push(x);

                // Push the new score
                st.push(r);
            }
            else if (operations[i] == "C") {

                st.pop();

            }
            else {

                // String → int
                st.push(stoi(operations[i]));
            }

            i++;
        }

        int ans = 0;

        while (!st.empty()) {
            ans += st.top();
            st.pop();
        }

        return ans;
    }
};