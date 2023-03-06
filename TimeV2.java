public class TimeV2 {
    private int secondssincemidnight;



    public TimeV2(int hours, int minutes, int seconds) {
        secondssincemidnight = hours * 3600 + minutes * 60 + seconds;
    }

    public int getHours() {
        return secondssincemidnight / 3600;
    }

    public int getMinutes() {
        return secondssincemidnight % 3600 / 60;
    }

    public int getSeconds() {
        return secondssincemidnight % 60 ;
    }

    public String toString() {
        String paddedminutes = getMinutes() < 10 ? "0" + getMinutes() : "" + getMinutes();
        String paddedseconds = getSeconds() < 10 ? "0" + getSeconds() : "" + getSeconds();
        return getHours() + ":" + paddedminutes + ":" + paddedseconds;
}

public static void main(String[] args) {
    TimeV2 time = new TimeV2(19, 2, 59);
        System.out.println(time);

        System.out.println("The time is " + time);
        System.out.println("The current hour is " + time.getHours());
        System.out.println("The current minute is " + time.getMinutes());
        System.out.println("The current second is " + time.getSeconds());

        String hour = "";
        String minute = "";
        Boolean pm = false;

        if (time.getHours() > 12) {
            hour = "" + (time.getHours() - 12);
            pm = true;
        }
        else {
            hour = "" + time.getHours();
        }
       System.out.println("The time in standard time is " + hour + ":" + String.format("%02d", time.getMinutes()) + (pm ? " pm" : " am"));
}

}