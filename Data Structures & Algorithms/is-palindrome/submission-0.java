class Solution {
    public boolean isPalindrome(String s) {
        int first=0;
        
        String p=s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int last=p.length()-1;
        while(last>=first){
            if(p.charAt(first) != p.charAt(last)){
                return false;
            }
            first++;
            last--;
        }
        return true;
    }
}
