class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = left; i <= right; i++)
        {
            if(isSelfDividing(i))
                list.add(i);
        }
        return list;
    }
    static boolean isSelfDividing(int num)
    {
        int digit;
        int num1 = num;
        do
        {
            digit = num1%10;
            if(digit == 0)
                return false;
            if(num%digit != 0)
                return false;
            num1 = num1/10;
        }
        while(num1 != 0);
        return true;
    }
}