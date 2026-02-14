class Solution {
    public int countTime(String time) {
        int hours =1;
        int minutes=1;

        char h1=time.charAt(0);
        char h2=time.charAt(1);

        if(h1=='?' && h2=='?') hours=24;
        else if(h1=='?'){
            hours=(h2<='3')?3:2;
        }
        else if(h2=='?'){
            hours=(h1=='2')?4:10;
        }

        char m1=time.charAt(3);
        char m2=time.charAt(4);

        if(m1=='?'&&m2=='?') minutes=60;
        else if(m1=='?'){
            minutes=6;
        }
        else if(m2=='?'){
            minutes=10;
        }

        return hours*minutes;
    }
}
