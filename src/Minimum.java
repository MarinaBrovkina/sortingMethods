//Поиск минимального числа
public class Minimum {
    public static void main(String[] args) {
        int[] mas = {5, 7, 1, 8, 12, 2, 98, 4, 5};
        sort(mas);
    }

    public static void sort(int[] mas) {
        int num = mas[0];
        int index = 0;
        for (int i = 1; i < mas.length; i++) {
            if (mas[i] < num) {
                num = mas[i];
                index = i;
            }
        }
        System.out.println(num + " " + index);
    }
}
