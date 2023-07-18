import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LargestNumber {

    public static String largestNumber(int[] num) {
        int n = num.length;
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.toString(num[i]);
        }
        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String a, String b) {
                String order1 = a + b;
                String order2 = b + a;
                return order2.compareTo(order1);
            }
        });
        if (arr[0].equals("0")) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = scanner.nextInt();
        System.out.println(largestNumber(arr));
    }
}
