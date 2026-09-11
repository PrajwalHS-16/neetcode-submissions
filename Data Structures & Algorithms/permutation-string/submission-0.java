class Solution {
    public boolean checkInclusion(String s1, String s2) {

        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String sorted = new String(chars);

        for(int i = 0; i <= s2.length() - s1.length(); i++) {

            String sub = s2.substring(i, i + s1.length());

            char[] subStr = sub.toCharArray();
            Arrays.sort(subStr);

            String sorted1 = new String(subStr);

            if(sorted1.equals(sorted)) {
                return true;
            }
        }

        return false;
    }
}