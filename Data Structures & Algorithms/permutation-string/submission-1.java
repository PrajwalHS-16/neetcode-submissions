class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if(s1.length()> s2.length()){
            return false;
        }
        int[] c1=new int[26];
        int[] c2=new int[26];
        for(int r=0;r<s1.length();r++){
            c1[s1.charAt(r)-'a']++;
            c2[s2.charAt(r)-'a']++;
        }
        int l=0;
        for(int r=s1.length();r<s2.length();r++){
            if(Arrays.equals(c1,c2)){
                return true;
            }
            c2[s2.charAt(r)-'a']++;

            c2[s2.charAt(l)-'a']--;
            l++;

        }
        return Arrays.equals(c1,c2);
    }
}