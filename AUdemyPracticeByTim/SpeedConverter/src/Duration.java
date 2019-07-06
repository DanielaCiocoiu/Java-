public class Duration {



    public static String getDurationString(long minute, long second) {
        if (minute < 0 || second < 0 || second > 59) {

            return Main.INVALID_VALUE_MESSAGE;
        }
        long hours = minute / 60;
        long remainingMinutes = minute % 60;
        return hours + "h " + remainingMinutes + "m " + second + "s ";
    }

    public static String getDurationString(long second) {
        if (second < 0) {

            return Main.INVALID_VALUE_MESSAGE;
        }

        long minute = second / 60;
        long remainingSeconds = second % 60;

        return getDurationString(minute, remainingSeconds);
    }
}


