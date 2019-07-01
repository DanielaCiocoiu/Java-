public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid parameter: ");
            return;
        }
        int MB = 1024;

        System.out.println(kiloBytes + " KB =  " + (kiloBytes / MB) + " MB and " + (kiloBytes % MB) + " KB" );


    }
}


