public class main {
    public static void main(String[] args) {
        Date date = new Date(12, 4, 2019);
        TimeV2 time = new TimeV2(19, 2, 59);
        System.out.println(date);
        System.out.println(time);

        System.out.println("The date is " + date);
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
