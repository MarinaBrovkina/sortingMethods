import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int[] mas = {5, 7, 1, 8, 12, 2, 98, 4, 5};
        sort(mas);

    }

    public static void sort(int[] mas) {
        int temp = 0;
        boolean isSort = false;
        while (!isSort) {
            isSort = true;
            for (int i = 1; i < mas.length; i++) {
                if (mas[i] < mas[i - 1]) {
                    temp = mas[i];
                    mas[i] = mas[i - 1];
                    mas[i - 1] = temp;
                    isSort = false;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}

