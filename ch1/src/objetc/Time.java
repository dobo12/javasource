package objetc;

public class Time {
    private int hour;
    private int minute;
    private int second;

    // 시, 분, 초는 모두 0보다 크거나 같아야 한다.
    // 시의 범위는 0~23 분, 초의 범위는 0~59
    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {

        }
        this.hour = hour;
        return;

    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59)
            return;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

}
