class Solution {
    public int romanToInt(String s) {
        int value = 0;
        char prev = 'a';
        for(int i = 0; i < s.length();i++)
        {
            switch(s.charAt(i))
            {
                case 'I':
                    value+=1;
                    prev = 'I';
                    break;
                case 'V':
                    value+=5;
                    if(prev == 'I')
                        value -= 2;
                    prev = 'V';
                    break;
                case 'X':
                    value+=10;
                    if(prev == 'I')
                        value -= 2;
                    prev = 'X';
                    break;
                case 'L':
                    value+=50;
                    if(prev == 'X')
                        value -= 20;
                    prev = 'L';
                    break;
                case 'C':
                    value+=100;
                    if(prev == 'X')
                        value -= 20;
                    prev = 'C';
                    break;
                case 'D':
                    value+=500;
                    if(prev == 'C')
                        value -= 200;
                    prev = 'D';
                    break;
                case 'M':
                    value+=1000;
                    if(prev == 'C')
                        value -= 200;
                    prev = 'M';
                    break;
            }
        }
        return value;
    }
}