class Solution {
    public int[] plusOne(int[] digits) {
        int[] result= new int[digits.length+1];
     for(int i=digits.length-1;i>=0;i--){
        int sum = digits[i] + 1;
        int modulo = sum % 10;
        if(modulo!=0){
            digits[i]=sum;
           return digits;
        }else{
            digits[i]=0;
        }
     }
    result[0]=1;
    //   for(int i=0;i<result.length;i++){
    //     result[i]=digits[i];
    //   }
    //    result[0]=1;
    
     return result;
}
}
