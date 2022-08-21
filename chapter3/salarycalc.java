package chapter3;

import java.util.Scanner;

public class salarycalc {
    public static void main(String args[]){
        int salary=1000;
        int bonus=250;
        System.out.println("enter hours worked");
        Scanner scan = new Scanner(System.in);
        int hours=scan.nextInt();

        while(hours>20 || hours<1){
            System.out.println("Pagal wagal ho gye ho kaa.Chaloo phir se enter kro. \n Hours: ");
            hours=scan.nextInt();
        }
        scan.close();
        if(hours>10){
            salary=salary+bonus;
        }
        System.out.println("Salary : "+ salary);


    }
}
