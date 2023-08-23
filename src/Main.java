public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();
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
        xArr += 2;
        System.out.println(arr[0] + ", " + xArr);
    }

    public static void task3() {
        System.out.println("Task 3 - Arr Ls2.");
        int[] rack = new int[4];
        rack[0] = 12;
        rack[1] = 9;
        rack[2] = 11;
        rack[3] = 10;
        int[] rack2 = new int[4];
        rack2[0] = 12;
        rack2[1] = 9;
        rack2[2] = 11;
        rack2[3] = 10;
        boolean rackAreEqual = true;
        rackAreEqual = rack.length == rack2.length;
        if (rackAreEqual) {
            for (int i = 0; i < rack.length; i++) {
                if (rack[i] != rack2[i]) {
                    rackAreEqual = false;
                }
            }
        }
        if (rackAreEqual) {
            System.out.println("Стеллажи одинаковые");
        } else {
            System.out.println("Стеллажи разные");
        }
    }

    public static void task4() {
        System.out.println("Task 4 Summ elements");
        int[] rack = {12, 9, 11, 10};
        int sum = 0;
        for (int index = 0; index < rack.length; index++) {
            sum = sum + rack[index];
        }
        System.out.println("Sum = " + sum);
    }

    public static void task5() {
        System.out.println("Task 5 Arr");
        int[] arr = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        boolean arraysAreEqual = true;
        arraysAreEqual = arr.length == arr2.length;
        if (arraysAreEqual) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != arr2[i]) {
                    arraysAreEqual = false;
                }
            }
        }
        if (arraysAreEqual) {
            System.out.println("Массивы одинаковые");
        } else {
            System.out.println("Массивы разные");
        }
    }
}