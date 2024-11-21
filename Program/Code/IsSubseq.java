class IsSubseq {
    public boolean isSubsequence(String s, String t) {
        // String[] sa = s.toCharArray();
        // String[] ta = t.toCharArray();
        int i=0;
        int j =0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==s.length()) return true;
        return false;
    }
}