//10. Regular Expression Matching
class Solution {
    public boolean isMatch(String s, String p) {
        String kek = String.format("^%s$", p);
        if(s!=s.replaceAll(kek,""))
        {
            return true;
        }
        else
        {
            return false;
        }
        

    }
}