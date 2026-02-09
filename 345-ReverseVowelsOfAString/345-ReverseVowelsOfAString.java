// Last updated: 09/02/2026, 13:56:58
class Solution {
    private boolean vowels(char c){
        return "aeiouAEIOU".indexOf(c) !=-1;
    }
    public String reverseVowels(String s) {
        char c[]=s.toCharArray();
        int l=0;
        int r=c.length-1;
        while(l<r){
            while(l<r && !vowels(c[l])){
            l++;
            }
            while(l<r && !vowels(c[r])){
                r--;
            }
            if(l<r){
                char t=c[l];
                c[l]=c[r];
                c[r]=t;
            }



            l++;
            r--;
        }
        return new String(c);
    }
}