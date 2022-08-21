package chapter1;

public class Paycalculator {
    public static void main(String arg[]) {

        int[] arr = {1, 3, 8, 10, 4};
        for (int x = 0; x < arr.length; x++) {
            if (arr[(x+1)] > arr[x]) {
                int one = arr[x + 1];
                int two = arr[x];
                arr[x] = one;
                arr[(x+1)] = two;
            }
        }
        for (int x = 0; x < arr.length; x++) {
            System.out.print(arr[x]+"|");
            }
        }
    }

