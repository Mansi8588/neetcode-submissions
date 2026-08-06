class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int ans =0;
        int i=0,j=people.length-1;
        while(i<=j){
            int rem = limit - people[j--];
            ans++;
            if(i<=j && rem >= people[i]){
                i++;

            }

        }
        return ans;
    }
}