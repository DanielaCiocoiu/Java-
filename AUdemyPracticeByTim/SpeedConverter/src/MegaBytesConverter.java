public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid parameter: ");

        } else {
            int megaBytes = toMegaBytes(kiloBytes);
            System.out.println("XX KB = " + kiloBytes + " YY MB = " + toMegaBytes + "ZZ KB = ");
        }

    }

    public static int toMegaBytes(int kiloBytes) {

        if (kiloBytes < 0) {
            System.out.println("Invalid parameter: ");
            return -1;

        }
        return (int) (kiloBytes / 1024);

    }
}