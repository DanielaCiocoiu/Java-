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

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid value");

        }

        long years = minutes / (365 * 60 * 24);
        long days = (minutes % (365 * 60 * 24) / 1440);


        System.out.println(minutes + " min = " + years + " ani " + " si " + days + " zile ");

    }

    public static void Sum() {
        int i;
        int sum = 0;
        int count = 0;
        for (i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                count++;

                sum += i;
                System.out.println("Numere gasite: " + i);
            }
            if (count == 5) {
                break;
            }
        }
        System.out.println("Sum " + sum);
    }

    public static boolean isOdd(int number) {

        if (number <= 0 || number % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }

    public static int sumOdd(int start, int end) {

            int sum = 0;
            if (start <= 0 || start > end) {
                return -1;
            }
            for (int i = start; i <= end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }


    }





