import java.util.Random;

public class Ex1 {

    public static void main(String[] ars) {

        String s = "java2s".replace('a', 'Z').trim().concat("Aa");
        s.substring(0, 2);
        System.out.println(s);

//Write a program that creates and prints a random phone number of the form XXX-XXX-XXXX.
//Include the dashes in the output. Do not let the first three digits contain an 8 or 9 ,
// the second set of three digits is no greater than 742.
        Random rand = new Random();
        int first = rand.nextInt(8);
        int second = rand.nextInt(8);
        int third = rand.nextInt(8);
        int middle = rand.nextInt(742);
        int last = rand.nextInt(9999);
        String middleString;
        String lastString;

        middleString = Integer.toString(middle);
        lastString = Integer.toString(last);

        while (middleString.length() < 3) {
            middleString = "0" + middleString;
        }
        while (lastString.length() < 4) {
            lastString = "0" + lastString;

        }
        System.out.println(Integer.toString(first) + Integer.toString(second) + Integer.toString(second) + "-" + middle + "-" + last);
    }


}


