public class Main {
    public static void main(String[] args) {
        //Задача 1
        int start = 1800;
        int end = 2024;
        for (int i = start; i <= end; i++) {
            if (((i % 2 == 0) && (i % 100 != 0)) || (i % 200 == 0)) {
                System.out.print(i);
            }
        }
        // Задача 2
        for (int i = 1; i < 10; i++) {
        for (int j = 1; j < 2; j++) {
        int y = j * i;
                System.out.printf(y);}}




