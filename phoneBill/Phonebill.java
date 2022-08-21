package phoneBill;

public class Phonebill {
    public static void main(String args[]){
        Bill bill1 = new Bill();
        Bill bill2 = new Bill("Bass ho gyi j");
        Bill bill3 = new Bill("a",34,2,6);
        bill3.tax();
        System.out.println("change se pehle: "+bill1.ID );
        bill1.ID="YOU";
        System.out.println((bill2.ID+"\n   change k baad: "+bill1.ID ));

    }

}
