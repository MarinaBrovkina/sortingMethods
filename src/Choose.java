import java.util.Arrays;

public class Choose {
    public static void main(String[] args) {
        int[] mas = {5, 7, 1, 8, 12, 2, 98, 4, 5};
        sort(mas);
    }

    public static void sort(int[] mas) {
        for (int step = 0; step < mas.length; step++) {
            int index = min(mas, step);
            int tmp = mas[step];
            mas[step] = mas[index];
            mas[index] = tmp;

        }
        System.out.println(Arrays.toString(mas));
    }

    public static int min(int[] mas, int start) {
        int minIndex = start;
        int minValue = mas[start];
        for (int i = start + 1; i < mas.length; i++) {
            if (mas[i] < minValue) {
                minValue = mas[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}
