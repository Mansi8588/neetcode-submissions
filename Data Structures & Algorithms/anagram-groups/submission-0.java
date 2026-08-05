class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp = new HashMap<>();
        List<List<String>> ans;

        for(String s:strs){
            char[] st = s.toCharArray();
            Arrays.sort(st);
             String a = new String(st);
            mp.putIfAbsent(a,new ArrayList<>());
            mp.get(a).add(s);
        }

        return new ArrayList<>(mp.values());

    }
}
