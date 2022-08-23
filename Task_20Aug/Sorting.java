package Task_20Aug;

import java.lang.reflect.Array;
import java.util.Scanner;
// Program to sort an integer array in java
public class Sorting {
    public static void main(String args[]){
        int[] Array=GetArray();
        int[] SortedArray=SortArray(Array);
//        int[] SortedArray2=SortArray2(Array);
        System.out.println("Sorted Array 1: ");
        PrintArray(SortedArray);
//        System.out.println("Sorted Array 2: ");
//        PrintArray(SortedArray2);
    }
    public static int[] GetArray(){
        System.out.println("Please enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int ArrSize = scanner.nextInt();
        int[] arr = new int[ArrSize];
        for(int x=0;x<ArrSize;x++){
            System.out.println("Enter integer "+(x+1)+" : ");
            arr[x]=scanner.nextInt();
        }
        return arr;
    }
    public static int[] SortArray(int[] array) {
        int num = 0;
        for (int j = 0; j <= 10; j++){
            for (int z = 0; z < (array.length - 1); z++) {
                if (array[z + 1] < array[z]) {
                    num = array[z];
                    array[z] = array[z + 1];
                    array[z + 1] = num;
                }
            }
        }
        return array;
    }
    public static void PrintArray(int[] array){
        for(int x=0;x< array.length;x++){
            System.out.print(array[x]+"|");
        }
    }
    public static int[] SortArray2(int[] array) {
        int x=0;
        for (int j = 0; j < array.length; j++){
            int num = array[j];
            for (int z = j+1; z < (array.length); z++) {
                if (array[z] < num) {
                    num = array[z];
                    x = z;
                }

            }
                    array[x]=array[j];
                    array[j] = num;




        }
        return array;
    }

}
