public class Main {
    public static void main(String[] args) {

        task1();
        task2();/*
        task3();
        task4();
        task5();*/
    }

    public static void task1() {
        System.out.println("Task 1");
        int[] arr = new int[5];
        arr[0] = 15;
        System.out.println(arr[0]);
    }

    public static void task2() {
        System.out.println("Task 2");
        int[] arr = new int[5];
        arr[0] = 15;
        int xArr = arr[0];
        xArr+=2;
        System.out.println(arr[0] + ", " + xArr);
    }
}