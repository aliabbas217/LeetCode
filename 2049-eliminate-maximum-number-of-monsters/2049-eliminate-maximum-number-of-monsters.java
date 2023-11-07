class Solution {
    public int eliminateMaximum(int[] dist, int[] speed) {
        float[] time = new float[dist.length];
        for(int i = 0; i < dist.length; i++){
            time[i] = (float)dist[i]/speed[i];
        }
        Arrays.sort(time);
        int toReturn = 0;
        for(int i = 0; i < time.length; i++){
            if(time[i]-i <= 0)
                break;
            toReturn++;
        }
        return toReturn;
    }
}