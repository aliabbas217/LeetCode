class Solution {
    public double average(int[] salary) {
        double sum = 0;
        int max = 0;
        int min = salary[0];
        for(int i = 0; i< salary.length; i++)
        {
            sum = sum + salary[i];
            if(salary[i] > max)
                max = salary[i];
            else if(salary[i] < min)
                min = salary[i];
        }
        return (sum - max - min)/(salary.length-2);
    }
}