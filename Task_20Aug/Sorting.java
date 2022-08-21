package Task_20Aug;

import java.lang.reflect.Array;
import java.util.Scanner;
// Program to sort an integer array in java
public class Sorting {
    public static void main(String args[]){
        int[] Array=GetArray();
        int[] SortedArray=SortArray(Array);
        PrintArray(SortedArray);
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
    public static int[] SortArray(int[] array){
        int[] arr = new int[array.length];
        int num=0;
        for(int z=0; z< array.length;z++ ) {
            int y=0;
            for (int x = 0; x < array.length; x++) {
                if (array[x] > y) {
                    y = array[x];
                    num=x;
                }
            }
            array[num]=0;
            arr[z]=y;
        }
        return arr;
    }
    public static void PrintArray(int[] array){
        for(int x=0;x< array.length;x++){
            System.out.print(array[x]+"|");
        }
    }

}
