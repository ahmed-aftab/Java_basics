package phoneBill;

public class Bill {
    String ID;
    int Basecost;
    int Totalmins;
    int Usedmins;
    public void overagecalc(){
        System.out.println("overage calc");

    }
    public void tax(){
        System.out.println("Tax");

    }

    public Bill(){
        ID="A";
        Basecost=0;
        Totalmins=0;
        Usedmins=0;
        System.out.println("default");
    }
    public Bill(String id){
        this.ID=id;
        Basecost=0;
        Totalmins=0;
        Usedmins=0;
        System.out.println("id only");
    }
    public Bill(String id,int Basecost,int Totalmins,int Usedmins){
        this.ID="id";
        this.Basecost=0;
        this.Totalmins=0;
        this.Usedmins=0;
        System.out.println("All");
    }


}
