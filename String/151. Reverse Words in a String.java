class Solution {
    public String reverseWords(String s) {
        String [] w=s.trim().split("\\s+");
        String [] newString=new String[w.length];
        int j=0;
        for(int i=(w.length-1);i>=0;i--){
            newString[j]=w[i];
            j++;
        }
        String ans=String.join(" ",newString);
        return ans;
    }
}