package phoneBill;

import java.util.Scanner;

public class tricks {
    private static int grades[];
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String args[]){

        System.out.println("Enter the length of array : ");
        grades=new int[scanner.nextInt()];
        getgrades();

    }
    public static void getgrades(){
        for(int i=0;i< grades.length;i++){
            System.out.println("Please enter the grades : ");
            grades[i]=scanner.nextInt();
        }

    }
}
