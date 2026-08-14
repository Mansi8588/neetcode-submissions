class Solution {
    public boolean checkInclusion(String s1, String s2) {
        char[] ch = s1.toCharArray();

        Arrays.sort(ch);
        String s1c = new String(ch);

        int n=s1.length();
        int m=s2.length();

        if(n>m) return false;
        for(int i=0;i<=m-n;i++){
String sub= s2.substring(i,i+n);
char[] subc = sub.toCharArray();
Arrays.sort(subc);
String subn = new String(subc);
if(subn.equals(s1c)) return true;

        }
        return false;
    }
}
