
public class Solution {

    public static int simpleArraySum(int[] ar) {
        int sum = 0;
        int len = ar.length;

        for (int i = 0; i < len; i++) {
            sum += ar[i];
        }
        return sum;
    }
}
