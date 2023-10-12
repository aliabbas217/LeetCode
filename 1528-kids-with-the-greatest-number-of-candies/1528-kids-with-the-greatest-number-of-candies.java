class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        byte maxCandies = 0;
        for(int candy: candies)
            if(candy > maxCandies)
                maxCandies = (byte)candy;
        List<Boolean> toReturn = new ArrayList<>();
        for(int candy: candies)
            toReturn.add(candy+extraCandies >= maxCandies);
        return toReturn;
    }
}