// Last updated: 09/02/2026, 13:57:21
class Solution {
    public int[] plusOne(int[] digits) {
       boolean carry=false;
       for(int i=digits.length-1;i>=0;i--){
        digits[i]++;
        if(digits[i]>9){
            carry=true;
            digits[i]=0;
        }else{
            return digits;
        }
       } 
       digits=new int [digits.length+1];
       digits[0]=1;
       return digits;
    }
   

    }
