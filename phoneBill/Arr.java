package phoneBill;

import java.util.Arrays;
import java.util.Random;

public class Arr {
    static  public void main(String args[]){

        int[] tickets = new int[5];
        Random random = new Random();
        for(int i=0; i < 5;i++){
            int randomNum;
        do{
            randomNum=random.nextInt(69)+1;

        }while(search(tickets,randomNum));

            tickets[i]= randomNum;
        }
        Arrays.sort(tickets);

        printArr(tickets);

    }
    public static void printArr(int ticket[]){
        for(int i=0;i< ticket.length;i++){
            System.out.print(ticket[i]+"|");
        }
    }
    static public boolean search(int[] ticket,int rnNo){
        for(int value:ticket){
            if(value==rnNo){
                return true;
            }
        }
        return false;
    }
}
