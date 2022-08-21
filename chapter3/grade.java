package chapter3;

import java.util.Scanner;

public class grade {
    public static void main(String args[]){
        String message;
        System.out.println("Enter the letter grade");
        Scanner scan = new Scanner(System.in);
        String grade = scan.next();
        scan.close();
        switch(grade){
            case "A": message="Excellent";break;
            case "B": message="Good";break;
            case "F": message="bad scene";break;
            default:message="ja ja tur ja";break;

        }
        System.out.println(message);
    }
}
