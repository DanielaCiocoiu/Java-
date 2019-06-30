public class SpeedConverter {

    public static long toMillesPerHour(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid parameter: ");
            return -1;

        }
        return (long) Math.round(kilometersPerHour / 1.609344);


    }

    public static void printConversion(double kilometersPerHour) {

        if (kilometersPerHour < 0) {
            System.out.println("Invalid parameter: ");

        } else {
            long milesPerHour = toMillesPerHour(kilometersPerHour);
            System.out.println("XX km/h= " + kilometersPerHour + " = YY mi/h= " + milesPerHour);
        }

    }
}
