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
        String sNum = String.valueOf(num);
        for(int i = 0; i < sNum.length(); i++)
        {
            if((sNum.charAt(i) == '0'))
                return false;
            if((num % Integer.parseInt(String.valueOf(sNum.charAt(i))) != 0 ))
                return false;
        }
        return true;
    }
}