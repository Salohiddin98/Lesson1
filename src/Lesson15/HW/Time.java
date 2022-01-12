package Lesson15.HW;

public class Time {
    static void Timer(){
        int hour=0,minute=0,second;

        HOUR:
        while (hour<6){

            MINUTE:
        do {
            if (hour>1 && minute%10==0){
                break HOUR;
            }
                second=0;
                while (second<=59){

                if (second*hour>minute){
                    minute++;
                    continue MINUTE;
                }
                    System.out.println(hour+":"+minute+":"+second);
                    second++;
                }
                minute++;
        }
        while (minute<=59);
        minute=0;

            hour++;
        }

    }

    public static void main(String[] args) {
        Timer();
    }
}
