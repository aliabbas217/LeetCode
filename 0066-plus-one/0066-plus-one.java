class Solution {
    public int[] plusOne(int[] digits)
    {
        byte remainder = 0;
        byte totalDigits = (byte)digits.length;
        digits[totalDigits -1] += 1; 
        for(int i = totalDigits-1; i >= 0; i--)
        {
            digits[i] = digits[i] + remainder;
            remainder = (byte)(digits[i]/10);
            digits[i] = digits[i]%10;
            if(remainder == 0)
                break;
            if(i == 0)
            {
                int[] newDigits = new int[totalDigits+1];
                newDigits[0] = remainder;
                for(int j = 1; j <= totalDigits;j++)
                {
                    newDigits[j] = digits[j-1];
                }
                digits = newDigits;
            }
        }
        return digits;
    }
}