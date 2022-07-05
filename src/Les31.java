import java.util.Arrays;

public class Les31 {
    public static void main(String[] arg) {
        int[] minScheat = new int[10];

        for (int i = 0; i < 10; i += 1) {
            minScheat[i] = Integer.MIN_VALUE;
        }
        System.out.println("Исходный массив:" + Arrays.toString(minScheat));

        minScheat[0] = 588;
        minScheat[3] = 888;

        System.out.println("Измененный массив:" + Arrays.toString(minScheat));
        int count=0;
        for (int k = 0; k < 10; k+=1) {
            if (minScheat[k] > Integer.MIN_VALUE) {
                count += 1;
            }
        }

        System.out.println("Количество значений, отличных от MIN_VALUE: " + count);
    }
}





