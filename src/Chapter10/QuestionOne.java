package Chapter10;

public class QuestionOne {

    public static void main(String[] args) {

        //Create new times
        Time t1 = new Time();
        Time t2 = new Time(555550000);

        //Print out the times in a specific format
        System.out.println(t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.println(t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

    }

}

class Time{

    private long hour, minute, second;

    public Time(){

        this(0);

    }

    public Time(long elapsed){
        setTime(elapsed);
    }

    public Time(long second, long hour, long minute){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public long getHour() {
        return hour;
    }

    public long getMinute() {
        return minute;
    }

    public long getSecond() {
        return second;
    }

    /**
     * Calculate the time; may have an elapseTime offset
     * @param elapseTime
     */
    public void setTime(long elapseTime){

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        second = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        minute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        hour = totalHours % 24;

        if(elapseTime > 0){
            totalSeconds = elapseTime / 1000;
            second += totalSeconds % 60;
            totalMinutes = totalSeconds / 60;
            minute += totalMinutes % 60;
            totalHours = totalMinutes / 60;
            hour += totalHours % 24;
        }
    }
}
